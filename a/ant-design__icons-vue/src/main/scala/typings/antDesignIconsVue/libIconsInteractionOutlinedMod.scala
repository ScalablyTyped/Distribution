package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsInteractionOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/InteractionOutlined", JSImport.Default)
  @js.native
  val default: InteractionOutlinedIconType = js.native
  
  @js.native
  trait InteractionOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_InteractionOutlinedIconType: String = js.native
  }
  
  type _To = InteractionOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsInteractionOutlinedMod.foo` */
  override def _to: InteractionOutlinedIconType = default
}
