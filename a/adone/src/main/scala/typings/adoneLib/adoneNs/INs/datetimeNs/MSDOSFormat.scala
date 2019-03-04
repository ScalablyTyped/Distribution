package typings
package adoneLib.adoneNs.INs.datetimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MSDOSFormat extends js.Object {
  /**
    * an unsigned 16-bit integer represents MS-DOS date
    */
  var date: scala.Double
  /**
    * an unsigned 16-bit integer represents MS-DOS time
    */
  var time: scala.Double
}

object MSDOSFormat {
  @scala.inline
  def apply(date: scala.Double, time: scala.Double): MSDOSFormat = {
    val __obj = js.Dynamic.literal(date = date, time = time)
  
    __obj.asInstanceOf[MSDOSFormat]
  }
}

