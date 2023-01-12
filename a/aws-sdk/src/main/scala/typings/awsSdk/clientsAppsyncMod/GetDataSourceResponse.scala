package typings.awsSdk.clientsAppsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDataSourceResponse extends StObject {
  
  /**
    * The DataSource object.
    */
  var dataSource: js.UndefOr[DataSource] = js.undefined
}
object GetDataSourceResponse {
  
  inline def apply(): GetDataSourceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDataSourceResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetDataSourceResponse] (val x: Self) extends AnyVal {
    
    inline def setDataSource(value: DataSource): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
  }
}
