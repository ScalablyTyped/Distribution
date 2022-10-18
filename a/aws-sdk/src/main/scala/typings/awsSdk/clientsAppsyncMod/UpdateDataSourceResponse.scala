package typings.awsSdk.clientsAppsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDataSourceResponse extends StObject {
  
  /**
    * The updated DataSource object.
    */
  var dataSource: js.UndefOr[DataSource] = js.undefined
}
object UpdateDataSourceResponse {
  
  inline def apply(): UpdateDataSourceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDataSourceResponse]
  }
  
  extension [Self <: UpdateDataSourceResponse](x: Self) {
    
    inline def setDataSource(value: DataSource): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
  }
}
