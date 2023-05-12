package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsFileTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/FileTwoTone", JSImport.Default)
  @js.native
  val default: FileTwoToneIconType = js.native
  
  @js.native
  trait FileTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_FileTwoToneIconType: String = js.native
  }
  
  type _To = FileTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsFileTwoToneMod.foo` */
  override def _to: FileTwoToneIconType = default
}
