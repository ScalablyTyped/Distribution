package typings.awsSdk.clientsIotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDatastoreResponse extends StObject {
  
  /**
    * The ARN of the data store.
    */
  var datastoreArn: js.UndefOr[DatastoreArn] = js.undefined
  
  /**
    * The name of the data store.
    */
  var datastoreName: js.UndefOr[DatastoreName] = js.undefined
  
  /**
    * How long, in days, message data is kept for the data store.
    */
  var retentionPeriod: js.UndefOr[RetentionPeriod] = js.undefined
}
object CreateDatastoreResponse {
  
  inline def apply(): CreateDatastoreResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDatastoreResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateDatastoreResponse] (val x: Self) extends AnyVal {
    
    inline def setDatastoreArn(value: DatastoreArn): Self = StObject.set(x, "datastoreArn", value.asInstanceOf[js.Any])
    
    inline def setDatastoreArnUndefined: Self = StObject.set(x, "datastoreArn", js.undefined)
    
    inline def setDatastoreName(value: DatastoreName): Self = StObject.set(x, "datastoreName", value.asInstanceOf[js.Any])
    
    inline def setDatastoreNameUndefined: Self = StObject.set(x, "datastoreName", js.undefined)
    
    inline def setRetentionPeriod(value: RetentionPeriod): Self = StObject.set(x, "retentionPeriod", value.asInstanceOf[js.Any])
    
    inline def setRetentionPeriodUndefined: Self = StObject.set(x, "retentionPeriod", js.undefined)
  }
}
