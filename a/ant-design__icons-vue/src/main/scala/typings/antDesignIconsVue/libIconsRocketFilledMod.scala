package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsRocketFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/RocketFilled", JSImport.Default)
  @js.native
  val default: RocketFilledIconType = js.native
  
  @js.native
  trait RocketFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_RocketFilledIconType: String = js.native
  }
  
  type _To = RocketFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsRocketFilledMod.foo` */
  override def _to: RocketFilledIconType = default
}
