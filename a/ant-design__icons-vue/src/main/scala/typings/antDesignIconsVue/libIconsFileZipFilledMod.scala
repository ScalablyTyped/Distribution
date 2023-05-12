package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsFileZipFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/FileZipFilled", JSImport.Default)
  @js.native
  val default: FileZipFilledIconType = js.native
  
  @js.native
  trait FileZipFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_FileZipFilledIconType: String = js.native
  }
  
  type _To = FileZipFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsFileZipFilledMod.foo` */
  override def _to: FileZipFilledIconType = default
}
