package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateObjectRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) that is associated with the Directory in which the object will be created. For more information, see arns.
    */
  var DirectoryArn: Arn = js.native
  /**
    * The name of link that is used to attach this object to a parent.
    */
  var LinkName: js.UndefOr[typings.awsDashSdk.clientsClouddirectoryMod.LinkName] = js.native
  /**
    * The attribute map whose attribute ARN contains the key and attribute value as the map value.
    */
  var ObjectAttributeList: js.UndefOr[AttributeKeyAndValueList] = js.native
  /**
    * If specified, the parent reference to which this object will be attached.
    */
  var ParentReference: js.UndefOr[ObjectReference] = js.native
  /**
    * A list of schema facets to be associated with the object. Do not provide minor version components. See SchemaFacet for details.
    */
  var SchemaFacets: SchemaFacetList = js.native
}

object CreateObjectRequest {
  @scala.inline
  def apply(
    DirectoryArn: Arn,
    SchemaFacets: SchemaFacetList,
    LinkName: LinkName = null,
    ObjectAttributeList: AttributeKeyAndValueList = null,
    ParentReference: ObjectReference = null
  ): CreateObjectRequest = {
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn.asInstanceOf[js.Any], SchemaFacets = SchemaFacets.asInstanceOf[js.Any])
    if (LinkName != null) __obj.updateDynamic("LinkName")(LinkName.asInstanceOf[js.Any])
    if (ObjectAttributeList != null) __obj.updateDynamic("ObjectAttributeList")(ObjectAttributeList.asInstanceOf[js.Any])
    if (ParentReference != null) __obj.updateDynamic("ParentReference")(ParentReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateObjectRequest]
  }
}

