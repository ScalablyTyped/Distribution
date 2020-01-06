package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateTypedLinkFacetRequest extends js.Object {
  /**
    * Attributes update structure.
    */
  var AttributeUpdates: TypedLinkFacetAttributeUpdateList = js.native
  /**
    * The order of identity attributes for the facet, from most significant to least significant. The ability to filter typed links considers the order that the attributes are defined on the typed link facet. When providing ranges to a typed link selection, any inexact ranges must be specified at the end. Any attributes that do not have a range specified are presumed to match the entire range. Filters are interpreted in the order of the attributes on the typed link facet, not the order in which they are supplied to any API calls. For more information about identity attributes, see Typed Links.
    */
  var IdentityAttributeOrder: AttributeNameList = js.native
  /**
    * The unique name of the typed link facet.
    */
  var Name: TypedLinkName = js.native
  /**
    * The Amazon Resource Name (ARN) that is associated with the schema. For more information, see arns.
    */
  var SchemaArn: Arn = js.native
}

object UpdateTypedLinkFacetRequest {
  @scala.inline
  def apply(
    AttributeUpdates: TypedLinkFacetAttributeUpdateList,
    IdentityAttributeOrder: AttributeNameList,
    Name: TypedLinkName,
    SchemaArn: Arn
  ): UpdateTypedLinkFacetRequest = {
    val __obj = js.Dynamic.literal(AttributeUpdates = AttributeUpdates.asInstanceOf[js.Any], IdentityAttributeOrder = IdentityAttributeOrder.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], SchemaArn = SchemaArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateTypedLinkFacetRequest]
  }
}

