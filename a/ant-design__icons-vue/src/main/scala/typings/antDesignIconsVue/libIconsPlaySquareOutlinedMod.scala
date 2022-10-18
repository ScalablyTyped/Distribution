package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsPlaySquareOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/PlaySquareOutlined", JSImport.Default)
  @js.native
  val default: PlaySquareOutlinedIconType = js.native
  
  @js.native
  trait PlaySquareOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_PlaySquareOutlinedIconType: String = js.native
  }
  
  type _To = PlaySquareOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsPlaySquareOutlinedMod.foo` */
  override def _to: PlaySquareOutlinedIconType = default
}
