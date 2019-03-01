package typings
package aliDashOssLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bucket extends js.Object {
  var bucket: java.lang.String
  var res: aliDashOssLib.aliDashOssMod.OSSNs.NormalSuccessResponse
}

object Anon_Bucket {
  @scala.inline
  def apply(bucket: java.lang.String, res: aliDashOssLib.aliDashOssMod.OSSNs.NormalSuccessResponse): Anon_Bucket = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bucket")(bucket)
    __obj.updateDynamic("res")(res)
    __obj.asInstanceOf[Anon_Bucket]
  }
}

