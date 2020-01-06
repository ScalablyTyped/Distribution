package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetObjectInformationResponse extends js.Object {
  /**
    * The ObjectIdentifier of the specified object.
    */
  var ObjectIdentifier: js.UndefOr[typings.awsDashSdk.clientsClouddirectoryMod.ObjectIdentifier] = js.native
  /**
    * The facets attached to the specified object.
    */
  var SchemaFacets: js.UndefOr[SchemaFacetList] = js.native
}

object BatchGetObjectInformationResponse {
  @scala.inline
  def apply(ObjectIdentifier: ObjectIdentifier = null, SchemaFacets: SchemaFacetList = null): BatchGetObjectInformationResponse = {
    val __obj = js.Dynamic.literal()
    if (ObjectIdentifier != null) __obj.updateDynamic("ObjectIdentifier")(ObjectIdentifier.asInstanceOf[js.Any])
    if (SchemaFacets != null) __obj.updateDynamic("SchemaFacets")(SchemaFacets.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetObjectInformationResponse]
  }
}

