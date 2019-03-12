package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides methods to access the cell style name for a condition in a conditional format.
  * @see com.sun.star.sheet.TableConditionalEntry
  */
trait XSheetConditionalEntry
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** returns the name of the cell style that is used when the condition is fulfilled. */
  var StyleName: java.lang.String
  /** returns the name of the cell style that is used when the condition is fulfilled. */
  def getStyleName(): java.lang.String
  /** sets the name of the cell style that is used when the condition is fulfilled. */
  def setStyleName(aStyleName: java.lang.String): scala.Unit
}

object XSheetConditionalEntry {
  @scala.inline
  def apply(
    StyleName: java.lang.String,
    acquire: () => scala.Unit,
    getStyleName: () => java.lang.String,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setStyleName: java.lang.String => scala.Unit
  ): XSheetConditionalEntry = {
    val __obj = js.Dynamic.literal(StyleName = StyleName, acquire = js.Any.fromFunction0(acquire), getStyleName = js.Any.fromFunction0(getStyleName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setStyleName = js.Any.fromFunction1(setStyleName))
  
    __obj.asInstanceOf[XSheetConditionalEntry]
  }
}

