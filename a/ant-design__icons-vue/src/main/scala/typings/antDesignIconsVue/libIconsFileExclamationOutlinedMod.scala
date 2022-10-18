package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsFileExclamationOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/FileExclamationOutlined", JSImport.Default)
  @js.native
  val default: FileExclamationOutlinedIconType = js.native
  
  @js.native
  trait FileExclamationOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_FileExclamationOutlinedIconType: String = js.native
  }
  
  type _To = FileExclamationOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsFileExclamationOutlinedMod.foo` */
  override def _to: FileExclamationOutlinedIconType = default
}
