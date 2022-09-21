package typings.antdMobile

import typings.antdMobile.anon.PartialRadioProps
import typings.antdMobile.anon.WeakValidationMapRadioPro
import typings.antdMobile.radioGroupMod.RadioGroupProps
import typings.antdMobile.radioRadioMod.RadioProps
import typings.react.mod.FC
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object radioMod {
  
  /* Inlined react.react.FC<antd-mobile.antd-mobile/es/components/radio/radio.RadioProps> & {  Group :react.react.FC<antd-mobile.antd-mobile/es/components/radio/group.RadioGroupProps>} */
  object default {
    
    inline def apply(props: RadioProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
    inline def apply(props: RadioProps, context: Any): ReactElement | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ReactElement | Null]
    
    @JSImport("antd-mobile/es/components/radio", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile/es/components/radio", "default.Group")
    @js.native
    def Group: FC[RadioGroupProps] = js.native
    inline def Group_=(x: FC[RadioGroupProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Group")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/radio", "default.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
    inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/radio", "default.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialRadioProps] = js.native
    inline def defaultProps_=(x: js.UndefOr[PartialRadioProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/radio", "default.displayName")
    @js.native
    def displayName: js.UndefOr[String] = js.native
    inline def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/radio", "default.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapRadioPro] = js.native
    inline def propTypes_=(x: js.UndefOr[WeakValidationMapRadioPro]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
}
