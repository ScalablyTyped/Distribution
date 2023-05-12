package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsToTopOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/ToTopOutlined", JSImport.Default)
  @js.native
  val default: ToTopOutlinedIconType = js.native
  
  @js.native
  trait ToTopOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_ToTopOutlinedIconType: String = js.native
  }
  
  type _To = ToTopOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsToTopOutlinedMod.foo` */
  override def _to: ToTopOutlinedIconType = default
}
