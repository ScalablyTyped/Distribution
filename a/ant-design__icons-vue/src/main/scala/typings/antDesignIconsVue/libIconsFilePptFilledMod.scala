package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsFilePptFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/FilePptFilled", JSImport.Default)
  @js.native
  val default: FilePptFilledIconType = js.native
  
  @js.native
  trait FilePptFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_FilePptFilledIconType: String = js.native
  }
  
  type _To = FilePptFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsFilePptFilledMod.foo` */
  override def _to: FilePptFilledIconType = default
}
