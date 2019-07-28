package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddFacetToObjectRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) that is associated with the Directory where the object resides. For more information, see arns.
    */
  var DirectoryArn: Arn
  /**
    * Attributes on the facet that you are adding to the object.
    */
  var ObjectAttributeList: js.UndefOr[AttributeKeyAndValueList] = js.undefined
  /**
    * A reference to the object you are adding the specified facet to.
    */
  var ObjectReference: typings.awsDashSdk.clientsClouddirectoryMod.ObjectReference
  /**
    * Identifiers for the facet that you are adding to the object. See SchemaFacet for details.
    */
  var SchemaFacet: typings.awsDashSdk.clientsClouddirectoryMod.SchemaFacet
}

object AddFacetToObjectRequest {
  @scala.inline
  def apply(
    DirectoryArn: Arn,
    ObjectReference: ObjectReference,
    SchemaFacet: SchemaFacet,
    ObjectAttributeList: AttributeKeyAndValueList = null
  ): AddFacetToObjectRequest = {
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn, ObjectReference = ObjectReference, SchemaFacet = SchemaFacet)
    if (ObjectAttributeList != null) __obj.updateDynamic("ObjectAttributeList")(ObjectAttributeList)
    __obj.asInstanceOf[AddFacetToObjectRequest]
  }
}

