package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsStrikethroughOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/StrikethroughOutlined", JSImport.Default)
  @js.native
  val default: StrikethroughOutlinedIconType = js.native
  
  @js.native
  trait StrikethroughOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_StrikethroughOutlinedIconType: String = js.native
  }
  
  type _To = StrikethroughOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsStrikethroughOutlinedMod.foo` */
  override def _to: StrikethroughOutlinedIconType = default
}
