package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagResourceRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the user pool to assign the tags to.
    */
  var ResourceArn: ArnType = js.native
  /**
    * The tags to assign to the user pool.
    */
  var Tags: UserPoolTagsType = js.native
}

object TagResourceRequest {
  @scala.inline
  def apply(ResourceArn: ArnType, Tags: UserPoolTagsType): TagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TagResourceRequest]
  }
}

