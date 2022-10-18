package typings.awsSdk.clientsIotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelStorageSummary extends StObject {
  
  /**
    * Used to store channel data in an S3 bucket that you manage.
    */
  var customerManagedS3: js.UndefOr[CustomerManagedChannelS3StorageSummary] = js.undefined
  
  /**
    * Used to store channel data in an S3 bucket managed by IoT Analytics.
    */
  var serviceManagedS3: js.UndefOr[ServiceManagedChannelS3StorageSummary] = js.undefined
}
object ChannelStorageSummary {
  
  inline def apply(): ChannelStorageSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelStorageSummary]
  }
  
  extension [Self <: ChannelStorageSummary](x: Self) {
    
    inline def setCustomerManagedS3(value: CustomerManagedChannelS3StorageSummary): Self = StObject.set(x, "customerManagedS3", value.asInstanceOf[js.Any])
    
    inline def setCustomerManagedS3Undefined: Self = StObject.set(x, "customerManagedS3", js.undefined)
    
    inline def setServiceManagedS3(value: ServiceManagedChannelS3StorageSummary): Self = StObject.set(x, "serviceManagedS3", value.asInstanceOf[js.Any])
    
    inline def setServiceManagedS3Undefined: Self = StObject.set(x, "serviceManagedS3", js.undefined)
  }
}
