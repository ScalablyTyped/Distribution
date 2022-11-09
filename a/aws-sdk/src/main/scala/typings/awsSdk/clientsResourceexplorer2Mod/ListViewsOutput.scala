package typings.awsSdk.clientsResourceexplorer2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListViewsOutput extends StObject {
  
  /**
    * If present, indicates that more output is available than is included in the current response. Use this value in the NextToken request parameter in a subsequent call to the operation to get the next part of the output. You should repeat this until the NextToken response element comes back as null.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The list of views available in the Amazon Web Services Region in which you called this operation.
    */
  var Views: js.UndefOr[ViewArnList] = js.undefined
}
object ListViewsOutput {
  
  inline def apply(): ListViewsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListViewsOutput]
  }
  
  extension [Self <: ListViewsOutput](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setViews(value: ViewArnList): Self = StObject.set(x, "Views", value.asInstanceOf[js.Any])
    
    inline def setViewsUndefined: Self = StObject.set(x, "Views", js.undefined)
    
    inline def setViewsVarargs(value: String*): Self = StObject.set(x, "Views", js.Array(value*))
  }
}
