package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddFacetToObjectRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) that is associated with the Directory where the object resides. For more information, see arns.
    */
  var DirectoryArn: Arn = js.native
  /**
    * Attributes on the facet that you are adding to the object.
    */
  var ObjectAttributeList: js.UndefOr[AttributeKeyAndValueList] = js.native
  /**
    * A reference to the object you are adding the specified facet to.
    */
  var ObjectReference: typings.awsDashSdk.clientsClouddirectoryMod.ObjectReference = js.native
  /**
    * Identifiers for the facet that you are adding to the object. See SchemaFacet for details.
    */
  var SchemaFacet: typings.awsDashSdk.clientsClouddirectoryMod.SchemaFacet = js.native
}

object AddFacetToObjectRequest {
  @scala.inline
  def apply(
    DirectoryArn: Arn,
    ObjectReference: ObjectReference,
    SchemaFacet: SchemaFacet,
    ObjectAttributeList: AttributeKeyAndValueList = null
  ): AddFacetToObjectRequest = {
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn.asInstanceOf[js.Any], ObjectReference = ObjectReference.asInstanceOf[js.Any], SchemaFacet = SchemaFacet.asInstanceOf[js.Any])
    if (ObjectAttributeList != null) __obj.updateDynamic("ObjectAttributeList")(ObjectAttributeList.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddFacetToObjectRequest]
  }
}

