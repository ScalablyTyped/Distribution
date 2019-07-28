package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveFacetFromObjectRequest extends js.Object {
  /**
    * The ARN of the directory in which the object resides.
    */
  var DirectoryArn: Arn
  /**
    * A reference to the object to remove the facet from.
    */
  var ObjectReference: typings.awsDashSdk.clientsClouddirectoryMod.ObjectReference
  /**
    * The facet to remove. See SchemaFacet for details.
    */
  var SchemaFacet: typings.awsDashSdk.clientsClouddirectoryMod.SchemaFacet
}

object RemoveFacetFromObjectRequest {
  @scala.inline
  def apply(DirectoryArn: Arn, ObjectReference: ObjectReference, SchemaFacet: SchemaFacet): RemoveFacetFromObjectRequest = {
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn, ObjectReference = ObjectReference, SchemaFacet = SchemaFacet)
  
    __obj.asInstanceOf[RemoveFacetFromObjectRequest]
  }
}

