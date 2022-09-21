package typings.antdMobile

import typings.antdMobile.collapseCollapseMod.CollapsePanelProps
import typings.antdMobile.collapseCollapseMod.CollapseProps
import typings.react.mod.FC
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import typings.react.mod.WeakValidationMap
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object collapseMod {
  
  /* Inlined react.react.FC<antd-mobile.antd-mobile/es/components/collapse/collapse.CollapseProps> & {  Panel :react.react.FC<antd-mobile.antd-mobile/es/components/collapse/collapse.CollapsePanelProps>} */
  object default {
    
    inline def apply(props: CollapseProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
    inline def apply(props: CollapseProps, context: Any): ReactElement | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ReactElement | Null]
    
    @JSImport("antd-mobile/es/components/collapse", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile/es/components/collapse", "default.Panel")
    @js.native
    def Panel: FC[CollapsePanelProps] = js.native
    inline def Panel_=(x: FC[CollapsePanelProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Panel")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/collapse", "default.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
    inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/collapse", "default.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[Partial[CollapseProps]] = js.native
    inline def defaultProps_=(x: js.UndefOr[Partial[CollapseProps]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/collapse", "default.displayName")
    @js.native
    def displayName: js.UndefOr[String] = js.native
    inline def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/collapse", "default.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMap[CollapseProps]] = js.native
    inline def propTypes_=(x: js.UndefOr[WeakValidationMap[CollapseProps]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
}
