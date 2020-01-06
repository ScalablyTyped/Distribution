package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetachTypedLinkRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the directory where you want to detach the typed link.
    */
  var DirectoryArn: Arn = js.native
  /**
    * Used to accept a typed link specifier as input.
    */
  var TypedLinkSpecifier: typings.awsDashSdk.clientsClouddirectoryMod.TypedLinkSpecifier = js.native
}

object DetachTypedLinkRequest {
  @scala.inline
  def apply(DirectoryArn: Arn, TypedLinkSpecifier: TypedLinkSpecifier): DetachTypedLinkRequest = {
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn.asInstanceOf[js.Any], TypedLinkSpecifier = TypedLinkSpecifier.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DetachTypedLinkRequest]
  }
}

