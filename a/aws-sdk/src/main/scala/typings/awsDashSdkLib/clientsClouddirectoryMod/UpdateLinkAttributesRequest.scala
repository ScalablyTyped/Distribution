package typings
package awsDashSdkLib.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateLinkAttributesRequest extends js.Object {
  /**
    * The attributes update structure.
    */
  var AttributeUpdates: LinkAttributeUpdateList
  /**
    * The Amazon Resource Name (ARN) that is associated with the Directory where the updated typed link resides. For more information, see arns or Typed Links.
    */
  var DirectoryArn: Arn
  /**
    * Allows a typed link specifier to be accepted as input.
    */
  var TypedLinkSpecifier: awsDashSdkLib.clientsClouddirectoryMod.TypedLinkSpecifier
}

object UpdateLinkAttributesRequest {
  @scala.inline
  def apply(
    AttributeUpdates: LinkAttributeUpdateList,
    DirectoryArn: Arn,
    TypedLinkSpecifier: TypedLinkSpecifier
  ): UpdateLinkAttributesRequest = {
    val __obj = js.Dynamic.literal(AttributeUpdates = AttributeUpdates, DirectoryArn = DirectoryArn, TypedLinkSpecifier = TypedLinkSpecifier)
  
    __obj.asInstanceOf[UpdateLinkAttributesRequest]
  }
}

