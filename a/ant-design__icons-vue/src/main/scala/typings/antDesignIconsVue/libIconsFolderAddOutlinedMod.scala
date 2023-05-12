package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsFolderAddOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/FolderAddOutlined", JSImport.Default)
  @js.native
  val default: FolderAddOutlinedIconType = js.native
  
  @js.native
  trait FolderAddOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_FolderAddOutlinedIconType: String = js.native
  }
  
  type _To = FolderAddOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsFolderAddOutlinedMod.foo` */
  override def _to: FolderAddOutlinedIconType = default
}
