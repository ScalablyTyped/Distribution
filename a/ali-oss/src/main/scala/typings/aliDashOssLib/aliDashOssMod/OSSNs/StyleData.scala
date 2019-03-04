package typings
package aliDashOssLib.aliDashOssMod.OSSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyleData extends js.Object {
   // style name
  var Content: java.lang.String
   // style content
  var CreateTime: java.lang.String
   // style create time
  var LastModifyTime: java.lang.String
  var Name: java.lang.String
}

object StyleData {
  @scala.inline
  def apply(
    Content: java.lang.String,
    CreateTime: java.lang.String,
    LastModifyTime: java.lang.String,
    Name: java.lang.String
  ): StyleData = {
    val __obj = js.Dynamic.literal(Content = Content, CreateTime = CreateTime, LastModifyTime = LastModifyTime, Name = Name)
  
    __obj.asInstanceOf[StyleData]
  }
}

