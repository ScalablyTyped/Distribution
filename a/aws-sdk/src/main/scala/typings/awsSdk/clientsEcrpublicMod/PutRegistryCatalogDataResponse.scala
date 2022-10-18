package typings.awsSdk.clientsEcrpublicMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutRegistryCatalogDataResponse extends StObject {
  
  /**
    * The catalog data for the public registry.
    */
  var registryCatalogData: RegistryCatalogData
}
object PutRegistryCatalogDataResponse {
  
  inline def apply(registryCatalogData: RegistryCatalogData): PutRegistryCatalogDataResponse = {
    val __obj = js.Dynamic.literal(registryCatalogData = registryCatalogData.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutRegistryCatalogDataResponse]
  }
  
  extension [Self <: PutRegistryCatalogDataResponse](x: Self) {
    
    inline def setRegistryCatalogData(value: RegistryCatalogData): Self = StObject.set(x, "registryCatalogData", value.asInstanceOf[js.Any])
  }
}
