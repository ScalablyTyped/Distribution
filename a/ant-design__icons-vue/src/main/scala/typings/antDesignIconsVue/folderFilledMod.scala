package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object folderFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/FolderFilled", JSImport.Default)
  @js.native
  val default: FolderFilledIconType = js.native
  
  @js.native
  trait FolderFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_FolderFilledIconType: String = js.native
  }
  
  type _To = FolderFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `folderFilledMod.foo` */
  override def _to: FolderFilledIconType = default
}
