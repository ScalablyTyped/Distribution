package typings.awsSdk.clientsSsoadminMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OperationStatusFilter extends StObject {
  
  /**
    * Filters the list operations result based on the status attribute.
    */
  var Status: js.UndefOr[StatusValues] = js.undefined
}
object OperationStatusFilter {
  
  inline def apply(): OperationStatusFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OperationStatusFilter]
  }
  
  extension [Self <: OperationStatusFilter](x: Self) {
    
    inline def setStatus(value: StatusValues): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
