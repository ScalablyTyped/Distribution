package typings.awsDashSdk.libS3ManagedUnderscoreUploadMod.ManagedUpload

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Progress extends js.Object {
  var loaded: Double
  var total: Double
}

object Progress {
  @scala.inline
  def apply(loaded: Double, total: Double): Progress = {
    val __obj = js.Dynamic.literal(loaded = loaded, total = total)
  
    __obj.asInstanceOf[Progress]
  }
}

