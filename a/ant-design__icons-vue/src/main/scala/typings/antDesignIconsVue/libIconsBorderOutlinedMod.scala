package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsBorderOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/BorderOutlined", JSImport.Default)
  @js.native
  val default: BorderOutlinedIconType = js.native
  
  @js.native
  trait BorderOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_BorderOutlinedIconType: String = js.native
  }
  
  type _To = BorderOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsBorderOutlinedMod.foo` */
  override def _to: BorderOutlinedIconType = default
}
