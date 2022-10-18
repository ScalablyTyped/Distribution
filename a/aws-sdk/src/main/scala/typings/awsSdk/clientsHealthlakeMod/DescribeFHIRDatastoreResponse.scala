package typings.awsSdk.clientsHealthlakeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFHIRDatastoreResponse extends StObject {
  
  /**
    * All properties associated with a Data Store, including the Data Store ID, Data Store ARN, Data Store name, Data Store status, created at, Data Store type version, and Data Store endpoint.
    */
  var DatastoreProperties: typings.awsSdk.clientsHealthlakeMod.DatastoreProperties
}
object DescribeFHIRDatastoreResponse {
  
  inline def apply(DatastoreProperties: DatastoreProperties): DescribeFHIRDatastoreResponse = {
    val __obj = js.Dynamic.literal(DatastoreProperties = DatastoreProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFHIRDatastoreResponse]
  }
  
  extension [Self <: DescribeFHIRDatastoreResponse](x: Self) {
    
    inline def setDatastoreProperties(value: DatastoreProperties): Self = StObject.set(x, "DatastoreProperties", value.asInstanceOf[js.Any])
  }
}
