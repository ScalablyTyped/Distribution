package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsFolderOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/FolderOutlined", JSImport.Default)
  @js.native
  val default: FolderOutlinedIconType = js.native
  
  @js.native
  trait FolderOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_FolderOutlinedIconType: String = js.native
  }
  
  type _To = FolderOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsFolderOutlinedMod.foo` */
  override def _to: FolderOutlinedIconType = default
}
