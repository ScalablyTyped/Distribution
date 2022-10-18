package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsUnorderedListOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/UnorderedListOutlined", JSImport.Default)
  @js.native
  val default: UnorderedListOutlinedIconType = js.native
  
  @js.native
  trait UnorderedListOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_UnorderedListOutlinedIconType: String = js.native
  }
  
  type _To = UnorderedListOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsUnorderedListOutlinedMod.foo` */
  override def _to: UnorderedListOutlinedIconType = default
}
