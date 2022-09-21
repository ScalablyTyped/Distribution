package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rightCircleTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/RightCircleTwoTone", JSImport.Default)
  @js.native
  val default: RightCircleTwoToneIconType = js.native
  
  @js.native
  trait RightCircleTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_RightCircleTwoToneIconType: String = js.native
  }
  
  type _To = RightCircleTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `rightCircleTwoToneMod.foo` */
  override def _to: RightCircleTwoToneIconType = default
}
