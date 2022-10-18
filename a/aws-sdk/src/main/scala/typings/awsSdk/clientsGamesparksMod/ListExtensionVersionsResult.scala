package typings.awsSdk.clientsGamesparksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListExtensionVersionsResult extends StObject {
  
  /**
    * The list of extension versions.
    */
  var ExtensionVersions: js.UndefOr[ExtensionVersionDetailsList] = js.undefined
  
  /**
    * The token that indicates the start of the next sequential page of results.  Use this value when making the next call to this operation to continue where the last one finished. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsGamesparksMod.NextToken] = js.undefined
}
object ListExtensionVersionsResult {
  
  inline def apply(): ListExtensionVersionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListExtensionVersionsResult]
  }
  
  extension [Self <: ListExtensionVersionsResult](x: Self) {
    
    inline def setExtensionVersions(value: ExtensionVersionDetailsList): Self = StObject.set(x, "ExtensionVersions", value.asInstanceOf[js.Any])
    
    inline def setExtensionVersionsUndefined: Self = StObject.set(x, "ExtensionVersions", js.undefined)
    
    inline def setExtensionVersionsVarargs(value: ExtensionVersionDetails*): Self = StObject.set(x, "ExtensionVersions", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
