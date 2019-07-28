package typings.awsDashSdk.clientsDatapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tag extends js.Object {
  /**
    * The key name of a tag defined by a user. For more information, see Controlling User Access to Pipelines in the AWS Data Pipeline Developer Guide.
    */
  var key: tagKey
  /**
    * The optional value portion of a tag defined by a user. For more information, see Controlling User Access to Pipelines in the AWS Data Pipeline Developer Guide.
    */
  var value: tagValue
}

object Tag {
  @scala.inline
  def apply(key: tagKey, value: tagValue): Tag = {
    val __obj = js.Dynamic.literal(key = key, value = value)
  
    __obj.asInstanceOf[Tag]
  }
}

