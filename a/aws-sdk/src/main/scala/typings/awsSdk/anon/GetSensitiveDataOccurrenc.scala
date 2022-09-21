package typings.awsSdk.anon

import typings.awsSdk.macie2Mod.string
import typings.awsSdk.serviceMod.WaiterConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined aws-sdk.aws-sdk/clients/macie2.GetSensitiveDataOccurrencesRequest & {  $waiter :aws-sdk.aws-sdk/lib/service.WaiterConfiguration | undefined} */
trait GetSensitiveDataOccurrenc extends StObject {
  
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.undefined
  
  /**
    * The unique identifier for the finding.
    */
  var findingId: string
}
object GetSensitiveDataOccurrenc {
  
  inline def apply(findingId: string): GetSensitiveDataOccurrenc = {
    val __obj = js.Dynamic.literal(findingId = findingId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSensitiveDataOccurrenc]
  }
  
  extension [Self <: GetSensitiveDataOccurrenc](x: Self) {
    
    inline def set$waiter(value: WaiterConfiguration): Self = StObject.set(x, "$waiter", value.asInstanceOf[js.Any])
    
    inline def set$waiterUndefined: Self = StObject.set(x, "$waiter", js.undefined)
    
    inline def setFindingId(value: string): Self = StObject.set(x, "findingId", value.asInstanceOf[js.Any])
  }
}
