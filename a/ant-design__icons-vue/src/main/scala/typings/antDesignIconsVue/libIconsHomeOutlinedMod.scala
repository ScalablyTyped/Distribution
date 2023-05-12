package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsHomeOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/HomeOutlined", JSImport.Default)
  @js.native
  val default: HomeOutlinedIconType = js.native
  
  @js.native
  trait HomeOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_HomeOutlinedIconType: String = js.native
  }
  
  type _To = HomeOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsHomeOutlinedMod.foo` */
  override def _to: HomeOutlinedIconType = default
}
