package typings.adone.adoneNs.INs.datetimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MSDOSFormat extends js.Object {
  /**
    * an unsigned 16-bit integer represents MS-DOS date
    */
  var date: Double
  /**
    * an unsigned 16-bit integer represents MS-DOS time
    */
  var time: Double
}

object MSDOSFormat {
  @scala.inline
  def apply(date: Double, time: Double): MSDOSFormat = {
    val __obj = js.Dynamic.literal(date = date, time = time)
  
    __obj.asInstanceOf[MSDOSFormat]
  }
}

