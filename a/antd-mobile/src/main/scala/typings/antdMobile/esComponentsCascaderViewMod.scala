package typings.antdMobile

import typings.antdMobile.anon.PartialCascaderViewProps
import typings.antdMobile.anon.WeakValidationMapCascader
import typings.antdMobile.esComponentsCascaderViewCascaderViewMod.CascaderOption
import typings.antdMobile.esComponentsCascaderViewCascaderViewMod.CascaderViewProps
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsCascaderViewMod {
  
  /* Inlined react.react.FC<antd-mobile.antd-mobile/es/components/cascader-view/cascader-view.CascaderViewProps> & {  optionSkeleton :std.Array<antd-mobile.antd-mobile/es/components/cascader-view/cascader-view.CascaderOption>} */
  object default {
    
    inline def apply(props: CascaderViewProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
    inline def apply(props: CascaderViewProps, context: Any): ReactElement | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ReactElement | Null]
    
    @JSImport("antd-mobile/es/components/cascader-view", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile/es/components/cascader-view", "default.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
    inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/cascader-view", "default.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialCascaderViewProps] = js.native
    inline def defaultProps_=(x: js.UndefOr[PartialCascaderViewProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/cascader-view", "default.displayName")
    @js.native
    def displayName: js.UndefOr[String] = js.native
    inline def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/cascader-view", "default.optionSkeleton")
    @js.native
    def optionSkeleton: js.Array[CascaderOption] = js.native
    inline def optionSkeleton_=(x: js.Array[CascaderOption]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("optionSkeleton")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/cascader-view", "default.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapCascader] = js.native
    inline def propTypes_=(x: js.UndefOr[WeakValidationMapCascader]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
}
