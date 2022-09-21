package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object plusSquareOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/PlusSquareOutlined", JSImport.Default)
  @js.native
  val default: PlusSquareOutlinedIconType = js.native
  
  @js.native
  trait PlusSquareOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_PlusSquareOutlinedIconType: String = js.native
  }
  
  type _To = PlusSquareOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `plusSquareOutlinedMod.foo` */
  override def _to: PlusSquareOutlinedIconType = default
}
