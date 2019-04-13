package typings
package awsDashSdkLib.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateObjectRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) that is associated with the Directory in which the object will be created. For more information, see arns.
    */
  var DirectoryArn: Arn
  /**
    * The name of link that is used to attach this object to a parent.
    */
  var LinkName: js.UndefOr[LinkName] = js.undefined
  /**
    * The attribute map whose attribute ARN contains the key and attribute value as the map value.
    */
  var ObjectAttributeList: js.UndefOr[AttributeKeyAndValueList] = js.undefined
  /**
    * If specified, the parent reference to which this object will be attached.
    */
  var ParentReference: js.UndefOr[ObjectReference] = js.undefined
  /**
    * A list of schema facets to be associated with the object. Do not provide minor version components. See SchemaFacet for details.
    */
  var SchemaFacets: SchemaFacetList
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
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn, SchemaFacets = SchemaFacets)
    if (LinkName != null) __obj.updateDynamic("LinkName")(LinkName)
    if (ObjectAttributeList != null) __obj.updateDynamic("ObjectAttributeList")(ObjectAttributeList)
    if (ParentReference != null) __obj.updateDynamic("ParentReference")(ParentReference)
    __obj.asInstanceOf[CreateObjectRequest]
  }
}

