package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsReadFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/ReadFilled", JSImport.Default)
  @js.native
  val default: ReadFilledIconType = js.native
  
  @js.native
  trait ReadFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_ReadFilledIconType: String = js.native
  }
  
  type _To = ReadFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsReadFilledMod.foo` */
  override def _to: ReadFilledIconType = default
}
