package typings.awsSdk.clientsHealthlakeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFHIRDatastoreRequest extends StObject {
  
  /**
    * The AWS-generated Data Store id. This is part of the ‘CreateFHIRDatastore’ output.
    */
  var DatastoreId: js.UndefOr[typings.awsSdk.clientsHealthlakeMod.DatastoreId] = js.undefined
}
object DescribeFHIRDatastoreRequest {
  
  inline def apply(): DescribeFHIRDatastoreRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFHIRDatastoreRequest]
  }
  
  extension [Self <: DescribeFHIRDatastoreRequest](x: Self) {
    
    inline def setDatastoreId(value: DatastoreId): Self = StObject.set(x, "DatastoreId", value.asInstanceOf[js.Any])
    
    inline def setDatastoreIdUndefined: Self = StObject.set(x, "DatastoreId", js.undefined)
  }
}
