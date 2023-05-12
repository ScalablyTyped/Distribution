package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldLabelType extends StObject {
  
  /**
    * Indicates the field that is targeted by the field label.
    */
  var FieldId: js.UndefOr[typings.awsSdk.clientsQuicksightMod.FieldId] = js.undefined
  
  /**
    * The visibility of the field label.
    */
  var Visibility: js.UndefOr[typings.awsSdk.clientsQuicksightMod.Visibility] = js.undefined
}
object FieldLabelType {
  
  inline def apply(): FieldLabelType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldLabelType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FieldLabelType] (val x: Self) extends AnyVal {
    
    inline def setFieldId(value: FieldId): Self = StObject.set(x, "FieldId", value.asInstanceOf[js.Any])
    
    inline def setFieldIdUndefined: Self = StObject.set(x, "FieldId", js.undefined)
    
    inline def setVisibility(value: Visibility): Self = StObject.set(x, "Visibility", value.asInstanceOf[js.Any])
    
    inline def setVisibilityUndefined: Self = StObject.set(x, "Visibility", js.undefined)
  }
}
