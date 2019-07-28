package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchCreateIndex extends js.Object {
  /**
    * The batch reference name. See Transaction Support for more information.
    */
  var BatchReferenceName: js.UndefOr[typings.awsDashSdk.clientsClouddirectoryMod.BatchReferenceName] = js.undefined
  /**
    * Indicates whether the attribute that is being indexed has unique values or not.
    */
  var IsUnique: Bool
  /**
    * The name of the link between the parent object and the index object.
    */
  var LinkName: js.UndefOr[typings.awsDashSdk.clientsClouddirectoryMod.LinkName] = js.undefined
  /**
    * Specifies the attributes that should be indexed on. Currently only a single attribute is supported.
    */
  var OrderedIndexedAttributeList: AttributeKeyList
  /**
    * A reference to the parent object that contains the index object.
    */
  var ParentReference: js.UndefOr[ObjectReference] = js.undefined
}

object BatchCreateIndex {
  @scala.inline
  def apply(
    IsUnique: Bool,
    OrderedIndexedAttributeList: AttributeKeyList,
    BatchReferenceName: BatchReferenceName = null,
    LinkName: LinkName = null,
    ParentReference: ObjectReference = null
  ): BatchCreateIndex = {
    val __obj = js.Dynamic.literal(IsUnique = IsUnique, OrderedIndexedAttributeList = OrderedIndexedAttributeList)
    if (BatchReferenceName != null) __obj.updateDynamic("BatchReferenceName")(BatchReferenceName)
    if (LinkName != null) __obj.updateDynamic("LinkName")(LinkName)
    if (ParentReference != null) __obj.updateDynamic("ParentReference")(ParentReference)
    __obj.asInstanceOf[BatchCreateIndex]
  }
}

