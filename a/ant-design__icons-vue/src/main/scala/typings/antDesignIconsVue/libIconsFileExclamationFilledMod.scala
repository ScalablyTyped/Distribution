package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsFileExclamationFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/FileExclamationFilled", JSImport.Default)
  @js.native
  val default: FileExclamationFilledIconType = js.native
  
  @js.native
  trait FileExclamationFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_FileExclamationFilledIconType: String = js.native
  }
  
  type _To = FileExclamationFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsFileExclamationFilledMod.foo` */
  override def _to: FileExclamationFilledIconType = default
}
