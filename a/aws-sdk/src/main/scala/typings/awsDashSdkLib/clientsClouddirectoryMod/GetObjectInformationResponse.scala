package typings
package awsDashSdkLib.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetObjectInformationResponse extends js.Object {
  /**
    * The ObjectIdentifier of the specified object.
    */
  var ObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.undefined
  /**
    * The facets attached to the specified object. Although the response does not include minor version information, the most recently applied minor version of each Facet is in effect. See GetAppliedSchemaVersion for details.
    */
  var SchemaFacets: js.UndefOr[SchemaFacetList] = js.undefined
}

object GetObjectInformationResponse {
  @scala.inline
  def apply(ObjectIdentifier: ObjectIdentifier = null, SchemaFacets: SchemaFacetList = null): GetObjectInformationResponse = {
    val __obj = js.Dynamic.literal()
    if (ObjectIdentifier != null) __obj.updateDynamic("ObjectIdentifier")(ObjectIdentifier)
    if (SchemaFacets != null) __obj.updateDynamic("SchemaFacets")(SchemaFacets)
    __obj.asInstanceOf[GetObjectInformationResponse]
  }
}

