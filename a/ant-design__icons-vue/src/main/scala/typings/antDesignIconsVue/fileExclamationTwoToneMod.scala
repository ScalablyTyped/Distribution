package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileExclamationTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/FileExclamationTwoTone", JSImport.Default)
  @js.native
  val default: FileExclamationTwoToneIconType = js.native
  
  @js.native
  trait FileExclamationTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_FileExclamationTwoToneIconType: String = js.native
  }
  
  type _To = FileExclamationTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `fileExclamationTwoToneMod.foo` */
  override def _to: FileExclamationTwoToneIconType = default
}
