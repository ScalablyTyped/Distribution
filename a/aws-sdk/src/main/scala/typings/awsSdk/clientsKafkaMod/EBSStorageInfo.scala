package typings.awsSdk.clientsKafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EBSStorageInfo extends StObject {
  
  /**
    * 
    EBS volume provisioned throughput information.
    
    */
  var ProvisionedThroughput: js.UndefOr[typings.awsSdk.clientsKafkaMod.ProvisionedThroughput] = js.undefined
  
  /**
    * 
    The size in GiB of the EBS volume for the data drive on each broker node.
    
    */
  var VolumeSize: js.UndefOr[integerMin1Max16384] = js.undefined
}
object EBSStorageInfo {
  
  inline def apply(): EBSStorageInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EBSStorageInfo]
  }
  
  extension [Self <: EBSStorageInfo](x: Self) {
    
    inline def setProvisionedThroughput(value: ProvisionedThroughput): Self = StObject.set(x, "ProvisionedThroughput", value.asInstanceOf[js.Any])
    
    inline def setProvisionedThroughputUndefined: Self = StObject.set(x, "ProvisionedThroughput", js.undefined)
    
    inline def setVolumeSize(value: integerMin1Max16384): Self = StObject.set(x, "VolumeSize", value.asInstanceOf[js.Any])
    
    inline def setVolumeSizeUndefined: Self = StObject.set(x, "VolumeSize", js.undefined)
  }
}
