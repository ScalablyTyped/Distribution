package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsSaveTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/SaveTwoTone", JSImport.Default)
  @js.native
  val default: SaveTwoToneIconType = js.native
  
  @js.native
  trait SaveTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_SaveTwoToneIconType: String = js.native
  }
  
  type _To = SaveTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsSaveTwoToneMod.foo` */
  override def _to: SaveTwoToneIconType = default
}
