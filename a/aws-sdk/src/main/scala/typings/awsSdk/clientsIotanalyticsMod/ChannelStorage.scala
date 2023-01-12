package typings.awsSdk.clientsIotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelStorage extends StObject {
  
  /**
    * Used to store channel data in an S3 bucket that you manage. If customer managed storage is selected, the retentionPeriod parameter is ignored. You can't change the choice of S3 storage after the data store is created.
    */
  var customerManagedS3: js.UndefOr[CustomerManagedChannelS3Storage] = js.undefined
  
  /**
    * Used to store channel data in an S3 bucket managed by IoT Analytics. You can't change the choice of S3 storage after the data store is created.
    */
  var serviceManagedS3: js.UndefOr[ServiceManagedChannelS3Storage] = js.undefined
}
object ChannelStorage {
  
  inline def apply(): ChannelStorage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelStorage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChannelStorage] (val x: Self) extends AnyVal {
    
    inline def setCustomerManagedS3(value: CustomerManagedChannelS3Storage): Self = StObject.set(x, "customerManagedS3", value.asInstanceOf[js.Any])
    
    inline def setCustomerManagedS3Undefined: Self = StObject.set(x, "customerManagedS3", js.undefined)
    
    inline def setServiceManagedS3(value: ServiceManagedChannelS3Storage): Self = StObject.set(x, "serviceManagedS3", value.asInstanceOf[js.Any])
    
    inline def setServiceManagedS3Undefined: Self = StObject.set(x, "serviceManagedS3", js.undefined)
  }
}
