package typings
package awsDashSdkLib.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateIndexRequest extends js.Object {
  /**
    * The ARN of the directory where the index should be created.
    */
  var DirectoryArn: Arn
  /**
    * Indicates whether the attribute that is being indexed has unique values or not.
    */
  var IsUnique: Bool
  /**
    * The name of the link between the parent object and the index object.
    */
  var LinkName: js.UndefOr[LinkName] = js.undefined
  /**
    * Specifies the attributes that should be indexed on. Currently only a single attribute is supported.
    */
  var OrderedIndexedAttributeList: AttributeKeyList
  /**
    * A reference to the parent object that contains the index object.
    */
  var ParentReference: js.UndefOr[ObjectReference] = js.undefined
}

object CreateIndexRequest {
  @scala.inline
  def apply(
    DirectoryArn: Arn,
    IsUnique: Bool,
    OrderedIndexedAttributeList: AttributeKeyList,
    LinkName: LinkName = null,
    ParentReference: ObjectReference = null
  ): CreateIndexRequest = {
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn, IsUnique = IsUnique, OrderedIndexedAttributeList = OrderedIndexedAttributeList)
    if (LinkName != null) __obj.updateDynamic("LinkName")(LinkName)
    if (ParentReference != null) __obj.updateDynamic("ParentReference")(ParentReference)
    __obj.asInstanceOf[CreateIndexRequest]
  }
}

