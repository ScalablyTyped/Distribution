package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mobileTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/MobileTwoTone", JSImport.Default)
  @js.native
  val default: MobileTwoToneIconType = js.native
  
  @js.native
  trait MobileTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_MobileTwoToneIconType: String = js.native
  }
  
  type _To = MobileTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `mobileTwoToneMod.foo` */
  override def _to: MobileTwoToneIconType = default
}
