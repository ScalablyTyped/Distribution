package typings.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RefreshSchemasResponse extends StObject {
  
  /**
    * The status of the refreshed schema.
    */
  var RefreshSchemasStatus: js.UndefOr[typings.awsSdk.clientsDmsMod.RefreshSchemasStatus] = js.undefined
}
object RefreshSchemasResponse {
  
  inline def apply(): RefreshSchemasResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RefreshSchemasResponse]
  }
  
  extension [Self <: RefreshSchemasResponse](x: Self) {
    
    inline def setRefreshSchemasStatus(value: RefreshSchemasStatus): Self = StObject.set(x, "RefreshSchemasStatus", value.asInstanceOf[js.Any])
    
    inline def setRefreshSchemasStatusUndefined: Self = StObject.set(x, "RefreshSchemasStatus", js.undefined)
  }
}
