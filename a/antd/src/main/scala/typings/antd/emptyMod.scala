package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.CSSProperties
import typings.react.mod.FunctionComponent
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object emptyMod extends Shortcut {
  
  @JSImport("antd/lib/empty", JSImport.Default)
  @js.native
  val default: EmptyType = js.native
  
  trait EmptyProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var description: js.UndefOr[ReactNode] = js.undefined
    
    var image: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * @since 3.16.0
      */
    var imageStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object EmptyProps {
    
    inline def apply(): EmptyProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EmptyProps]
    }
    
    extension [Self <: EmptyProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDescription(value: ReactNode): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setImage(value: ReactNode): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setImageStyle(value: CSSProperties): Self = StObject.set(x, "imageStyle", value.asInstanceOf[js.Any])
      
      inline def setImageStyleUndefined: Self = StObject.set(x, "imageStyle", js.undefined)
      
      inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  @js.native
  trait EmptyType
    extends StObject
       with FunctionComponent[EmptyProps] {
    
    var PRESENTED_IMAGE_DEFAULT: ReactNode = js.native
    
    var PRESENTED_IMAGE_SIMPLE: ReactNode = js.native
  }
  
  trait TransferLocale extends StObject {
    
    var description: String
  }
  object TransferLocale {
    
    inline def apply(description: String): TransferLocale = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransferLocale]
    }
    
    extension [Self <: TransferLocale](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = EmptyType
  
  /* This means you don't have to write `default`, but can instead just say `emptyMod.foo` */
  override def _to: EmptyType = default
}
