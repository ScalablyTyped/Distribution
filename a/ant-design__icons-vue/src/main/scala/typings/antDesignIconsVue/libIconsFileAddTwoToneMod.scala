package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsFileAddTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/FileAddTwoTone", JSImport.Default)
  @js.native
  val default: FileAddTwoToneIconType = js.native
  
  @js.native
  trait FileAddTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_FileAddTwoToneIconType: String = js.native
  }
  
  type _To = FileAddTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsFileAddTwoToneMod.foo` */
  override def _to: FileAddTwoToneIconType = default
}
