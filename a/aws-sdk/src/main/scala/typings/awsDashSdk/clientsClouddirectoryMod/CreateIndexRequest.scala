package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateIndexRequest extends js.Object {
  /**
    * The ARN of the directory where the index should be created.
    */
  var DirectoryArn: Arn = js.native
  /**
    * Indicates whether the attribute that is being indexed has unique values or not.
    */
  var IsUnique: Bool = js.native
  /**
    * The name of the link between the parent object and the index object.
    */
  var LinkName: js.UndefOr[typings.awsDashSdk.clientsClouddirectoryMod.LinkName] = js.native
  /**
    * Specifies the attributes that should be indexed on. Currently only a single attribute is supported.
    */
  var OrderedIndexedAttributeList: AttributeKeyList = js.native
  /**
    * A reference to the parent object that contains the index object.
    */
  var ParentReference: js.UndefOr[ObjectReference] = js.native
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
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn.asInstanceOf[js.Any], IsUnique = IsUnique.asInstanceOf[js.Any], OrderedIndexedAttributeList = OrderedIndexedAttributeList.asInstanceOf[js.Any])
    if (LinkName != null) __obj.updateDynamic("LinkName")(LinkName.asInstanceOf[js.Any])
    if (ParentReference != null) __obj.updateDynamic("ParentReference")(ParentReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateIndexRequest]
  }
}

