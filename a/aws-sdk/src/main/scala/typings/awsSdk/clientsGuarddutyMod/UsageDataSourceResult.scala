package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UsageDataSourceResult extends StObject {
  
  /**
    * The data source type that generated usage.
    */
  var DataSource: js.UndefOr[typings.awsSdk.clientsGuarddutyMod.DataSource] = js.undefined
  
  /**
    * Represents the total of usage for the specified data source.
    */
  var Total: js.UndefOr[typings.awsSdk.clientsGuarddutyMod.Total] = js.undefined
}
object UsageDataSourceResult {
  
  inline def apply(): UsageDataSourceResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UsageDataSourceResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UsageDataSourceResult] (val x: Self) extends AnyVal {
    
    inline def setDataSource(value: DataSource): Self = StObject.set(x, "DataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "DataSource", js.undefined)
    
    inline def setTotal(value: Total): Self = StObject.set(x, "Total", value.asInstanceOf[js.Any])
    
    inline def setTotalUndefined: Self = StObject.set(x, "Total", js.undefined)
  }
}
