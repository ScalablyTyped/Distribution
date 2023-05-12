package typings.awsSdk.clientsIotroborunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSitesResponse extends StObject {
  
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  var sites: js.UndefOr[Sites] = js.undefined
}
object ListSitesResponse {
  
  inline def apply(): ListSitesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSitesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListSitesResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setSites(value: Sites): Self = StObject.set(x, "sites", value.asInstanceOf[js.Any])
    
    inline def setSitesUndefined: Self = StObject.set(x, "sites", js.undefined)
    
    inline def setSitesVarargs(value: Site*): Self = StObject.set(x, "sites", js.Array(value*))
  }
}
