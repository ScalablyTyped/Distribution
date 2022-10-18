package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsThunderboltOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/ThunderboltOutlined", JSImport.Default)
  @js.native
  val default: ThunderboltOutlinedIconType = js.native
  
  @js.native
  trait ThunderboltOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_ThunderboltOutlinedIconType: String = js.native
  }
  
  type _To = ThunderboltOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsThunderboltOutlinedMod.foo` */
  override def _to: ThunderboltOutlinedIconType = default
}
