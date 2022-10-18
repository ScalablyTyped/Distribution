package typings.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListStorageLensConfigurationsResult extends StObject {
  
  /**
    * If the request produced more than the maximum number of S3 Storage Lens configuration results, you can pass this value into a subsequent request to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[ContinuationToken] = js.undefined
  
  /**
    * A list of S3 Storage Lens configurations.
    */
  var StorageLensConfigurationList: js.UndefOr[typings.awsSdk.clientsS3controlMod.StorageLensConfigurationList] = js.undefined
}
object ListStorageLensConfigurationsResult {
  
  inline def apply(): ListStorageLensConfigurationsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListStorageLensConfigurationsResult]
  }
  
  extension [Self <: ListStorageLensConfigurationsResult](x: Self) {
    
    inline def setNextToken(value: ContinuationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setStorageLensConfigurationList(value: StorageLensConfigurationList): Self = StObject.set(x, "StorageLensConfigurationList", value.asInstanceOf[js.Any])
    
    inline def setStorageLensConfigurationListUndefined: Self = StObject.set(x, "StorageLensConfigurationList", js.undefined)
    
    inline def setStorageLensConfigurationListVarargs(value: ListStorageLensConfigurationEntry*): Self = StObject.set(x, "StorageLensConfigurationList", js.Array(value*))
  }
}
