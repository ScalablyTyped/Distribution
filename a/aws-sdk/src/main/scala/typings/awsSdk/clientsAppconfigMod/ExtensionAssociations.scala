package typings.awsSdk.clientsAppconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtensionAssociations extends StObject {
  
  /**
    * The list of extension associations. Each item represents an extension association to an application, environment, or configuration profile. 
    */
  var Items: js.UndefOr[ExtensionAssociationSummaries] = js.undefined
  
  /**
    * The token for the next set of items to return. Use this token to get the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsAppconfigMod.NextToken] = js.undefined
}
object ExtensionAssociations {
  
  inline def apply(): ExtensionAssociations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtensionAssociations]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExtensionAssociations] (val x: Self) extends AnyVal {
    
    inline def setItems(value: ExtensionAssociationSummaries): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    inline def setItemsVarargs(value: ExtensionAssociationSummary*): Self = StObject.set(x, "Items", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
