package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsFileJpgOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/FileJpgOutlined", JSImport.Default)
  @js.native
  val default: FileJpgOutlinedIconType = js.native
  
  @js.native
  trait FileJpgOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_FileJpgOutlinedIconType: String = js.native
  }
  
  type _To = FileJpgOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsFileJpgOutlinedMod.foo` */
  override def _to: FileJpgOutlinedIconType = default
}
