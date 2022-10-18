package typings.awsSdk.clientsEcrpublicMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRegistryCatalogDataResponse extends StObject {
  
  /**
    * The catalog metadata for the public registry.
    */
  var registryCatalogData: RegistryCatalogData
}
object GetRegistryCatalogDataResponse {
  
  inline def apply(registryCatalogData: RegistryCatalogData): GetRegistryCatalogDataResponse = {
    val __obj = js.Dynamic.literal(registryCatalogData = registryCatalogData.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRegistryCatalogDataResponse]
  }
  
  extension [Self <: GetRegistryCatalogDataResponse](x: Self) {
    
    inline def setRegistryCatalogData(value: RegistryCatalogData): Self = StObject.set(x, "registryCatalogData", value.asInstanceOf[js.Any])
  }
}
