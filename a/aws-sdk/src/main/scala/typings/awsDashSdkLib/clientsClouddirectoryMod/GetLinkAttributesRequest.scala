package typings
package awsDashSdkLib.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetLinkAttributesRequest extends js.Object {
  /**
    * A list of attribute names whose values will be retrieved.
    */
  var AttributeNames: AttributeNameList
  /**
    * The consistency level at which to retrieve the attributes on a typed link.
    */
  var ConsistencyLevel: js.UndefOr[ConsistencyLevel] = js.undefined
  /**
    * The Amazon Resource Name (ARN) that is associated with the Directory where the typed link resides. For more information, see arns or Typed Links.
    */
  var DirectoryArn: Arn
  /**
    * Allows a typed link specifier to be accepted as input.
    */
  var TypedLinkSpecifier: awsDashSdkLib.clientsClouddirectoryMod.TypedLinkSpecifier
}

object GetLinkAttributesRequest {
  @scala.inline
  def apply(
    AttributeNames: AttributeNameList,
    DirectoryArn: Arn,
    TypedLinkSpecifier: TypedLinkSpecifier,
    ConsistencyLevel: ConsistencyLevel = null
  ): GetLinkAttributesRequest = {
    val __obj = js.Dynamic.literal(AttributeNames = AttributeNames, DirectoryArn = DirectoryArn, TypedLinkSpecifier = TypedLinkSpecifier)
    if (ConsistencyLevel != null) __obj.updateDynamic("ConsistencyLevel")(ConsistencyLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLinkAttributesRequest]
  }
}

