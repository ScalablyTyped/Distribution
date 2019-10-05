package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagResourceRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the user pool to assign the tags to.
    */
  var ResourceArn: ArnType
  /**
    * The tags to assign to the user pool.
    */
  var Tags: UserPoolTagsType
}

object TagResourceRequest {
  @scala.inline
  def apply(ResourceArn: ArnType, Tags: UserPoolTagsType): TagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn, Tags = Tags)
  
    __obj.asInstanceOf[TagResourceRequest]
  }
}

