package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsDownOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/DownOutlined", JSImport.Default)
  @js.native
  val default: DownOutlinedIconType = js.native
  
  @js.native
  trait DownOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_DownOutlinedIconType: String = js.native
  }
  
  type _To = DownOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsDownOutlinedMod.foo` */
  override def _to: DownOutlinedIconType = default
}
