package typings.awsSdk.clientsPipesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePipeSourceManagedStreamingKafkaParameters extends StObject {
  
  /**
    * The maximum number of records to include in each batch.
    */
  var BatchSize: js.UndefOr[LimitMax10000] = js.undefined
  
  /**
    * The credentials needed to access the resource.
    */
  var Credentials: js.UndefOr[MSKAccessCredentials] = js.undefined
  
  /**
    * The maximum length of a time to wait for events.
    */
  var MaximumBatchingWindowInSeconds: js.UndefOr[typings.awsSdk.clientsPipesMod.MaximumBatchingWindowInSeconds] = js.undefined
}
object UpdatePipeSourceManagedStreamingKafkaParameters {
  
  inline def apply(): UpdatePipeSourceManagedStreamingKafkaParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdatePipeSourceManagedStreamingKafkaParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdatePipeSourceManagedStreamingKafkaParameters] (val x: Self) extends AnyVal {
    
    inline def setBatchSize(value: LimitMax10000): Self = StObject.set(x, "BatchSize", value.asInstanceOf[js.Any])
    
    inline def setBatchSizeUndefined: Self = StObject.set(x, "BatchSize", js.undefined)
    
    inline def setCredentials(value: MSKAccessCredentials): Self = StObject.set(x, "Credentials", value.asInstanceOf[js.Any])
    
    inline def setCredentialsUndefined: Self = StObject.set(x, "Credentials", js.undefined)
    
    inline def setMaximumBatchingWindowInSeconds(value: MaximumBatchingWindowInSeconds): Self = StObject.set(x, "MaximumBatchingWindowInSeconds", value.asInstanceOf[js.Any])
    
    inline def setMaximumBatchingWindowInSecondsUndefined: Self = StObject.set(x, "MaximumBatchingWindowInSeconds", js.undefined)
  }
}
