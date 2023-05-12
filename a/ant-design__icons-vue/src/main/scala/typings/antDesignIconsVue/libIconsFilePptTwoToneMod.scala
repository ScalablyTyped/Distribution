package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsFilePptTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/FilePptTwoTone", JSImport.Default)
  @js.native
  val default: FilePptTwoToneIconType = js.native
  
  @js.native
  trait FilePptTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_FilePptTwoToneIconType: String = js.native
  }
  
  type _To = FilePptTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsFilePptTwoToneMod.foo` */
  override def _to: FilePptTwoToneIconType = default
}
