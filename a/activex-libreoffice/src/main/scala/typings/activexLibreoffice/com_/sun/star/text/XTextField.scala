package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is the base interface for all text fields.
  *
  * A text field is embedded in text and expands to a sequence of characters.
  * @see TextField
  */
trait XTextField
  extends StObject
     with XTextContent {
  
  /**
    * @param bShowCommand if `TRUE` the command of the field will be returned
    * @returns the display string of the text field either as the command of the field or as the output string.
    */
  def getPresentation(bShowCommand: Boolean): String
}
object XTextField {
  
  inline def apply(
    Anchor: XTextRange,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    attach: XTextRange => Unit,
    dispose: () => Unit,
    getAnchor: () => XTextRange,
    getPresentation: Boolean => String,
    queryInterface: `type` => Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit
  ): XTextField = {
    val __obj = js.Dynamic.literal(Anchor = Anchor.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), attach = js.Any.fromFunction1(attach), dispose = js.Any.fromFunction0(dispose), getAnchor = js.Any.fromFunction0(getAnchor), getPresentation = js.Any.fromFunction1(getPresentation), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener))
    __obj.asInstanceOf[XTextField]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XTextField] (val x: Self) extends AnyVal {
    
    inline def setGetPresentation(value: Boolean => String): Self = StObject.set(x, "getPresentation", js.Any.fromFunction1(value))
  }
}
