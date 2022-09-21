package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileExcelFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/FileExcelFilled", JSImport.Default)
  @js.native
  val default: FileExcelFilledIconType = js.native
  
  @js.native
  trait FileExcelFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_FileExcelFilledIconType: String = js.native
  }
  
  type _To = FileExcelFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `fileExcelFilledMod.foo` */
  override def _to: FileExcelFilledIconType = default
}
