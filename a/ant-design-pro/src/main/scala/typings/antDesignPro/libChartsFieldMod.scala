package typings.antDesignPro

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libChartsFieldMod {
  
  @JSImport("ant-design-pro/lib/Charts/Field", JSImport.Default)
  @js.native
  open class default () extends Component[IFieldProps, Any, Any]
  
  type Field = Component[IFieldProps, Any, Any]
  
  trait IFieldProps extends StObject {
    
    var label: ReactNode
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var value: ReactNode
  }
  object IFieldProps {
    
    inline def apply(): IFieldProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IFieldProps]
    }
    
    extension [Self <: IFieldProps](x: Self) {
      
      inline def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setValue(value: ReactNode): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
