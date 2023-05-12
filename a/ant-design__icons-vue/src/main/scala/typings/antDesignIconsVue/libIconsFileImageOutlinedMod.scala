package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsFileImageOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/FileImageOutlined", JSImport.Default)
  @js.native
  val default: FileImageOutlinedIconType = js.native
  
  @js.native
  trait FileImageOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_FileImageOutlinedIconType: String = js.native
  }
  
  type _To = FileImageOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsFileImageOutlinedMod.foo` */
  override def _to: FileImageOutlinedIconType = default
}
