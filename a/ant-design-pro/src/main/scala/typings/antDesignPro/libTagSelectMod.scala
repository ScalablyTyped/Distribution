package typings.antDesignPro

import typings.antDesignPro.anon.CollapseText
import typings.antDesignPro.anon.TypeofTagSelectOption
import typings.antDesignPro.libTagSelectTagSelectOptionMod.TagSelectOptionProps
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTagSelectMod {
  
  @JSImport("ant-design-pro/lib/TagSelect", JSImport.Default)
  @js.native
  open class default () extends TagSelect
  /* static members */
  object default {
    
    @JSImport("ant-design-pro/lib/TagSelect", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ant-design-pro/lib/TagSelect", "default.Option")
    @js.native
    def Option: TypeofTagSelectOption = js.native
    inline def Option_=(x: TypeofTagSelectOption): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Option")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait TagSelect extends Component[TagSelectProps, Any, Any] {
    
    /* private */ var children: ReactElement | js.Array[ReactElement] = js.native
  }
  
  trait TagSelectProps extends StObject {
    
    var Option: TagSelectOptionProps
    
    var actionsText: js.UndefOr[CollapseText] = js.undefined
    
    var children: ReactElement | js.Array[ReactElement]
    
    var className: String
    
    var expandable: js.UndefOr[Boolean] = js.undefined
    
    var hideCheckAll: js.UndefOr[Boolean] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* value */ js.Array[String], Unit]] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var value: js.UndefOr[js.Array[Double | String]] = js.undefined
  }
  object TagSelectProps {
    
    inline def apply(Option: TagSelectOptionProps, children: ReactElement | js.Array[ReactElement], className: String): TagSelectProps = {
      val __obj = js.Dynamic.literal(Option = Option.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any])
      __obj.asInstanceOf[TagSelectProps]
    }
    
    extension [Self <: TagSelectProps](x: Self) {
      
      inline def setActionsText(value: CollapseText): Self = StObject.set(x, "actionsText", value.asInstanceOf[js.Any])
      
      inline def setActionsTextUndefined: Self = StObject.set(x, "actionsText", js.undefined)
      
      inline def setChildren(value: ReactElement | js.Array[ReactElement]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: ReactElement*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setExpandable(value: Boolean): Self = StObject.set(x, "expandable", value.asInstanceOf[js.Any])
      
      inline def setExpandableUndefined: Self = StObject.set(x, "expandable", js.undefined)
      
      inline def setHideCheckAll(value: Boolean): Self = StObject.set(x, "hideCheckAll", value.asInstanceOf[js.Any])
      
      inline def setHideCheckAllUndefined: Self = StObject.set(x, "hideCheckAll", js.undefined)
      
      inline def setOnChange(value: /* value */ js.Array[String] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOption(value: TagSelectOptionProps): Self = StObject.set(x, "Option", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setValue(value: js.Array[Double | String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValueVarargs(value: (Double | String)*): Self = StObject.set(x, "value", js.Array(value*))
    }
  }
}
