package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsLikeTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/LikeTwoTone", JSImport.Default)
  @js.native
  val default: LikeTwoToneIconType = js.native
  
  @js.native
  trait LikeTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_LikeTwoToneIconType: String = js.native
  }
  
  type _To = LikeTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsLikeTwoToneMod.foo` */
  override def _to: LikeTwoToneIconType = default
}
