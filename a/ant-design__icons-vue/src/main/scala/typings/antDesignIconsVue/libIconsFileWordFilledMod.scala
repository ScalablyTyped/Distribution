package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsFileWordFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/FileWordFilled", JSImport.Default)
  @js.native
  val default: FileWordFilledIconType = js.native
  
  @js.native
  trait FileWordFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_FileWordFilledIconType: String = js.native
  }
  
  type _To = FileWordFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsFileWordFilledMod.foo` */
  override def _to: FileWordFilledIconType = default
}
