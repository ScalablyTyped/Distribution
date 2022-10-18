package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsLinkedinOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/LinkedinOutlined", JSImport.Default)
  @js.native
  val default: LinkedinOutlinedIconType = js.native
  
  @js.native
  trait LinkedinOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_LinkedinOutlinedIconType: String = js.native
  }
  
  type _To = LinkedinOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsLinkedinOutlinedMod.foo` */
  override def _to: LinkedinOutlinedIconType = default
}
