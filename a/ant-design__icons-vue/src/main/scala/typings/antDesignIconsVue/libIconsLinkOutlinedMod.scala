package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsLinkOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/LinkOutlined", JSImport.Default)
  @js.native
  val default: LinkOutlinedIconType = js.native
  
  @js.native
  trait LinkOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_LinkOutlinedIconType: String = js.native
  }
  
  type _To = LinkOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsLinkOutlinedMod.foo` */
  override def _to: LinkOutlinedIconType = default
}
