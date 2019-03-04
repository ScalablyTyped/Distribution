package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes a single data value, including the error
  *
  * This struct is currently used nowhere.
  * @deprecated Deprecated
  */
trait ChartDataValue extends js.Object {
  /** highest possible error value. */
  var HighError: scala.Double
  /** lowest possible error value. */
  var LowError: scala.Double
  /** value by itself. */
  var Value: scala.Double
}

object ChartDataValue {
  @scala.inline
  def apply(HighError: scala.Double, LowError: scala.Double, Value: scala.Double): ChartDataValue = {
    val __obj = js.Dynamic.literal(HighError = HighError, LowError = LowError, Value = Value)
  
    __obj.asInstanceOf[ChartDataValue]
  }
}

