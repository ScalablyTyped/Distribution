package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsFolderOpenTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/FolderOpenTwoTone", JSImport.Default)
  @js.native
  val default: FolderOpenTwoToneIconType = js.native
  
  @js.native
  trait FolderOpenTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_FolderOpenTwoToneIconType: String = js.native
  }
  
  type _To = FolderOpenTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsFolderOpenTwoToneMod.foo` */
  override def _to: FolderOpenTwoToneIconType = default
}
