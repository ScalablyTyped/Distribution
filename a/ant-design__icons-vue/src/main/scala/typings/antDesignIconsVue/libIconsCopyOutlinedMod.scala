package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsCopyOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/CopyOutlined", JSImport.Default)
  @js.native
  val default: CopyOutlinedIconType = js.native
  
  @js.native
  trait CopyOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_CopyOutlinedIconType: String = js.native
  }
  
  type _To = CopyOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsCopyOutlinedMod.foo` */
  override def _to: CopyOutlinedIconType = default
}
