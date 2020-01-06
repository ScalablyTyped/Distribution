package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchCreateObject extends js.Object {
  /**
    * The batch reference name. See Transaction Support for more information.
    */
  var BatchReferenceName: js.UndefOr[typings.awsDashSdk.clientsClouddirectoryMod.BatchReferenceName] = js.native
  /**
    * The name of the link.
    */
  var LinkName: js.UndefOr[typings.awsDashSdk.clientsClouddirectoryMod.LinkName] = js.native
  /**
    * An attribute map, which contains an attribute ARN as the key and attribute value as the map value.
    */
  var ObjectAttributeList: AttributeKeyAndValueList = js.native
  /**
    * If specified, the parent reference to which this object will be attached.
    */
  var ParentReference: js.UndefOr[ObjectReference] = js.native
  /**
    * A list of FacetArns that will be associated with the object. For more information, see arns.
    */
  var SchemaFacet: SchemaFacetList = js.native
}

object BatchCreateObject {
  @scala.inline
  def apply(
    ObjectAttributeList: AttributeKeyAndValueList,
    SchemaFacet: SchemaFacetList,
    BatchReferenceName: BatchReferenceName = null,
    LinkName: LinkName = null,
    ParentReference: ObjectReference = null
  ): BatchCreateObject = {
    val __obj = js.Dynamic.literal(ObjectAttributeList = ObjectAttributeList.asInstanceOf[js.Any], SchemaFacet = SchemaFacet.asInstanceOf[js.Any])
    if (BatchReferenceName != null) __obj.updateDynamic("BatchReferenceName")(BatchReferenceName.asInstanceOf[js.Any])
    if (LinkName != null) __obj.updateDynamic("LinkName")(LinkName.asInstanceOf[js.Any])
    if (ParentReference != null) __obj.updateDynamic("ParentReference")(ParentReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchCreateObject]
  }
}

