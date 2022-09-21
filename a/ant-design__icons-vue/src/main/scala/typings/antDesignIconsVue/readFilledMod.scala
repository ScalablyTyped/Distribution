package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object readFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/ReadFilled", JSImport.Default)
  @js.native
  val default: ReadFilledIconType = js.native
  
  @js.native
  trait ReadFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_ReadFilledIconType: String = js.native
  }
  
  type _To = ReadFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `readFilledMod.foo` */
  override def _to: ReadFilledIconType = default
}
