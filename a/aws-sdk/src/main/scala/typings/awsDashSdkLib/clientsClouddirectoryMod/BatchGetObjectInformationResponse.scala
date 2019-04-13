package typings
package awsDashSdkLib.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchGetObjectInformationResponse extends js.Object {
  /**
    * The ObjectIdentifier of the specified object.
    */
  var ObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.undefined
  /**
    * The facets attached to the specified object.
    */
  var SchemaFacets: js.UndefOr[SchemaFacetList] = js.undefined
}

object BatchGetObjectInformationResponse {
  @scala.inline
  def apply(ObjectIdentifier: ObjectIdentifier = null, SchemaFacets: SchemaFacetList = null): BatchGetObjectInformationResponse = {
    val __obj = js.Dynamic.literal()
    if (ObjectIdentifier != null) __obj.updateDynamic("ObjectIdentifier")(ObjectIdentifier)
    if (SchemaFacets != null) __obj.updateDynamic("SchemaFacets")(SchemaFacets)
    __obj.asInstanceOf[BatchGetObjectInformationResponse]
  }
}

