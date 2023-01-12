package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTableResponse extends StObject {
  
  /**
    * The Table object that defines the specified table.
    */
  var Table: js.UndefOr[typings.awsSdk.clientsGlueMod.Table] = js.undefined
}
object GetTableResponse {
  
  inline def apply(): GetTableResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTableResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetTableResponse] (val x: Self) extends AnyVal {
    
    inline def setTable(value: Table): Self = StObject.set(x, "Table", value.asInstanceOf[js.Any])
    
    inline def setTableUndefined: Self = StObject.set(x, "Table", js.undefined)
  }
}
