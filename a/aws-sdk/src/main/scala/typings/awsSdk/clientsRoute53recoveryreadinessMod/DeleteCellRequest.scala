package typings.awsSdk.clientsRoute53recoveryreadinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteCellRequest extends StObject {
  
  /**
    * The name of the cell.
    */
  var CellName: string
}
object DeleteCellRequest {
  
  inline def apply(CellName: string): DeleteCellRequest = {
    val __obj = js.Dynamic.literal(CellName = CellName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCellRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteCellRequest] (val x: Self) extends AnyVal {
    
    inline def setCellName(value: string): Self = StObject.set(x, "CellName", value.asInstanceOf[js.Any])
  }
}
