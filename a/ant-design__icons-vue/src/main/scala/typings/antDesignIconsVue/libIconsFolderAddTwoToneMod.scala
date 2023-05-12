package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsFolderAddTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/FolderAddTwoTone", JSImport.Default)
  @js.native
  val default: FolderAddTwoToneIconType = js.native
  
  @js.native
  trait FolderAddTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_FolderAddTwoToneIconType: String = js.native
  }
  
  type _To = FolderAddTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsFolderAddTwoToneMod.foo` */
  override def _to: FolderAddTwoToneIconType = default
}
