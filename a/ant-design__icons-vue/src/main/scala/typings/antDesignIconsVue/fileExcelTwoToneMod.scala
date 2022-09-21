package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileExcelTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/FileExcelTwoTone", JSImport.Default)
  @js.native
  val default: FileExcelTwoToneIconType = js.native
  
  @js.native
  trait FileExcelTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_FileExcelTwoToneIconType: String = js.native
  }
  
  type _To = FileExcelTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `fileExcelTwoToneMod.foo` */
  override def _to: FileExcelTwoToneIconType = default
}
