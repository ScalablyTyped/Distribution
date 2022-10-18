package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsInteractionFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/InteractionFilled", JSImport.Default)
  @js.native
  val default: InteractionFilledIconType = js.native
  
  @js.native
  trait InteractionFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_InteractionFilledIconType: String = js.native
  }
  
  type _To = InteractionFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsInteractionFilledMod.foo` */
  override def _to: InteractionFilledIconType = default
}
