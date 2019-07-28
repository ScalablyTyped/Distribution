package typings.adone.adoneNs.mathNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LowHighBits extends _Longable {
  /**
    * The high (signed) 32 bits of the long
    */
  var high: Double
  /**
    * The low (signed) 32 bits of the long
    */
  var low: Double
}

object LowHighBits {
  @scala.inline
  def apply(high: Double, low: Double): LowHighBits = {
    val __obj = js.Dynamic.literal(high = high, low = low)
  
    __obj.asInstanceOf[LowHighBits]
  }
}

