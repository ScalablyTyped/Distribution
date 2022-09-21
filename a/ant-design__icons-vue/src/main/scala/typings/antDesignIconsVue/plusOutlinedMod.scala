package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object plusOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/PlusOutlined", JSImport.Default)
  @js.native
  val default: PlusOutlinedIconType = js.native
  
  @js.native
  trait PlusOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_PlusOutlinedIconType: String = js.native
  }
  
  type _To = PlusOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `plusOutlinedMod.foo` */
  override def _to: PlusOutlinedIconType = default
}
