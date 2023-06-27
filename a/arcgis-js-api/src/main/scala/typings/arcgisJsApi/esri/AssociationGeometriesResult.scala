package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssociationGeometriesResult
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
  		 * List of returned [associations](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-Association.html) filtered based on the input parameters in [SynthesizeAssociationGeometriesParameters](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-SynthesizeAssociationGeometriesParameters.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-AssociationGeometriesResult.html#associations)
  		 */
  var associations: js.Array[Association] = js.native
  
  /**
  		 * Indicates whether the [maxGeometryCount](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-SynthesizeAssociationGeometriesParameters.html#maxGeometryCount) has exceeded.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-AssociationGeometriesResult.html#maxGeometryCountExceeded)
  		 */
  var maxGeometryCountExceeded: Boolean = js.native
}
