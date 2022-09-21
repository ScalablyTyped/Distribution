package typings.antDesignProProvider.anon

import typings.antDesignProProvider.mod.ProFieldFCMode
import typings.antDesignProProvider.mod.ProSchemaValueEnumMap
import typings.antDesignProProvider.mod.ProSchemaValueEnumObj
import typings.react.mod.Key
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@ant-design/pro-provider.@ant-design/pro-provider.ProFieldFCRenderProps, 'value' | 'onChange'> */
trait OmitProFieldFCRenderProps extends StObject {
  
  var fieldProps: js.UndefOr[Any] = js.undefined
  
  var label: js.UndefOr[ReactNode] = js.undefined
  
  var light: js.UndefOr[Boolean] = js.undefined
  
  var mode: js.UndefOr[ProFieldFCMode] = js.undefined
  
  var placeholder: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var plain: js.UndefOr[Boolean] = js.undefined
  
  var proFieldKey: js.UndefOr[Key] = js.undefined
  
  var readonly: js.UndefOr[Boolean] = js.undefined
  
  var text: ReactNode
  
  var valueEnum: js.UndefOr[ProSchemaValueEnumObj | ProSchemaValueEnumMap] = js.undefined
}
object OmitProFieldFCRenderProps {
  
  inline def apply(): OmitProFieldFCRenderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmitProFieldFCRenderProps]
  }
  
  extension [Self <: OmitProFieldFCRenderProps](x: Self) {
    
    inline def setFieldProps(value: Any): Self = StObject.set(x, "fieldProps", value.asInstanceOf[js.Any])
    
    inline def setFieldPropsUndefined: Self = StObject.set(x, "fieldProps", js.undefined)
    
    inline def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setLight(value: Boolean): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
    
    inline def setLightUndefined: Self = StObject.set(x, "light", js.undefined)
    
    inline def setMode(value: ProFieldFCMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setPlaceholder(value: String | js.Array[String]): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setPlaceholderVarargs(value: String*): Self = StObject.set(x, "placeholder", js.Array(value*))
    
    inline def setPlain(value: Boolean): Self = StObject.set(x, "plain", value.asInstanceOf[js.Any])
    
    inline def setPlainUndefined: Self = StObject.set(x, "plain", js.undefined)
    
    inline def setProFieldKey(value: Key): Self = StObject.set(x, "proFieldKey", value.asInstanceOf[js.Any])
    
    inline def setProFieldKeyUndefined: Self = StObject.set(x, "proFieldKey", js.undefined)
    
    inline def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
    
    inline def setReadonlyUndefined: Self = StObject.set(x, "readonly", js.undefined)
    
    inline def setText(value: ReactNode): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setValueEnum(value: ProSchemaValueEnumObj | ProSchemaValueEnumMap): Self = StObject.set(x, "valueEnum", value.asInstanceOf[js.Any])
    
    inline def setValueEnumUndefined: Self = StObject.set(x, "valueEnum", js.undefined)
  }
}
