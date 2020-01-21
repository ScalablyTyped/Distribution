package typings.aliOss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Channel extends js.Object {
  var Description: String
  var LastModified: String
  var Name: String
  var PlayUrls: js.Array[String]
  var PublishUrls: js.Array[String]
  var Status: String
}

object Channel {
  @scala.inline
  def apply(
    Description: String,
    LastModified: String,
    Name: String,
    PlayUrls: js.Array[String],
    PublishUrls: js.Array[String],
    Status: String
  ): Channel = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], LastModified = LastModified.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PlayUrls = PlayUrls.asInstanceOf[js.Any], PublishUrls = PublishUrls.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Channel]
  }
}

