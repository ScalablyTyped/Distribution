package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsCompressOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/CompressOutlined", JSImport.Default)
  @js.native
  val default: CompressOutlinedIconType = js.native
  
  @js.native
  trait CompressOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_CompressOutlinedIconType: String = js.native
  }
  
  type _To = CompressOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsCompressOutlinedMod.foo` */
  override def _to: CompressOutlinedIconType = default
}
