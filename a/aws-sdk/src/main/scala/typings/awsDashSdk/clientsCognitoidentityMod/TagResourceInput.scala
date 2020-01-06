package typings.awsDashSdk.clientsCognitoidentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagResourceInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the identity pool to assign the tags to.
    */
  var ResourceArn: ARNString = js.native
  /**
    * The tags to assign to the identity pool.
    */
  var Tags: IdentityPoolTagsType = js.native
}

object TagResourceInput {
  @scala.inline
  def apply(ResourceArn: ARNString, Tags: IdentityPoolTagsType): TagResourceInput = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TagResourceInput]
  }
}

