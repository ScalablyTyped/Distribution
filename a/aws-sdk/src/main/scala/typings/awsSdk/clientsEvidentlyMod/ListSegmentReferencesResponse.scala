package typings.awsSdk.clientsEvidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSegmentReferencesResponse extends StObject {
  
  /**
    * The token to use in a subsequent ListSegmentReferences operation to return the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * An array of structures, where each structure contains information about one experiment or launch that uses this segment. 
    */
  var referencedBy: js.UndefOr[RefResourceList] = js.undefined
}
object ListSegmentReferencesResponse {
  
  inline def apply(): ListSegmentReferencesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSegmentReferencesResponse]
  }
  
  extension [Self <: ListSegmentReferencesResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setReferencedBy(value: RefResourceList): Self = StObject.set(x, "referencedBy", value.asInstanceOf[js.Any])
    
    inline def setReferencedByUndefined: Self = StObject.set(x, "referencedBy", js.undefined)
    
    inline def setReferencedByVarargs(value: RefResource*): Self = StObject.set(x, "referencedBy", js.Array(value*))
  }
}
