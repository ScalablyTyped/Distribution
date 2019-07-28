package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateFacetRequest extends js.Object {
  /**
    * The attributes that are associated with the Facet.
    */
  var Attributes: js.UndefOr[FacetAttributeList] = js.undefined
  /**
    * There are two different styles that you can define on any given facet, Static and Dynamic. For static facets, all attributes must be defined in the schema. For dynamic facets, attributes can be defined during data plane operations.
    */
  var FacetStyle: js.UndefOr[typings.awsDashSdk.clientsClouddirectoryMod.FacetStyle] = js.undefined
  /**
    * The name of the Facet, which is unique for a given schema.
    */
  var Name: FacetName
  /**
    * Specifies whether a given object created from this facet is of type node, leaf node, policy or index.   Node: Can have multiple children but one parent.     Leaf node: Cannot have children but can have multiple parents.     Policy: Allows you to store a policy document and policy type. For more information, see Policies.     Index: Can be created with the Index API.  
    */
  var ObjectType: js.UndefOr[typings.awsDashSdk.clientsClouddirectoryMod.ObjectType] = js.undefined
  /**
    * The schema ARN in which the new Facet will be created. For more information, see arns.
    */
  var SchemaArn: Arn
}

object CreateFacetRequest {
  @scala.inline
  def apply(
    Name: FacetName,
    SchemaArn: Arn,
    Attributes: FacetAttributeList = null,
    FacetStyle: FacetStyle = null,
    ObjectType: ObjectType = null
  ): CreateFacetRequest = {
    val __obj = js.Dynamic.literal(Name = Name, SchemaArn = SchemaArn)
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes)
    if (FacetStyle != null) __obj.updateDynamic("FacetStyle")(FacetStyle.asInstanceOf[js.Any])
    if (ObjectType != null) __obj.updateDynamic("ObjectType")(ObjectType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFacetRequest]
  }
}

