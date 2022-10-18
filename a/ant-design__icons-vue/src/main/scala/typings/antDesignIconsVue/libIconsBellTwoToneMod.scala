package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsBellTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/BellTwoTone", JSImport.Default)
  @js.native
  val default: BellTwoToneIconType = js.native
  
  @js.native
  trait BellTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_BellTwoToneIconType: String = js.native
  }
  
  type _To = BellTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsBellTwoToneMod.foo` */
  override def _to: BellTwoToneIconType = default
}
