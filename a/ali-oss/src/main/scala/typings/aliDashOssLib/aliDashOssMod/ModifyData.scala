package typings
package aliDashOssLib.aliDashOssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyData extends js.Object {
   //  object last modified GMT string
  var etag: java.lang.String
  var lastModified: java.lang.String
}

object ModifyData {
  @scala.inline
  def apply(etag: java.lang.String, lastModified: java.lang.String): ModifyData = {
    val __obj = js.Dynamic.literal(etag = etag, lastModified = lastModified)
  
    __obj.asInstanceOf[ModifyData]
  }
}

