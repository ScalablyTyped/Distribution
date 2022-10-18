package typings.awsSdk.clientsCognitosyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentityUsage extends StObject {
  
  /**
    * Total data storage for this identity.
    */
  var DataStorage: js.UndefOr[Long] = js.undefined
  
  /**
    * Number of datasets for the identity.
    */
  var DatasetCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. GUID generation is unique within a region.
    */
  var IdentityId: js.UndefOr[typings.awsSdk.clientsCognitosyncMod.IdentityId] = js.undefined
  
  /**
    * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. GUID generation is unique within a region.
    */
  var IdentityPoolId: js.UndefOr[typings.awsSdk.clientsCognitosyncMod.IdentityPoolId] = js.undefined
  
  /**
    * Date on which the identity was last modified.
    */
  var LastModifiedDate: js.UndefOr[js.Date] = js.undefined
}
object IdentityUsage {
  
  inline def apply(): IdentityUsage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentityUsage]
  }
  
  extension [Self <: IdentityUsage](x: Self) {
    
    inline def setDataStorage(value: Long): Self = StObject.set(x, "DataStorage", value.asInstanceOf[js.Any])
    
    inline def setDataStorageUndefined: Self = StObject.set(x, "DataStorage", js.undefined)
    
    inline def setDatasetCount(value: Integer): Self = StObject.set(x, "DatasetCount", value.asInstanceOf[js.Any])
    
    inline def setDatasetCountUndefined: Self = StObject.set(x, "DatasetCount", js.undefined)
    
    inline def setIdentityId(value: IdentityId): Self = StObject.set(x, "IdentityId", value.asInstanceOf[js.Any])
    
    inline def setIdentityIdUndefined: Self = StObject.set(x, "IdentityId", js.undefined)
    
    inline def setIdentityPoolId(value: IdentityPoolId): Self = StObject.set(x, "IdentityPoolId", value.asInstanceOf[js.Any])
    
    inline def setIdentityPoolIdUndefined: Self = StObject.set(x, "IdentityPoolId", js.undefined)
    
    inline def setLastModifiedDate(value: js.Date): Self = StObject.set(x, "LastModifiedDate", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateUndefined: Self = StObject.set(x, "LastModifiedDate", js.undefined)
  }
}
