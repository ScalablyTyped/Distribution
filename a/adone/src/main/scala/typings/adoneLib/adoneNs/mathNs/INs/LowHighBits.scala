package typings
package adoneLib.adoneNs.mathNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LowHighBits extends _Longable {
  /**
    * The high (signed) 32 bits of the long
    */
  var high: scala.Double
  /**
    * The low (signed) 32 bits of the long
    */
  var low: scala.Double
}

object LowHighBits {
  @scala.inline
  def apply(high: scala.Double, low: scala.Double): LowHighBits = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("high")(high)
    __obj.updateDynamic("low")(low)
    __obj.asInstanceOf[LowHighBits]
  }
}

