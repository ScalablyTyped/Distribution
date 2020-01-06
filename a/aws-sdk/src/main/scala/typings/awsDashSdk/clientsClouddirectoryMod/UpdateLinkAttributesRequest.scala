package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateLinkAttributesRequest extends js.Object {
  /**
    * The attributes update structure.
    */
  var AttributeUpdates: LinkAttributeUpdateList = js.native
  /**
    * The Amazon Resource Name (ARN) that is associated with the Directory where the updated typed link resides. For more information, see arns or Typed Links.
    */
  var DirectoryArn: Arn = js.native
  /**
    * Allows a typed link specifier to be accepted as input.
    */
  var TypedLinkSpecifier: typings.awsDashSdk.clientsClouddirectoryMod.TypedLinkSpecifier = js.native
}

object UpdateLinkAttributesRequest {
  @scala.inline
  def apply(
    AttributeUpdates: LinkAttributeUpdateList,
    DirectoryArn: Arn,
    TypedLinkSpecifier: TypedLinkSpecifier
  ): UpdateLinkAttributesRequest = {
    val __obj = js.Dynamic.literal(AttributeUpdates = AttributeUpdates.asInstanceOf[js.Any], DirectoryArn = DirectoryArn.asInstanceOf[js.Any], TypedLinkSpecifier = TypedLinkSpecifier.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateLinkAttributesRequest]
  }
}

