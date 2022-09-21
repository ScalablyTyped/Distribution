package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object solutionOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/SolutionOutlined", JSImport.Default)
  @js.native
  val default: SolutionOutlinedIconType = js.native
  
  @js.native
  trait SolutionOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_SolutionOutlinedIconType: String = js.native
  }
  
  type _To = SolutionOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `solutionOutlinedMod.foo` */
  override def _to: SolutionOutlinedIconType = default
}
