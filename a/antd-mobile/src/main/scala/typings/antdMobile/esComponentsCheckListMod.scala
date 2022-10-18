package typings.antdMobile

import typings.antdMobile.anon.PartialCheckListProps
import typings.antdMobile.anon.WeakValidationMapCheckLis
import typings.antdMobile.esComponentsCheckListCheckListItemMod.CheckListItemProps
import typings.antdMobile.esComponentsCheckListCheckListMod.CheckListProps
import typings.react.mod.FC
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsCheckListMod {
  
  /* Inlined react.react.FC<antd-mobile.antd-mobile/es/components/check-list/check-list.CheckListProps> & {  Item :react.react.FC<antd-mobile.antd-mobile/es/components/check-list/check-list-item.CheckListItemProps>} */
  object default {
    
    inline def apply(props: CheckListProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
    inline def apply(props: CheckListProps, context: Any): ReactElement | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ReactElement | Null]
    
    @JSImport("antd-mobile/es/components/check-list", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile/es/components/check-list", "default.Item")
    @js.native
    def Item: FC[CheckListItemProps] = js.native
    inline def Item_=(x: FC[CheckListItemProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/check-list", "default.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
    inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/check-list", "default.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialCheckListProps] = js.native
    inline def defaultProps_=(x: js.UndefOr[PartialCheckListProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/check-list", "default.displayName")
    @js.native
    def displayName: js.UndefOr[String] = js.native
    inline def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/check-list", "default.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapCheckLis] = js.native
    inline def propTypes_=(x: js.UndefOr[WeakValidationMapCheckLis]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
}
