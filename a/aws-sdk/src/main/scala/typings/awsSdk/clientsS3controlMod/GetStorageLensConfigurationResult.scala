package typings.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetStorageLensConfigurationResult extends StObject {
  
  /**
    * The S3 Storage Lens configuration requested.
    */
  var StorageLensConfiguration: js.UndefOr[typings.awsSdk.clientsS3controlMod.StorageLensConfiguration] = js.undefined
}
object GetStorageLensConfigurationResult {
  
  inline def apply(): GetStorageLensConfigurationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetStorageLensConfigurationResult]
  }
  
  extension [Self <: GetStorageLensConfigurationResult](x: Self) {
    
    inline def setStorageLensConfiguration(value: StorageLensConfiguration): Self = StObject.set(x, "StorageLensConfiguration", value.asInstanceOf[js.Any])
    
    inline def setStorageLensConfigurationUndefined: Self = StObject.set(x, "StorageLensConfiguration", js.undefined)
  }
}
