package typings.awsSdk.clientsAuditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListControlsResponse extends StObject {
  
  /**
    *  The list of control metadata objects that the ListControls API returned. 
    */
  var controlMetadataList: js.UndefOr[ControlMetadataList] = js.undefined
  
  /**
    *  The pagination token that's used to fetch the next set of results. 
    */
  var nextToken: js.UndefOr[Token] = js.undefined
}
object ListControlsResponse {
  
  inline def apply(): ListControlsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListControlsResponse]
  }
  
  extension [Self <: ListControlsResponse](x: Self) {
    
    inline def setControlMetadataList(value: ControlMetadataList): Self = StObject.set(x, "controlMetadataList", value.asInstanceOf[js.Any])
    
    inline def setControlMetadataListUndefined: Self = StObject.set(x, "controlMetadataList", js.undefined)
    
    inline def setControlMetadataListVarargs(value: ControlMetadata*): Self = StObject.set(x, "controlMetadataList", js.Array(value*))
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
