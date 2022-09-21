package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileZipTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/FileZipTwoTone", JSImport.Default)
  @js.native
  val default: FileZipTwoToneIconType = js.native
  
  @js.native
  trait FileZipTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_FileZipTwoToneIconType: String = js.native
  }
  
  type _To = FileZipTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `fileZipTwoToneMod.foo` */
  override def _to: FileZipTwoToneIconType = default
}
