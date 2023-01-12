package typings.awsSdk.clientsGamesparksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListExtensionsResult extends StObject {
  
  /**
    * The list of extensions.
    */
  var Extensions: js.UndefOr[ExtensionDetailsList] = js.undefined
  
  /**
    * The token that indicates the start of the next sequential page of results.  Use this value when making the next call to this operation to continue where the last one finished. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsGamesparksMod.NextToken] = js.undefined
}
object ListExtensionsResult {
  
  inline def apply(): ListExtensionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListExtensionsResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListExtensionsResult] (val x: Self) extends AnyVal {
    
    inline def setExtensions(value: ExtensionDetailsList): Self = StObject.set(x, "Extensions", value.asInstanceOf[js.Any])
    
    inline def setExtensionsUndefined: Self = StObject.set(x, "Extensions", js.undefined)
    
    inline def setExtensionsVarargs(value: ExtensionDetails*): Self = StObject.set(x, "Extensions", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
