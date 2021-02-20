package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides methods to access the cell style name for a condition in a conditional format.
  * @see com.sun.star.sheet.TableConditionalEntry
  */
@js.native
trait XSheetConditionalEntry extends XInterface {
  
  /** returns the name of the cell style that is used when the condition is fulfilled. */
  var StyleName: String = js.native
  
  /** returns the name of the cell style that is used when the condition is fulfilled. */
  def getStyleName(): String = js.native
  
  /** sets the name of the cell style that is used when the condition is fulfilled. */
  def setStyleName(aStyleName: String): Unit = js.native
}
object XSheetConditionalEntry {
  
  @scala.inline
  def apply(
    StyleName: String,
    acquire: () => Unit,
    getStyleName: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setStyleName: String => Unit
  ): XSheetConditionalEntry = {
    val __obj = js.Dynamic.literal(StyleName = StyleName.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getStyleName = js.Any.fromFunction0(getStyleName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setStyleName = js.Any.fromFunction1(setStyleName))
    __obj.asInstanceOf[XSheetConditionalEntry]
  }
  
  @scala.inline
  implicit class XSheetConditionalEntryMutableBuilder[Self <: XSheetConditionalEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetStyleName(value: () => String): Self = StObject.set(x, "getStyleName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetStyleName(value: String => Unit): Self = StObject.set(x, "setStyleName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStyleName(value: String): Self = StObject.set(x, "StyleName", value.asInstanceOf[js.Any])
  }
}
