package typings.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListStorageLensConfigurationEntry extends StObject {
  
  /**
    * A container for the S3 Storage Lens home Region. Your metrics data is stored and retained in your designated S3 Storage Lens home Region.
    */
  var HomeRegion: S3AWSRegion
  
  /**
    * A container for the S3 Storage Lens configuration ID.
    */
  var Id: ConfigId
  
  /**
    * A container for whether the S3 Storage Lens configuration is enabled. This property is required.
    */
  var IsEnabled: js.UndefOr[typings.awsSdk.clientsS3controlMod.IsEnabled] = js.undefined
  
  /**
    * The ARN of the S3 Storage Lens configuration. This property is read-only.
    */
  var StorageLensArn: typings.awsSdk.clientsS3controlMod.StorageLensArn
}
object ListStorageLensConfigurationEntry {
  
  inline def apply(HomeRegion: S3AWSRegion, Id: ConfigId, StorageLensArn: StorageLensArn): ListStorageLensConfigurationEntry = {
    val __obj = js.Dynamic.literal(HomeRegion = HomeRegion.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], StorageLensArn = StorageLensArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListStorageLensConfigurationEntry]
  }
  
  extension [Self <: ListStorageLensConfigurationEntry](x: Self) {
    
    inline def setHomeRegion(value: S3AWSRegion): Self = StObject.set(x, "HomeRegion", value.asInstanceOf[js.Any])
    
    inline def setId(value: ConfigId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIsEnabled(value: IsEnabled): Self = StObject.set(x, "IsEnabled", value.asInstanceOf[js.Any])
    
    inline def setIsEnabledUndefined: Self = StObject.set(x, "IsEnabled", js.undefined)
    
    inline def setStorageLensArn(value: StorageLensArn): Self = StObject.set(x, "StorageLensArn", value.asInstanceOf[js.Any])
  }
}
