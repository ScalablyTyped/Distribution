package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.antdStrings.error
import typings.antd.antdStrings.finish
import typings.antd.antdStrings.horizontal
import typings.antd.antdStrings.navigation
import typings.antd.antdStrings.process
import typings.antd.antdStrings.small
import typings.antd.antdStrings.vertical
import typings.antd.antdStrings.wait
import typings.rcSteps.anon.Description
import typings.rcSteps.libStepsMod.ProgressDotRender
import typings.react.mod.CSSProperties
import typings.react.mod.FunctionComponent
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStepsMod extends Shortcut {
  
  @JSImport("antd/lib/steps", JSImport.Default)
  @js.native
  val default: StepsType = js.native
  
  trait StepProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var description: js.UndefOr[ReactNode] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var icon: js.UndefOr[ReactNode] = js.undefined
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
    
    var status: js.UndefOr[wait | process | finish | error] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var subTitle: js.UndefOr[ReactNode] = js.undefined
    
    var title: js.UndefOr[ReactNode] = js.undefined
  }
  object StepProps {
    
    inline def apply(): StepProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StepProps]
    }
    
    extension [Self <: StepProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDescription(value: ReactNode): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setIcon(value: ReactNode): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setOnClick(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setStatus(value: wait | process | finish | error): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setSubTitle(value: ReactNode): Self = StObject.set(x, "subTitle", value.asInstanceOf[js.Any])
      
      inline def setSubTitleUndefined: Self = StObject.set(x, "subTitle", js.undefined)
      
      inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait StepsProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var current: js.UndefOr[Double] = js.undefined
    
    var direction: js.UndefOr[horizontal | vertical] = js.undefined
    
    var iconPrefix: js.UndefOr[String] = js.undefined
    
    var initial: js.UndefOr[Double] = js.undefined
    
    var labelPlacement: js.UndefOr[horizontal | vertical] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* current */ Double, Unit]] = js.undefined
    
    var percent: js.UndefOr[Double] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var progressDot: js.UndefOr[Boolean | ProgressDotRender] = js.undefined
    
    var responsive: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[typings.antd.antdStrings.default | small] = js.undefined
    
    var status: js.UndefOr[wait | process | finish | error] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var `type`: js.UndefOr[typings.antd.antdStrings.default | navigation] = js.undefined
  }
  object StepsProps {
    
    inline def apply(): StepsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StepsProps]
    }
    
    extension [Self <: StepsProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
      
      inline def setDirection(value: horizontal | vertical): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setIconPrefix(value: String): Self = StObject.set(x, "iconPrefix", value.asInstanceOf[js.Any])
      
      inline def setIconPrefixUndefined: Self = StObject.set(x, "iconPrefix", js.undefined)
      
      inline def setInitial(value: Double): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
      
      inline def setInitialUndefined: Self = StObject.set(x, "initial", js.undefined)
      
      inline def setLabelPlacement(value: horizontal | vertical): Self = StObject.set(x, "labelPlacement", value.asInstanceOf[js.Any])
      
      inline def setLabelPlacementUndefined: Self = StObject.set(x, "labelPlacement", js.undefined)
      
      inline def setOnChange(value: /* current */ Double => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
      
      inline def setPercentUndefined: Self = StObject.set(x, "percent", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setProgressDot(value: Boolean | ProgressDotRender): Self = StObject.set(x, "progressDot", value.asInstanceOf[js.Any])
      
      inline def setProgressDotFunction2(value: (/* iconDot */ Any, /* info */ Description) => ReactNode): Self = StObject.set(x, "progressDot", js.Any.fromFunction2(value))
      
      inline def setProgressDotUndefined: Self = StObject.set(x, "progressDot", js.undefined)
      
      inline def setResponsive(value: Boolean): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
      
      inline def setResponsiveUndefined: Self = StObject.set(x, "responsive", js.undefined)
      
      inline def setSize(value: typings.antd.antdStrings.default | small): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStatus(value: wait | process | finish | error): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setType(value: typings.antd.antdStrings.default | navigation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait StepsType
    extends StObject
       with FunctionComponent[StepsProps] {
    
    var Step: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof RcSteps.Step */ Any = js.native
  }
  
  type _To = StepsType
  
  /* This means you don't have to write `default`, but can instead just say `libStepsMod.foo` */
  override def _to: StepsType = default
}
