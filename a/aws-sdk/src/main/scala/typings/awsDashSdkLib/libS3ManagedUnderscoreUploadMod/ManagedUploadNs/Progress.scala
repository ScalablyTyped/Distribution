package typings
package awsDashSdkLib.libS3ManagedUnderscoreUploadMod.ManagedUploadNs

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("loaded")(loaded)
    __obj.updateDynamic("total")(total)
    __obj.asInstanceOf[Progress]
  }
}

