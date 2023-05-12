package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsFastForwardOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/FastForwardOutlined", JSImport.Default)
  @js.native
  val default: FastForwardOutlinedIconType = js.native
  
  @js.native
  trait FastForwardOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_FastForwardOutlinedIconType: String = js.native
  }
  
  type _To = FastForwardOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsFastForwardOutlinedMod.foo` */
  override def _to: FastForwardOutlinedIconType = default
}
