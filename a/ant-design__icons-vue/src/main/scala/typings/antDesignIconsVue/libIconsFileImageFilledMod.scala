package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsFileImageFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/FileImageFilled", JSImport.Default)
  @js.native
  val default: FileImageFilledIconType = js.native
  
  @js.native
  trait FileImageFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_FileImageFilledIconType: String = js.native
  }
  
  type _To = FileImageFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsFileImageFilledMod.foo` */
  override def _to: FileImageFilledIconType = default
}
