package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.statusNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies an upper and lower margin.
  * @since OOo 2.0
  */
trait UpperLowerMargin extends js.Object {
  /** specifies a lower margin in 1/100th mm. */
  var Lower: scala.Double
  /** specifies a upper margin in 1/100th mm. */
  var Upper: scala.Double
}

object UpperLowerMargin {
  @scala.inline
  def apply(Lower: scala.Double, Upper: scala.Double): UpperLowerMargin = {
    val __obj = js.Dynamic.literal(Lower = Lower, Upper = Upper)
  
    __obj.asInstanceOf[UpperLowerMargin]
  }
}

