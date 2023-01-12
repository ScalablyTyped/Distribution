package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDataSourceResponse extends StObject {
  
  /**
    * The identifier of the data source connector.
    */
  var Id: DataSourceId
}
object CreateDataSourceResponse {
  
  inline def apply(Id: DataSourceId): CreateDataSourceResponse = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDataSourceResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateDataSourceResponse] (val x: Self) extends AnyVal {
    
    inline def setId(value: DataSourceId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
