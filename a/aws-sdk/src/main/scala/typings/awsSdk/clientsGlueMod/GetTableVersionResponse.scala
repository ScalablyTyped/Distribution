package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTableVersionResponse extends StObject {
  
  /**
    * The requested table version.
    */
  var TableVersion: js.UndefOr[typings.awsSdk.clientsGlueMod.TableVersion] = js.undefined
}
object GetTableVersionResponse {
  
  inline def apply(): GetTableVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTableVersionResponse]
  }
  
  extension [Self <: GetTableVersionResponse](x: Self) {
    
    inline def setTableVersion(value: TableVersion): Self = StObject.set(x, "TableVersion", value.asInstanceOf[js.Any])
    
    inline def setTableVersionUndefined: Self = StObject.set(x, "TableVersion", js.undefined)
  }
}
