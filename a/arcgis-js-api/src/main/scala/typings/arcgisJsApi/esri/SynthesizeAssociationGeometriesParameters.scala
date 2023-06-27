package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SynthesizeAssociationGeometriesParameters
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
  		 * The extent used to execute a spatial query to retrieve the associations.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-SynthesizeAssociationGeometriesParameters.html#extent)
  		 */
  var extent: Extent = js.native
  
  /**
  		 * The geodatabase version to execute the function against.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-SynthesizeAssociationGeometriesParameters.html#gdbVersion)
  		 */
  var gdbVersion: String = js.native
  
  /**
  		 * A number that indicates the maximum associations that should be synthesized after which the operation should immediately return.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-SynthesizeAssociationGeometriesParameters.html#maxGeometryCount)
  		 */
  var maxGeometryCount: Double = js.native
  
  /**
  		 * The date/timestamp (in UTC) to execute the function.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-SynthesizeAssociationGeometriesParameters.html#moment)
  		 */
  var moment: js.Date = js.native
  
  /**
  		 * The spatial reference that should be used to project the synthesized geometries.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-SynthesizeAssociationGeometriesParameters.html#outSpatialReference)
  		 */
  var outSpatialReference: SpatialReference = js.native
  
  /**
  		 * Indicates whether to synthesize and return structual attachment associations.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-SynthesizeAssociationGeometriesParameters.html#returnAttachmentAssociations)
  		 */
  var returnAttachmentAssociations: Boolean = js.native
  
  /**
  		 * Indicates whether to synthesize and return connectivity associations.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-SynthesizeAssociationGeometriesParameters.html#returnConnectivityAssociations)
  		 */
  var returnConnectivityAssociations: Boolean = js.native
  
  /**
  		 * Indicates whether to synthesize and return containment associations.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-SynthesizeAssociationGeometriesParameters.html#returnContainmentAssociations)
  		 */
  var returnContainmentAssociations: Boolean = js.native
}
