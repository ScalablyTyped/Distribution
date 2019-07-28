package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchRemoveFacetFromObject extends js.Object {
  /**
    * A reference to the object whose facet will be removed.
    */
  var ObjectReference: typings.awsDashSdk.clientsClouddirectoryMod.ObjectReference
  /**
    * The facet to remove from the object.
    */
  var SchemaFacet: typings.awsDashSdk.clientsClouddirectoryMod.SchemaFacet
}

object BatchRemoveFacetFromObject {
  @scala.inline
  def apply(ObjectReference: ObjectReference, SchemaFacet: SchemaFacet): BatchRemoveFacetFromObject = {
    val __obj = js.Dynamic.literal(ObjectReference = ObjectReference, SchemaFacet = SchemaFacet)
  
    __obj.asInstanceOf[BatchRemoveFacetFromObject]
  }
}

