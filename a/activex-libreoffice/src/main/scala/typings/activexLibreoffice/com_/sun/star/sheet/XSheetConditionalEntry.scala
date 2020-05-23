package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides methods to access the cell style name for a condition in a conditional format.
  * @see com.sun.star.sheet.TableConditionalEntry
  */
trait XSheetConditionalEntry extends XInterface {
  /** returns the name of the cell style that is used when the condition is fulfilled. */
  var StyleName: String
  /** returns the name of the cell style that is used when the condition is fulfilled. */
  def getStyleName(): String
  /** sets the name of the cell style that is used when the condition is fulfilled. */
  def setStyleName(aStyleName: String): Unit
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
}

