package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsCarryOutTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/CarryOutTwoTone", JSImport.Default)
  @js.native
  val default: CarryOutTwoToneIconType = js.native
  
  @js.native
  trait CarryOutTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_CarryOutTwoToneIconType: String = js.native
  }
  
  type _To = CarryOutTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsCarryOutTwoToneMod.foo` */
  override def _to: CarryOutTwoToneIconType = default
}
