package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsScheduleTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/ScheduleTwoTone", JSImport.Default)
  @js.native
  val default: ScheduleTwoToneIconType = js.native
  
  @js.native
  trait ScheduleTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_ScheduleTwoToneIconType: String = js.native
  }
  
  type _To = ScheduleTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsScheduleTwoToneMod.foo` */
  override def _to: ScheduleTwoToneIconType = default
}
