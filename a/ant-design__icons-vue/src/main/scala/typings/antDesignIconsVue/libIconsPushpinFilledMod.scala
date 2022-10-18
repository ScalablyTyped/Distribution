package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsPushpinFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/PushpinFilled", JSImport.Default)
  @js.native
  val default: PushpinFilledIconType = js.native
  
  @js.native
  trait PushpinFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_PushpinFilledIconType: String = js.native
  }
  
  type _To = PushpinFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsPushpinFilledMod.foo` */
  override def _to: PushpinFilledIconType = default
}
