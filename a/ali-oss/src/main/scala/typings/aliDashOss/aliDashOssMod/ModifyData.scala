package typings.aliDashOss.aliDashOssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyData extends js.Object {
   //  object last modified GMT string
  var etag: String
  var lastModified: String
}

object ModifyData {
  @scala.inline
  def apply(etag: String, lastModified: String): ModifyData = {
    val __obj = js.Dynamic.literal(etag = etag, lastModified = lastModified)
  
    __obj.asInstanceOf[ModifyData]
  }
}

