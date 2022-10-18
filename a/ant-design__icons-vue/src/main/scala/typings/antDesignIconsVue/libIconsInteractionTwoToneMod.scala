package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsInteractionTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/InteractionTwoTone", JSImport.Default)
  @js.native
  val default: InteractionTwoToneIconType = js.native
  
  @js.native
  trait InteractionTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_InteractionTwoToneIconType: String = js.native
  }
  
  type _To = InteractionTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsInteractionTwoToneMod.foo` */
  override def _to: InteractionTwoToneIconType = default
}
