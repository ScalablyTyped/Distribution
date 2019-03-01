package typings
package aliDashOssLib.aliDashOssMod.OSSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Channel extends js.Object {
  var Description: java.lang.String
  var LastModified: java.lang.String
  var Name: java.lang.String
  var PlayUrls: js.Array[java.lang.String]
  var PublishUrls: js.Array[java.lang.String]
  var Status: java.lang.String
}

object Channel {
  @scala.inline
  def apply(
    Description: java.lang.String,
    LastModified: java.lang.String,
    Name: java.lang.String,
    PlayUrls: js.Array[java.lang.String],
    PublishUrls: js.Array[java.lang.String],
    Status: java.lang.String
  ): Channel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Description")(Description)
    __obj.updateDynamic("LastModified")(LastModified)
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("PlayUrls")(PlayUrls)
    __obj.updateDynamic("PublishUrls")(PublishUrls)
    __obj.updateDynamic("Status")(Status)
    __obj.asInstanceOf[Channel]
  }
}

