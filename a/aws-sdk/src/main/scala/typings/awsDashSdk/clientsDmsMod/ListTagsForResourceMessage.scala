package typings.awsDashSdk.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTagsForResourceMessage extends js.Object {
  /**
    * The Amazon Resource Name (ARN) string that uniquely identifies the AWS DMS resource.
    */
  var ResourceArn: String
}

object ListTagsForResourceMessage {
  @scala.inline
  def apply(ResourceArn: String): ListTagsForResourceMessage = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn)
  
    __obj.asInstanceOf[ListTagsForResourceMessage]
  }
}

