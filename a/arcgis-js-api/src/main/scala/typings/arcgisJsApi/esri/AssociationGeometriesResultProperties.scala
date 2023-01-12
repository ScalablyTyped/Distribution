package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociationGeometriesResultProperties extends StObject {
  
  /**
    * List of returned [associations](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-Association.html) filtered based on the input parameters in [SynthesizeAssociationGeometriesParameters](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-SynthesizeAssociationGeometriesParameters.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-AssociationGeometriesResult.html#associations)
    */
  var associations: js.UndefOr[js.Array[AssociationProperties]] = js.undefined
  
  /**
    * Indicates whether the [maxGeometryCount](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-SynthesizeAssociationGeometriesParameters.html#maxGeometryCount) has exceeded.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-AssociationGeometriesResult.html#maxGeometryCountExceeded)
    */
  var maxGeometryCountExceeded: js.UndefOr[Boolean] = js.undefined
}
object AssociationGeometriesResultProperties {
  
  inline def apply(): AssociationGeometriesResultProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociationGeometriesResultProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssociationGeometriesResultProperties] (val x: Self) extends AnyVal {
    
    inline def setAssociations(value: js.Array[AssociationProperties]): Self = StObject.set(x, "associations", value.asInstanceOf[js.Any])
    
    inline def setAssociationsUndefined: Self = StObject.set(x, "associations", js.undefined)
    
    inline def setAssociationsVarargs(value: AssociationProperties*): Self = StObject.set(x, "associations", js.Array(value*))
    
    inline def setMaxGeometryCountExceeded(value: Boolean): Self = StObject.set(x, "maxGeometryCountExceeded", value.asInstanceOf[js.Any])
    
    inline def setMaxGeometryCountExceededUndefined: Self = StObject.set(x, "maxGeometryCountExceeded", js.undefined)
  }
}
