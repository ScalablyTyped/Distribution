package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsFileSearchOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/FileSearchOutlined", JSImport.Default)
  @js.native
  val default: FileSearchOutlinedIconType = js.native
  
  @js.native
  trait FileSearchOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_FileSearchOutlinedIconType: String = js.native
  }
  
  type _To = FileSearchOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsFileSearchOutlinedMod.foo` */
  override def _to: FileSearchOutlinedIconType = default
}
