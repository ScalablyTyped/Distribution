package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryAssociationsResultProperties extends StObject {
  
  /**
    * List of [associations](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-Association.html) returned filtered based on the input parameters in [QueryAssociationsParameters](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-QueryAssociationsParameters.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-QueryAssociationsResult.html#associations)
    */
  var associations: js.UndefOr[js.Array[AssociationProperties]] = js.undefined
}
object QueryAssociationsResultProperties {
  
  inline def apply(): QueryAssociationsResultProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryAssociationsResultProperties]
  }
  
  extension [Self <: QueryAssociationsResultProperties](x: Self) {
    
    inline def setAssociations(value: js.Array[AssociationProperties]): Self = StObject.set(x, "associations", value.asInstanceOf[js.Any])
    
    inline def setAssociationsUndefined: Self = StObject.set(x, "associations", js.undefined)
    
    inline def setAssociationsVarargs(value: AssociationProperties*): Self = StObject.set(x, "associations", js.Array(value*))
  }
}
