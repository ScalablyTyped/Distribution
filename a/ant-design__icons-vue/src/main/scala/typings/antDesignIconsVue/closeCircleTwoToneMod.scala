package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object closeCircleTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/CloseCircleTwoTone", JSImport.Default)
  @js.native
  val default: CloseCircleTwoToneIconType = js.native
  
  @js.native
  trait CloseCircleTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_CloseCircleTwoToneIconType: String = js.native
  }
  
  type _To = CloseCircleTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `closeCircleTwoToneMod.foo` */
  override def _to: CloseCircleTwoToneIconType = default
}
