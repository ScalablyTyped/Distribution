package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsFastBackwardOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/FastBackwardOutlined", JSImport.Default)
  @js.native
  val default: FastBackwardOutlinedIconType = js.native
  
  @js.native
  trait FastBackwardOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_FastBackwardOutlinedIconType: String = js.native
  }
  
  type _To = FastBackwardOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsFastBackwardOutlinedMod.foo` */
  override def _to: FastBackwardOutlinedIconType = default
}
