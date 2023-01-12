package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** gives access to the text in a control. */
trait XTextArea
  extends StObject
     with XInterface {
  
  /** returns the text lines as a single string with line separators. */
  val TextLines: String
  
  /** returns the text lines as a single string with line separators. */
  def getTextLines(): String
}
object XTextArea {
  
  inline def apply(
    TextLines: String,
    acquire: () => Unit,
    getTextLines: () => String,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XTextArea = {
    val __obj = js.Dynamic.literal(TextLines = TextLines.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getTextLines = js.Any.fromFunction0(getTextLines), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XTextArea]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XTextArea] (val x: Self) extends AnyVal {
    
    inline def setGetTextLines(value: () => String): Self = StObject.set(x, "getTextLines", js.Any.fromFunction0(value))
    
    inline def setTextLines(value: String): Self = StObject.set(x, "TextLines", value.asInstanceOf[js.Any])
  }
}
