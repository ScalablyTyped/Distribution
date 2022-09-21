package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object folderAddFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/FolderAddFilled", JSImport.Default)
  @js.native
  val default: FolderAddFilledIconType = js.native
  
  @js.native
  trait FolderAddFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_FolderAddFilledIconType: String = js.native
  }
  
  type _To = FolderAddFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `folderAddFilledMod.foo` */
  override def _to: FolderAddFilledIconType = default
}
