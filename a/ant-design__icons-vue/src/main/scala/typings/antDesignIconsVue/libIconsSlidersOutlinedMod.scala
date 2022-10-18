package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsSlidersOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/SlidersOutlined", JSImport.Default)
  @js.native
  val default: SlidersOutlinedIconType = js.native
  
  @js.native
  trait SlidersOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_SlidersOutlinedIconType: String = js.native
  }
  
  type _To = SlidersOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsSlidersOutlinedMod.foo` */
  override def _to: SlidersOutlinedIconType = default
}
