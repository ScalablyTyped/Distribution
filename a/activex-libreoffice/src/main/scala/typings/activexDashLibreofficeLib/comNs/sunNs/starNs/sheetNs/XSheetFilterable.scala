package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents something that can be filtered using an {@link XSheetFilterDescriptor} .
  * @see com.sun.star.sheet.XSheetFilterableEx
  */
trait XSheetFilterable
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * creates a filter descriptor.
    * @param bEmpty if set to `TRUE` , creates an empty filter descriptor. If set to `FALSE` , fills the filter descriptor with previous settings of the curre
    */
  def createFilterDescriptor(bEmpty: scala.Boolean): XSheetFilterDescriptor
  /**
    * performs a filter operation, using the settings of the passed filter descriptor.
    * @param xDescriptor the settings for the filter operation.
    */
  def filter(xDescriptor: XSheetFilterDescriptor): scala.Unit
}

