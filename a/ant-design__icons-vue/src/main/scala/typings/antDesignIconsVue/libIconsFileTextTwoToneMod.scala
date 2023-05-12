package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsFileTextTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/FileTextTwoTone", JSImport.Default)
  @js.native
  val default: FileTextTwoToneIconType = js.native
  
  @js.native
  trait FileTextTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_FileTextTwoToneIconType: String = js.native
  }
  
  type _To = FileTextTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsFileTextTwoToneMod.foo` */
  override def _to: FileTextTwoToneIconType = default
}
