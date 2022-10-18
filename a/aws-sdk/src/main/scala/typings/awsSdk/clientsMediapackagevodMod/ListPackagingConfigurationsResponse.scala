package typings.awsSdk.clientsMediapackagevodMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPackagingConfigurationsResponse extends StObject {
  
  /**
    * A token that can be used to resume pagination from the end of the collection.
    */
  var NextToken: js.UndefOr[string] = js.undefined
  
  /**
    * A list of MediaPackage VOD PackagingConfiguration resources.
    */
  var PackagingConfigurations: js.UndefOr[listOfPackagingConfiguration] = js.undefined
}
object ListPackagingConfigurationsResponse {
  
  inline def apply(): ListPackagingConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPackagingConfigurationsResponse]
  }
  
  extension [Self <: ListPackagingConfigurationsResponse](x: Self) {
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPackagingConfigurations(value: listOfPackagingConfiguration): Self = StObject.set(x, "PackagingConfigurations", value.asInstanceOf[js.Any])
    
    inline def setPackagingConfigurationsUndefined: Self = StObject.set(x, "PackagingConfigurations", js.undefined)
    
    inline def setPackagingConfigurationsVarargs(value: PackagingConfiguration*): Self = StObject.set(x, "PackagingConfigurations", js.Array(value*))
  }
}
