package typings
package awsDashSdkLib.libRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Progress extends js.Object {
  var loaded: scala.Double
  var total: scala.Double
}

object Progress {
  @scala.inline
  def apply(loaded: scala.Double, total: scala.Double): Progress = {
    val __obj = js.Dynamic.literal(loaded = loaded, total = total)
  
    __obj.asInstanceOf[Progress]
  }
}

