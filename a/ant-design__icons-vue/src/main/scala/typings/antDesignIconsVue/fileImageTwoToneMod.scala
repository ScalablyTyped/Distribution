package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileImageTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/FileImageTwoTone", JSImport.Default)
  @js.native
  val default: FileImageTwoToneIconType = js.native
  
  @js.native
  trait FileImageTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_FileImageTwoToneIconType: String = js.native
  }
  
  type _To = FileImageTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `fileImageTwoToneMod.foo` */
  override def _to: FileImageTwoToneIconType = default
}
