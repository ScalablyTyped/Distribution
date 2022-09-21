package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object unlockTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/UnlockTwoTone", JSImport.Default)
  @js.native
  val default: UnlockTwoToneIconType = js.native
  
  @js.native
  trait UnlockTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_UnlockTwoToneIconType: String = js.native
  }
  
  type _To = UnlockTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `unlockTwoToneMod.foo` */
  override def _to: UnlockTwoToneIconType = default
}
