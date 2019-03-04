package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XSecondAxisTitleSupplier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  val SecondXAxisTitle: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape
  val SecondYAxisTitle: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape
  def getSecondXAxisTitle(): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape
  def getSecondYAxisTitle(): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape
}

object XSecondAxisTitleSupplier {
  @scala.inline
  def apply(
    SecondXAxisTitle: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape,
    SecondYAxisTitle: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape,
    acquire: js.Function0[scala.Unit],
    getSecondXAxisTitle: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape],
    getSecondYAxisTitle: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XSecondAxisTitleSupplier = {
    val __obj = js.Dynamic.literal(SecondXAxisTitle = SecondXAxisTitle, SecondYAxisTitle = SecondYAxisTitle, acquire = acquire, getSecondXAxisTitle = getSecondXAxisTitle, getSecondYAxisTitle = getSecondYAxisTitle, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XSecondAxisTitleSupplier]
  }
}

