package typings.awsSdk.appconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applications extends StObject {
  
  /**
    * The elements from this collection.
    */
  var Items: js.UndefOr[ApplicationList] = js.undefined
  
  /**
    * The token for the next set of items to return. Use this token to get the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.appconfigMod.NextToken] = js.undefined
}
object Applications {
  
  inline def apply(): Applications = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Applications]
  }
  
  extension [Self <: Applications](x: Self) {
    
    inline def setItems(value: ApplicationList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    inline def setItemsVarargs(value: Application*): Self = StObject.set(x, "Items", js.Array(value :_*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
