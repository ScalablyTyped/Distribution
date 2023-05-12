package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PivotTableFieldSubtotalOptions extends StObject {
  
  /**
    * The field ID of the subtotal options.
    */
  var FieldId: js.UndefOr[typings.awsSdk.clientsQuicksightMod.FieldId] = js.undefined
}
object PivotTableFieldSubtotalOptions {
  
  inline def apply(): PivotTableFieldSubtotalOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotTableFieldSubtotalOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PivotTableFieldSubtotalOptions] (val x: Self) extends AnyVal {
    
    inline def setFieldId(value: FieldId): Self = StObject.set(x, "FieldId", value.asInstanceOf[js.Any])
    
    inline def setFieldIdUndefined: Self = StObject.set(x, "FieldId", js.undefined)
  }
}
