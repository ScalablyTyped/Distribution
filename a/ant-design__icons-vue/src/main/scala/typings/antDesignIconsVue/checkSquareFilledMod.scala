package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkSquareFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/CheckSquareFilled", JSImport.Default)
  @js.native
  val default: CheckSquareFilledIconType = js.native
  
  @js.native
  trait CheckSquareFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_CheckSquareFilledIconType: String = js.native
  }
  
  type _To = CheckSquareFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `checkSquareFilledMod.foo` */
  override def _to: CheckSquareFilledIconType = default
}
