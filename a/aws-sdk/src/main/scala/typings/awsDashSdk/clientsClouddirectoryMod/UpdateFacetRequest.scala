package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateFacetRequest extends js.Object {
  /**
    * List of attributes that need to be updated in a given schema Facet. Each attribute is followed by AttributeAction, which specifies the type of update operation to perform. 
    */
  var AttributeUpdates: js.UndefOr[FacetAttributeUpdateList] = js.native
  /**
    * The name of the facet.
    */
  var Name: FacetName = js.native
  /**
    * The object type that is associated with the facet. See CreateFacetRequest$ObjectType for more details.
    */
  var ObjectType: js.UndefOr[typings.awsDashSdk.clientsClouddirectoryMod.ObjectType] = js.native
  /**
    * The Amazon Resource Name (ARN) that is associated with the Facet. For more information, see arns.
    */
  var SchemaArn: Arn = js.native
}

object UpdateFacetRequest {
  @scala.inline
  def apply(
    Name: FacetName,
    SchemaArn: Arn,
    AttributeUpdates: FacetAttributeUpdateList = null,
    ObjectType: ObjectType = null
  ): UpdateFacetRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], SchemaArn = SchemaArn.asInstanceOf[js.Any])
    if (AttributeUpdates != null) __obj.updateDynamic("AttributeUpdates")(AttributeUpdates.asInstanceOf[js.Any])
    if (ObjectType != null) __obj.updateDynamic("ObjectType")(ObjectType.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFacetRequest]
  }
}

