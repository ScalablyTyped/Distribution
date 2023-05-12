package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsFolderViewOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/FolderViewOutlined", JSImport.Default)
  @js.native
  val default: FolderViewOutlinedIconType = js.native
  
  @js.native
  trait FolderViewOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_FolderViewOutlinedIconType: String = js.native
  }
  
  type _To = FolderViewOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsFolderViewOutlinedMod.foo` */
  override def _to: FolderViewOutlinedIconType = default
}
