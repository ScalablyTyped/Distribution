package typings.awsSdk.clientsMachinelearningMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDataSourceOutput extends StObject {
  
  /**
    * The ID assigned to the DataSource during creation. This value should be identical to the value of the DataSourceID in the request.
    */
  var DataSourceId: js.UndefOr[EntityId] = js.undefined
}
object UpdateDataSourceOutput {
  
  inline def apply(): UpdateDataSourceOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDataSourceOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateDataSourceOutput] (val x: Self) extends AnyVal {
    
    inline def setDataSourceId(value: EntityId): Self = StObject.set(x, "DataSourceId", value.asInstanceOf[js.Any])
    
    inline def setDataSourceIdUndefined: Self = StObject.set(x, "DataSourceId", js.undefined)
  }
}
