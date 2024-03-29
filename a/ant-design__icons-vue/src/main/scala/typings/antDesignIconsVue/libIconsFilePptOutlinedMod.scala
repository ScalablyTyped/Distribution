package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsFilePptOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/FilePptOutlined", JSImport.Default)
  @js.native
  val default: FilePptOutlinedIconType = js.native
  
  @js.native
  trait FilePptOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_FilePptOutlinedIconType: String = js.native
  }
  
  type _To = FilePptOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsFilePptOutlinedMod.foo` */
  override def _to: FilePptOutlinedIconType = default
}
