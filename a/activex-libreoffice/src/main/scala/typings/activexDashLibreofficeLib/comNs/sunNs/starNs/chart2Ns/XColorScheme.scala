package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XColorScheme
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * returns the default color for the nth data series.
    *
    * This may be a system wide color or a color coming from a color scheme.
    *
    * Usually there exist a fixed number of default colors. This method should always return a valid Color. If the index (i) is higher than the number of
    * default colors (n), the method should return the modulus (i mod n), i.e., the colors should repeat in a cyclic way.
    * @param nIndex The index of the series. This is used to obtain the correct default color.
    */
  def getColorByIndex(nIndex: scala.Double): activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
}

object XColorScheme {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    getColorByIndex: js.Function1[scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XColorScheme = {
    val __obj = js.Dynamic.literal(acquire = acquire, getColorByIndex = getColorByIndex, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XColorScheme]
  }
}

