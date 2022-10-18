package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsFileUnknownOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/FileUnknownOutlined", JSImport.Default)
  @js.native
  val default: FileUnknownOutlinedIconType = js.native
  
  @js.native
  trait FileUnknownOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_FileUnknownOutlinedIconType: String = js.native
  }
  
  type _To = FileUnknownOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsFileUnknownOutlinedMod.foo` */
  override def _to: FileUnknownOutlinedIconType = default
}
