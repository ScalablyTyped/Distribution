package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** gives access to the value and formatting of a pattern field. */
trait XPatternField
  extends StObject
     with XInterface {
  
  /** returns the currently set string value of the pattern field. */
  var String: java.lang.String
  
  /** returns the currently set pattern mask. */
  def getMasks(EditMask: js.Array[String], LiteralMask: js.Array[String]): Unit
  
  /** returns the currently set string value of the pattern field. */
  def getString(): String
  
  /** returns whether the format is currently checked during user input. */
  def isStrictFormat(): Boolean
  
  /** sets the pattern mask. */
  def setMasks(EditMask: String, LiteralMask: String): Unit
  
  /** determines if the format is checked during user input. */
  def setStrictFormat(bStrict: Boolean): Unit
  
  /** sets the string value of the pattern field. */
  def setString(Str: String): Unit
}
object XPatternField {
  
  inline def apply(
    String: String,
    acquire: () => Unit,
    getMasks: (js.Array[String], js.Array[String]) => Unit,
    getString: () => String,
    isStrictFormat: () => Boolean,
    queryInterface: `type` => Any,
    release: () => Unit,
    setMasks: (String, String) => Unit,
    setStrictFormat: Boolean => Unit,
    setString: String => Unit
  ): XPatternField = {
    val __obj = js.Dynamic.literal(String = String.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getMasks = js.Any.fromFunction2(getMasks), getString = js.Any.fromFunction0(getString), isStrictFormat = js.Any.fromFunction0(isStrictFormat), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setMasks = js.Any.fromFunction2(setMasks), setStrictFormat = js.Any.fromFunction1(setStrictFormat), setString = js.Any.fromFunction1(setString))
    __obj.asInstanceOf[XPatternField]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XPatternField] (val x: Self) extends AnyVal {
    
    inline def setGetMasks(value: (js.Array[String], js.Array[String]) => Unit): Self = StObject.set(x, "getMasks", js.Any.fromFunction2(value))
    
    inline def setGetString(value: () => String): Self = StObject.set(x, "getString", js.Any.fromFunction0(value))
    
    inline def setIsStrictFormat(value: () => Boolean): Self = StObject.set(x, "isStrictFormat", js.Any.fromFunction0(value))
    
    inline def setSetMasks(value: (String, String) => Unit): Self = StObject.set(x, "setMasks", js.Any.fromFunction2(value))
    
    inline def setSetStrictFormat(value: Boolean => Unit): Self = StObject.set(x, "setStrictFormat", js.Any.fromFunction1(value))
    
    inline def setSetString(value: String => Unit): Self = StObject.set(x, "setString", js.Any.fromFunction1(value))
    
    inline def setString(value: String): Self = StObject.set(x, "String", value.asInstanceOf[js.Any])
  }
}
