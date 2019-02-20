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

