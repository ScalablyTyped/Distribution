package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileTextTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/FileTextTwoTone", JSImport.Default)
  @js.native
  val default: FileTextTwoToneIconType = js.native
  
  @js.native
  trait FileTextTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_FileTextTwoToneIconType: String = js.native
  }
  
  type _To = FileTextTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `fileTextTwoToneMod.foo` */
  override def _to: FileTextTwoToneIconType = default
}
