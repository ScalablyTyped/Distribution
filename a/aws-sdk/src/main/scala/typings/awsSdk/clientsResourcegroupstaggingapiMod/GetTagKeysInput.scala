package typings.awsSdk.clientsResourcegroupstaggingapiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTagKeysInput extends StObject {
  
  /**
    * Specifies a PaginationToken response value from a previous request to indicate that you want the next page of results. Leave this parameter empty in your initial request.
    */
  var PaginationToken: js.UndefOr[typings.awsSdk.clientsResourcegroupstaggingapiMod.PaginationToken] = js.undefined
}
object GetTagKeysInput {
  
  inline def apply(): GetTagKeysInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTagKeysInput]
  }
  
  extension [Self <: GetTagKeysInput](x: Self) {
    
    inline def setPaginationToken(value: PaginationToken): Self = StObject.set(x, "PaginationToken", value.asInstanceOf[js.Any])
    
    inline def setPaginationTokenUndefined: Self = StObject.set(x, "PaginationToken", js.undefined)
  }
}
