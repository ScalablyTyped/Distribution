package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsDownSquareTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/DownSquareTwoTone", JSImport.Default)
  @js.native
  val default: DownSquareTwoToneIconType = js.native
  
  @js.native
  trait DownSquareTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_DownSquareTwoToneIconType: String = js.native
  }
  
  type _To = DownSquareTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsDownSquareTwoToneMod.foo` */
  override def _to: DownSquareTwoToneIconType = default
}
