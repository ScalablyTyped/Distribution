package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsFilePdfTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/FilePdfTwoTone", JSImport.Default)
  @js.native
  val default: FilePdfTwoToneIconType = js.native
  
  @js.native
  trait FilePdfTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_FilePdfTwoToneIconType: String = js.native
  }
  
  type _To = FilePdfTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsFilePdfTwoToneMod.foo` */
  override def _to: FilePdfTwoToneIconType = default
}
