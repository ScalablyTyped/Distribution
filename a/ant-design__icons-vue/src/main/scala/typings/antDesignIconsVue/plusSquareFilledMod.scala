package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object plusSquareFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/PlusSquareFilled", JSImport.Default)
  @js.native
  val default: PlusSquareFilledIconType = js.native
  
  @js.native
  trait PlusSquareFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_PlusSquareFilledIconType: String = js.native
  }
  
  type _To = PlusSquareFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `plusSquareFilledMod.foo` */
  override def _to: PlusSquareFilledIconType = default
}
