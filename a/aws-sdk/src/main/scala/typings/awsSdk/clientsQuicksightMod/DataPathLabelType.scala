package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataPathLabelType extends StObject {
  
  /**
    * The field ID of the field that the data label needs to be applied to.
    */
  var FieldId: js.UndefOr[typings.awsSdk.clientsQuicksightMod.FieldId] = js.undefined
  
  /**
    * The actual value of the field that is labeled.
    */
  var FieldValue: js.UndefOr[typings.awsSdk.clientsQuicksightMod.FieldValue] = js.undefined
  
  /**
    * The visibility of the data label.
    */
  var Visibility: js.UndefOr[typings.awsSdk.clientsQuicksightMod.Visibility] = js.undefined
}
object DataPathLabelType {
  
  inline def apply(): DataPathLabelType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataPathLabelType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataPathLabelType] (val x: Self) extends AnyVal {
    
    inline def setFieldId(value: FieldId): Self = StObject.set(x, "FieldId", value.asInstanceOf[js.Any])
    
    inline def setFieldIdUndefined: Self = StObject.set(x, "FieldId", js.undefined)
    
    inline def setFieldValue(value: FieldValue): Self = StObject.set(x, "FieldValue", value.asInstanceOf[js.Any])
    
    inline def setFieldValueUndefined: Self = StObject.set(x, "FieldValue", js.undefined)
    
    inline def setVisibility(value: Visibility): Self = StObject.set(x, "Visibility", value.asInstanceOf[js.Any])
    
    inline def setVisibilityUndefined: Self = StObject.set(x, "Visibility", js.undefined)
  }
}
