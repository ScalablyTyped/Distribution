package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filePdfFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/FilePdfFilled", JSImport.Default)
  @js.native
  val default: FilePdfFilledIconType = js.native
  
  @js.native
  trait FilePdfFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_FilePdfFilledIconType: String = js.native
  }
  
  type _To = FilePdfFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `filePdfFilledMod.foo` */
  override def _to: FilePdfFilledIconType = default
}
