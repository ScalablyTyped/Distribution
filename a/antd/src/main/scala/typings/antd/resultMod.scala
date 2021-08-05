package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.anon.PickAntdIconPropschildren
import typings.react.mod.CSSProperties
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.FunctionComponent
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resultMod extends Shortcut {
  
  @JSImport("antd/lib/result", JSImport.Default)
  @js.native
  val default: ResultType = js.native
  
  object ExceptionMap {
    
    @JSImport("antd/lib/result", "ExceptionMap")
    @js.native
    val ^ : js.Any = js.native
    
    inline def `403`(): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("403")().asInstanceOf[Element]
    
    inline def `404`(): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("404")().asInstanceOf[Element]
    
    inline def `500`(): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("500")().asInstanceOf[Element]
  }
  
  object IconMap {
    
    @JSImport("antd/lib/result", "IconMap")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd/lib/result", "IconMap.error")
    @js.native
    def error: ForwardRefExoticComponent[PickAntdIconPropschildren] = js.native
    inline def error_=(x: ForwardRefExoticComponent[PickAntdIconPropschildren]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("error")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/lib/result", "IconMap.info")
    @js.native
    def info: ForwardRefExoticComponent[PickAntdIconPropschildren] = js.native
    inline def info_=(x: ForwardRefExoticComponent[PickAntdIconPropschildren]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("info")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/lib/result", "IconMap.success")
    @js.native
    def success: ForwardRefExoticComponent[PickAntdIconPropschildren] = js.native
    inline def success_=(x: ForwardRefExoticComponent[PickAntdIconPropschildren]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("success")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/lib/result", "IconMap.warning")
    @js.native
    def warning: ForwardRefExoticComponent[PickAntdIconPropschildren] = js.native
    inline def warning_=(x: ForwardRefExoticComponent[PickAntdIconPropschildren]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("warning")(x.asInstanceOf[js.Any])
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.antd.antdNumbers.`403`
    - typings.antd.antdNumbers.`404`
    - typings.antd.antdNumbers.`500`
    - typings.antd.antdStrings.`403`
    - typings.antd.antdStrings.`404`
    - typings.antd.antdStrings.`500`
  */
  trait ExceptionStatusType
    extends StObject
       with ResultStatusType
  object ExceptionStatusType {
    
    inline def `403`: typings.antd.antdNumbers.`403` = 403.asInstanceOf[typings.antd.antdNumbers.`403`]
    
    inline def `404`: typings.antd.antdNumbers.`404` = 404.asInstanceOf[typings.antd.antdNumbers.`404`]
    
    inline def `500`: typings.antd.antdNumbers.`500` = 500.asInstanceOf[typings.antd.antdNumbers.`500`]
  }
  
  trait ResultProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var extra: js.UndefOr[ReactNode] = js.undefined
    
    var icon: js.UndefOr[ReactNode] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var status: js.UndefOr[ResultStatusType] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var subTitle: js.UndefOr[ReactNode] = js.undefined
    
    var title: js.UndefOr[ReactNode] = js.undefined
  }
  object ResultProps {
    
    inline def apply(): ResultProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResultProps]
    }
    
    extension [Self <: ResultProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setExtra(value: ReactNode): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      inline def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
      
      inline def setIcon(value: ReactNode): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setStatus(value: ResultStatusType): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setSubTitle(value: ReactNode): Self = StObject.set(x, "subTitle", value.asInstanceOf[js.Any])
      
      inline def setSubTitleUndefined: Self = StObject.set(x, "subTitle", js.undefined)
      
      inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.antd.resultMod.ExceptionStatusType
    - typings.antd.antdStrings.success
    - typings.antd.antdStrings.error
    - typings.antd.antdStrings.info
    - typings.antd.antdStrings.warning
  */
  trait ResultStatusType extends StObject
  
  @js.native
  trait ResultType
    extends StObject
       with FunctionComponent[ResultProps] {
    
    var PRESENTED_IMAGE_403: ReactNode = js.native
    
    var PRESENTED_IMAGE_404: ReactNode = js.native
    
    var PRESENTED_IMAGE_500: ReactNode = js.native
  }
  
  type _To = ResultType
  
  /* This means you don't have to write `default`, but can instead just say `resultMod.foo` */
  override def _to: ResultType = default
}
