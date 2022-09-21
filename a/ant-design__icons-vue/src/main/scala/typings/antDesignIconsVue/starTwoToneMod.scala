package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object starTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/StarTwoTone", JSImport.Default)
  @js.native
  val default: StarTwoToneIconType = js.native
  
  @js.native
  trait StarTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_StarTwoToneIconType: String = js.native
  }
  
  type _To = StarTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `starTwoToneMod.foo` */
  override def _to: StarTwoToneIconType = default
}
