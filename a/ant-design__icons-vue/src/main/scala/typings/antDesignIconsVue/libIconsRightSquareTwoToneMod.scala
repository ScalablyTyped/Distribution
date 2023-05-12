package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsRightSquareTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/RightSquareTwoTone", JSImport.Default)
  @js.native
  val default: RightSquareTwoToneIconType = js.native
  
  @js.native
  trait RightSquareTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_RightSquareTwoToneIconType: String = js.native
  }
  
  type _To = RightSquareTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsRightSquareTwoToneMod.foo` */
  override def _to: RightSquareTwoToneIconType = default
}
