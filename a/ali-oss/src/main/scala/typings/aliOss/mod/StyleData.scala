package typings.aliOss.mod

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
    val __obj = js.Dynamic.literal(Content = Content.asInstanceOf[js.Any], CreateTime = CreateTime.asInstanceOf[js.Any], LastModifyTime = LastModifyTime.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StyleData]
  }
}

