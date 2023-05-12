package typings.awsSdk.clientsDevopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAnomaliesForInsightFilters extends StObject {
  
  var ServiceCollection: js.UndefOr[typings.awsSdk.clientsDevopsguruMod.ServiceCollection] = js.undefined
}
object ListAnomaliesForInsightFilters {
  
  inline def apply(): ListAnomaliesForInsightFilters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAnomaliesForInsightFilters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListAnomaliesForInsightFilters] (val x: Self) extends AnyVal {
    
    inline def setServiceCollection(value: ServiceCollection): Self = StObject.set(x, "ServiceCollection", value.asInstanceOf[js.Any])
    
    inline def setServiceCollectionUndefined: Self = StObject.set(x, "ServiceCollection", js.undefined)
  }
}
