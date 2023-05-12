package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsFileExcelOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/FileExcelOutlined", JSImport.Default)
  @js.native
  val default: FileExcelOutlinedIconType = js.native
  
  @js.native
  trait FileExcelOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_FileExcelOutlinedIconType: String = js.native
  }
  
  type _To = FileExcelOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsFileExcelOutlinedMod.foo` */
  override def _to: FileExcelOutlinedIconType = default
}
