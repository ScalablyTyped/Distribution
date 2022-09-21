package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object poundCircleTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/PoundCircleTwoTone", JSImport.Default)
  @js.native
  val default: PoundCircleTwoToneIconType = js.native
  
  @js.native
  trait PoundCircleTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_PoundCircleTwoToneIconType: String = js.native
  }
  
  type _To = PoundCircleTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `poundCircleTwoToneMod.foo` */
  override def _to: PoundCircleTwoToneIconType = default
}
