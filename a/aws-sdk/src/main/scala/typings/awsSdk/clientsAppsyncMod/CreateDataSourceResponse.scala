package typings.awsSdk.clientsAppsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDataSourceResponse extends StObject {
  
  /**
    * The DataSource object.
    */
  var dataSource: js.UndefOr[DataSource] = js.undefined
}
object CreateDataSourceResponse {
  
  inline def apply(): CreateDataSourceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDataSourceResponse]
  }
  
  extension [Self <: CreateDataSourceResponse](x: Self) {
    
    inline def setDataSource(value: DataSource): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
  }
}
