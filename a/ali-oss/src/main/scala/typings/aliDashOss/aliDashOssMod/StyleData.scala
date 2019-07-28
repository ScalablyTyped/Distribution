package typings.aliDashOss.aliDashOssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyleData extends js.Object {
   // style name
  var Content: String
   // style content
  var CreateTime: String
   // style create time
  var LastModifyTime: String
  var Name: String
}

object StyleData {
  @scala.inline
  def apply(Content: String, CreateTime: String, LastModifyTime: String, Name: String): StyleData = {
    val __obj = js.Dynamic.literal(Content = Content, CreateTime = CreateTime, LastModifyTime = LastModifyTime, Name = Name)
  
    __obj.asInstanceOf[StyleData]
  }
}

