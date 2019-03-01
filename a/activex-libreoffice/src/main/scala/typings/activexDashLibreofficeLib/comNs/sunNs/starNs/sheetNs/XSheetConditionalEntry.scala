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
    acquire: js.Function0[scala.Unit],
    getStyleName: js.Function0[java.lang.String],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setStyleName: js.Function1[java.lang.String, scala.Unit]
  ): XSheetConditionalEntry = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("StyleName")(StyleName)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getStyleName")(getStyleName)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("setStyleName")(setStyleName)
    __obj.asInstanceOf[XSheetConditionalEntry]
  }
}

