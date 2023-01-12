package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListServiceTemplatesInput extends StObject {
  
  /**
    * The maximum number of service templates to list.
    */
  var maxResults: js.UndefOr[MaxPageResults] = js.undefined
  
  /**
    * A token that indicates the location of the next service template in the array of service templates, after the list of service templates previously requested.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListServiceTemplatesInput {
  
  inline def apply(): ListServiceTemplatesInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListServiceTemplatesInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListServiceTemplatesInput] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: MaxPageResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
