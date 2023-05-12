package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsBranchesOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/BranchesOutlined", JSImport.Default)
  @js.native
  val default: BranchesOutlinedIconType = js.native
  
  @js.native
  trait BranchesOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_BranchesOutlinedIconType: String = js.native
  }
  
  type _To = BranchesOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsBranchesOutlinedMod.foo` */
  override def _to: BranchesOutlinedIconType = default
}
