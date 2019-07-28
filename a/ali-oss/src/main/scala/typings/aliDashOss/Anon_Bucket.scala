package typings.aliDashOss

import typings.aliDashOss.aliDashOssMod.NormalSuccessResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bucket extends js.Object {
  var bucket: String
  var res: NormalSuccessResponse
}

object Anon_Bucket {
  @scala.inline
  def apply(bucket: String, res: NormalSuccessResponse): Anon_Bucket = {
    val __obj = js.Dynamic.literal(bucket = bucket, res = res)
  
    __obj.asInstanceOf[Anon_Bucket]
  }
}

