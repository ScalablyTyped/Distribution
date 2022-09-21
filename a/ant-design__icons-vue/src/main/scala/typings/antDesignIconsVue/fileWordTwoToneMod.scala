package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileWordTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/FileWordTwoTone", JSImport.Default)
  @js.native
  val default: FileWordTwoToneIconType = js.native
  
  @js.native
  trait FileWordTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_FileWordTwoToneIconType: String = js.native
  }
  
  type _To = FileWordTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `fileWordTwoToneMod.foo` */
  override def _to: FileWordTwoToneIconType = default
}
