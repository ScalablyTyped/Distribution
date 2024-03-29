package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsFireOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/FireOutlined", JSImport.Default)
  @js.native
  val default: FireOutlinedIconType = js.native
  
  @js.native
  trait FireOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_FireOutlinedIconType: String = js.native
  }
  
  type _To = FireOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsFireOutlinedMod.foo` */
  override def _to: FireOutlinedIconType = default
}
