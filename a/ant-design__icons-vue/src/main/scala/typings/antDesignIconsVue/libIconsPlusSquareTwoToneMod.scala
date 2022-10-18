package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsPlusSquareTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/PlusSquareTwoTone", JSImport.Default)
  @js.native
  val default: PlusSquareTwoToneIconType = js.native
  
  @js.native
  trait PlusSquareTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_PlusSquareTwoToneIconType: String = js.native
  }
  
  type _To = PlusSquareTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsPlusSquareTwoToneMod.foo` */
  override def _to: PlusSquareTwoToneIconType = default
}
