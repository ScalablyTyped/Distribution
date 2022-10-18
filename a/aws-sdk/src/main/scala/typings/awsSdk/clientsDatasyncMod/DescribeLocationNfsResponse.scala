package typings.awsSdk.clientsDatasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeLocationNfsResponse extends StObject {
  
  /**
    * The time that the NFS location was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the NFS location that was described.
    */
  var LocationArn: js.UndefOr[typings.awsSdk.clientsDatasyncMod.LocationArn] = js.undefined
  
  /**
    * The URL of the source NFS location that was described.
    */
  var LocationUri: js.UndefOr[typings.awsSdk.clientsDatasyncMod.LocationUri] = js.undefined
  
  /**
    * The NFS mount options that DataSync used to mount your NFS share.
    */
  var MountOptions: js.UndefOr[NfsMountOptions] = js.undefined
  
  var OnPremConfig: js.UndefOr[typings.awsSdk.clientsDatasyncMod.OnPremConfig] = js.undefined
}
object DescribeLocationNfsResponse {
  
  inline def apply(): DescribeLocationNfsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLocationNfsResponse]
  }
  
  extension [Self <: DescribeLocationNfsResponse](x: Self) {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setLocationArn(value: LocationArn): Self = StObject.set(x, "LocationArn", value.asInstanceOf[js.Any])
    
    inline def setLocationArnUndefined: Self = StObject.set(x, "LocationArn", js.undefined)
    
    inline def setLocationUri(value: LocationUri): Self = StObject.set(x, "LocationUri", value.asInstanceOf[js.Any])
    
    inline def setLocationUriUndefined: Self = StObject.set(x, "LocationUri", js.undefined)
    
    inline def setMountOptions(value: NfsMountOptions): Self = StObject.set(x, "MountOptions", value.asInstanceOf[js.Any])
    
    inline def setMountOptionsUndefined: Self = StObject.set(x, "MountOptions", js.undefined)
    
    inline def setOnPremConfig(value: OnPremConfig): Self = StObject.set(x, "OnPremConfig", value.asInstanceOf[js.Any])
    
    inline def setOnPremConfigUndefined: Self = StObject.set(x, "OnPremConfig", js.undefined)
  }
}
