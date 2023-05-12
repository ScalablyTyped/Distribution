package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsForwardFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/ForwardFilled", JSImport.Default)
  @js.native
  val default: ForwardFilledIconType = js.native
  
  @js.native
  trait ForwardFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_ForwardFilledIconType: String = js.native
  }
  
  type _To = ForwardFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsForwardFilledMod.foo` */
  override def _to: ForwardFilledIconType = default
}
