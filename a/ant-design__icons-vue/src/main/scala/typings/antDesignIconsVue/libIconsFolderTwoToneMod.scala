package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsFolderTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/FolderTwoTone", JSImport.Default)
  @js.native
  val default: FolderTwoToneIconType = js.native
  
  @js.native
  trait FolderTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_FolderTwoToneIconType: String = js.native
  }
  
  type _To = FolderTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsFolderTwoToneMod.foo` */
  override def _to: FolderTwoToneIconType = default
}
