package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchCreateObject extends js.Object {
  /**
    * The batch reference name. See Transaction Support for more information.
    */
  var BatchReferenceName: js.UndefOr[typings.awsDashSdk.clientsClouddirectoryMod.BatchReferenceName] = js.undefined
  /**
    * The name of the link.
    */
  var LinkName: js.UndefOr[typings.awsDashSdk.clientsClouddirectoryMod.LinkName] = js.undefined
  /**
    * An attribute map, which contains an attribute ARN as the key and attribute value as the map value.
    */
  var ObjectAttributeList: AttributeKeyAndValueList
  /**
    * If specified, the parent reference to which this object will be attached.
    */
  var ParentReference: js.UndefOr[ObjectReference] = js.undefined
  /**
    * A list of FacetArns that will be associated with the object. For more information, see arns.
    */
  var SchemaFacet: SchemaFacetList
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
    val __obj = js.Dynamic.literal(ObjectAttributeList = ObjectAttributeList, SchemaFacet = SchemaFacet)
    if (BatchReferenceName != null) __obj.updateDynamic("BatchReferenceName")(BatchReferenceName)
    if (LinkName != null) __obj.updateDynamic("LinkName")(LinkName)
    if (ParentReference != null) __obj.updateDynamic("ParentReference")(ParentReference)
    __obj.asInstanceOf[BatchCreateObject]
  }
}

