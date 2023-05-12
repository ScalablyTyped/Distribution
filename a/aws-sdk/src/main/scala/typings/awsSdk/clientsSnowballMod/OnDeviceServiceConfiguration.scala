package typings.awsSdk.clientsSnowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnDeviceServiceConfiguration extends StObject {
  
  /**
    * The configuration of EKS Anywhere on the Snow Family device.
    */
  var EKSOnDeviceService: js.UndefOr[EKSOnDeviceServiceConfiguration] = js.undefined
  
  /**
    * Represents the NFS (Network File System) service on a Snow Family device.
    */
  var NFSOnDeviceService: js.UndefOr[NFSOnDeviceServiceConfiguration] = js.undefined
  
  /**
    * Configuration for Amazon S3 compatible storage on Snow family devices.
    */
  var S3OnDeviceService: js.UndefOr[S3OnDeviceServiceConfiguration] = js.undefined
  
  /**
    * Represents the Storage Gateway service Tape Gateway type on a Snow Family device.
    */
  var TGWOnDeviceService: js.UndefOr[TGWOnDeviceServiceConfiguration] = js.undefined
}
object OnDeviceServiceConfiguration {
  
  inline def apply(): OnDeviceServiceConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnDeviceServiceConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnDeviceServiceConfiguration] (val x: Self) extends AnyVal {
    
    inline def setEKSOnDeviceService(value: EKSOnDeviceServiceConfiguration): Self = StObject.set(x, "EKSOnDeviceService", value.asInstanceOf[js.Any])
    
    inline def setEKSOnDeviceServiceUndefined: Self = StObject.set(x, "EKSOnDeviceService", js.undefined)
    
    inline def setNFSOnDeviceService(value: NFSOnDeviceServiceConfiguration): Self = StObject.set(x, "NFSOnDeviceService", value.asInstanceOf[js.Any])
    
    inline def setNFSOnDeviceServiceUndefined: Self = StObject.set(x, "NFSOnDeviceService", js.undefined)
    
    inline def setS3OnDeviceService(value: S3OnDeviceServiceConfiguration): Self = StObject.set(x, "S3OnDeviceService", value.asInstanceOf[js.Any])
    
    inline def setS3OnDeviceServiceUndefined: Self = StObject.set(x, "S3OnDeviceService", js.undefined)
    
    inline def setTGWOnDeviceService(value: TGWOnDeviceServiceConfiguration): Self = StObject.set(x, "TGWOnDeviceService", value.asInstanceOf[js.Any])
    
    inline def setTGWOnDeviceServiceUndefined: Self = StObject.set(x, "TGWOnDeviceService", js.undefined)
  }
}
