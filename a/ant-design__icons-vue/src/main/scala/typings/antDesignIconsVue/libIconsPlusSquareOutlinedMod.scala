package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsPlusSquareOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/PlusSquareOutlined", JSImport.Default)
  @js.native
  val default: PlusSquareOutlinedIconType = js.native
  
  @js.native
  trait PlusSquareOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_PlusSquareOutlinedIconType: String = js.native
  }
  
  type _To = PlusSquareOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsPlusSquareOutlinedMod.foo` */
  override def _to: PlusSquareOutlinedIconType = default
}
