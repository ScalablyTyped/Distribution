package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsFolderOpenFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/FolderOpenFilled", JSImport.Default)
  @js.native
  val default: FolderOpenFilledIconType = js.native
  
  @js.native
  trait FolderOpenFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_FolderOpenFilledIconType: String = js.native
  }
  
  type _To = FolderOpenFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsFolderOpenFilledMod.foo` */
  override def _to: FolderOpenFilledIconType = default
}
