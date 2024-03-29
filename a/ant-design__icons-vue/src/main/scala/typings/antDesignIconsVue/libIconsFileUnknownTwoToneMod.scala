package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsFileUnknownTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/FileUnknownTwoTone", JSImport.Default)
  @js.native
  val default: FileUnknownTwoToneIconType = js.native
  
  @js.native
  trait FileUnknownTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_FileUnknownTwoToneIconType: String = js.native
  }
  
  type _To = FileUnknownTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsFileUnknownTwoToneMod.foo` */
  override def _to: FileUnknownTwoToneIconType = default
}
