package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableFieldOption extends StObject {
  
  /**
    * The custom label for a table field.
    */
  var CustomLabel: js.UndefOr[typings.awsSdk.clientsQuicksightMod.CustomLabel] = js.undefined
  
  /**
    * The field ID for a table field.
    */
  var FieldId: typings.awsSdk.clientsQuicksightMod.FieldId
  
  /**
    * The URL configuration for a table field.
    */
  var URLStyling: js.UndefOr[TableFieldURLConfiguration] = js.undefined
  
  /**
    * The visibility of a table field.
    */
  var Visibility: js.UndefOr[typings.awsSdk.clientsQuicksightMod.Visibility] = js.undefined
  
  /**
    * The width for a table field.
    */
  var Width: js.UndefOr[PixelLength] = js.undefined
}
object TableFieldOption {
  
  inline def apply(FieldId: FieldId): TableFieldOption = {
    val __obj = js.Dynamic.literal(FieldId = FieldId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableFieldOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TableFieldOption] (val x: Self) extends AnyVal {
    
    inline def setCustomLabel(value: CustomLabel): Self = StObject.set(x, "CustomLabel", value.asInstanceOf[js.Any])
    
    inline def setCustomLabelUndefined: Self = StObject.set(x, "CustomLabel", js.undefined)
    
    inline def setFieldId(value: FieldId): Self = StObject.set(x, "FieldId", value.asInstanceOf[js.Any])
    
    inline def setURLStyling(value: TableFieldURLConfiguration): Self = StObject.set(x, "URLStyling", value.asInstanceOf[js.Any])
    
    inline def setURLStylingUndefined: Self = StObject.set(x, "URLStyling", js.undefined)
    
    inline def setVisibility(value: Visibility): Self = StObject.set(x, "Visibility", value.asInstanceOf[js.Any])
    
    inline def setVisibilityUndefined: Self = StObject.set(x, "Visibility", js.undefined)
    
    inline def setWidth(value: PixelLength): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "Width", js.undefined)
  }
}
