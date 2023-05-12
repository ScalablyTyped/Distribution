package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsFileFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/FileFilled", JSImport.Default)
  @js.native
  val default: FileFilledIconType = js.native
  
  @js.native
  trait FileFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_FileFilledIconType: String = js.native
  }
  
  type _To = FileFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsFileFilledMod.foo` */
  override def _to: FileFilledIconType = default
}
