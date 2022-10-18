package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsUpOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/UpOutlined", JSImport.Default)
  @js.native
  val default: UpOutlinedIconType = js.native
  
  @js.native
  trait UpOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_UpOutlinedIconType: String = js.native
  }
  
  type _To = UpOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsUpOutlinedMod.foo` */
  override def _to: UpOutlinedIconType = default
}
