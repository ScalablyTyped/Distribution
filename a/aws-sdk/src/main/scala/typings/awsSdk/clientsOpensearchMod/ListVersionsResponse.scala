package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListVersionsResponse extends StObject {
  
  var NextToken: js.UndefOr[typings.awsSdk.clientsOpensearchMod.NextToken] = js.undefined
  
  var Versions: js.UndefOr[VersionList] = js.undefined
}
object ListVersionsResponse {
  
  inline def apply(): ListVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListVersionsResponse]
  }
  
  extension [Self <: ListVersionsResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setVersions(value: VersionList): Self = StObject.set(x, "Versions", value.asInstanceOf[js.Any])
    
    inline def setVersionsUndefined: Self = StObject.set(x, "Versions", js.undefined)
    
    inline def setVersionsVarargs(value: VersionString*): Self = StObject.set(x, "Versions", js.Array(value*))
  }
}
