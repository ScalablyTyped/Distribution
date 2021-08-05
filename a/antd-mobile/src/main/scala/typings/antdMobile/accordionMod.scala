package typings.antdMobile

import typings.antdMobile.anon.PrefixCls
import typings.antdMobile.propsTypeMod.AccordionPropsTypes
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accordionMod {
  
  @JSImport("antd-mobile/lib/accordion", JSImport.Default)
  @js.native
  class default () extends Accordion
  /* static members */
  object default {
    
    @JSImport("antd-mobile/lib/accordion", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile/lib/accordion", "default.Panel")
    @js.native
    def Panel: js.Any = js.native
    inline def Panel_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Panel")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/lib/accordion", "default.defaultProps")
    @js.native
    def defaultProps: PrefixCls = js.native
    inline def defaultProps_=(x: PrefixCls): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Accordion
    extends Component[AccordionProps, js.Any, js.Any]
  
  trait AccordionProps
    extends StObject
       with AccordionPropsTypes {
    
    var accordion: js.UndefOr[Boolean] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var openAnimation: js.UndefOr[js.Any] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object AccordionProps {
    
    inline def apply(): AccordionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AccordionProps]
    }
    
    extension [Self <: AccordionProps](x: Self) {
      
      inline def setAccordion(value: Boolean): Self = StObject.set(x, "accordion", value.asInstanceOf[js.Any])
      
      inline def setAccordionUndefined: Self = StObject.set(x, "accordion", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setOpenAnimation(value: js.Any): Self = StObject.set(x, "openAnimation", value.asInstanceOf[js.Any])
      
      inline def setOpenAnimationUndefined: Self = StObject.set(x, "openAnimation", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
