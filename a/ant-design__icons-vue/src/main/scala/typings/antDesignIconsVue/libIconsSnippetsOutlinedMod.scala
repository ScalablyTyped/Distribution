package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsSnippetsOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/SnippetsOutlined", JSImport.Default)
  @js.native
  val default: SnippetsOutlinedIconType = js.native
  
  @js.native
  trait SnippetsOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_SnippetsOutlinedIconType: String = js.native
  }
  
  type _To = SnippetsOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsSnippetsOutlinedMod.foo` */
  override def _to: SnippetsOutlinedIconType = default
}
