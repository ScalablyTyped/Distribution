package typings.activexLibreoffice.com_.sun.star.util

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This interface is used to encode an arbitrary String into a escaped form.
  *
  * The escaped form is chosen to be suitable for use with other interfaces of the object or service providing this interface.
  *
  * Any characters or character sequences that are not compatible with any naming rules or restrictions must be replaced by an escaped form, that complies
  * to these rules.
  *
  * The transformation should preserve all traits of the string that are generally respected by the service. For example, the case of a string may be lost
  * after encoding and then decoding, if the service generally is case insensitive.
  *
  * Other than that the encoding is one-to-one and can be reversed. The encoding should try to preserve as much as possible of the original string, to
  * keep human-readable input human-friendly where possible. Strings that already conform to the naming conventions should be left unchanged or minimally
  * modified.
  */
trait XStringEscape
  extends StObject
     with XInterface {
  
  /** encodes an arbitrary string into an escaped form compatible with some naming rules. */
  def escapeString(aString: String): String
  
  /** decodes an escaped string into the original form. */
  def unescapeString(aEscapedString: String): String
}
object XStringEscape {
  
  inline def apply(
    acquire: () => Unit,
    escapeString: String => String,
    queryInterface: `type` => Any,
    release: () => Unit,
    unescapeString: String => String
  ): XStringEscape = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), escapeString = js.Any.fromFunction1(escapeString), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), unescapeString = js.Any.fromFunction1(unescapeString))
    __obj.asInstanceOf[XStringEscape]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XStringEscape] (val x: Self) extends AnyVal {
    
    inline def setEscapeString(value: String => String): Self = StObject.set(x, "escapeString", js.Any.fromFunction1(value))
    
    inline def setUnescapeString(value: String => String): Self = StObject.set(x, "unescapeString", js.Any.fromFunction1(value))
  }
}
