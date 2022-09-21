package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deploymentUnitOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/DeploymentUnitOutlined", JSImport.Default)
  @js.native
  val default: DeploymentUnitOutlinedIconType = js.native
  
  @js.native
  trait DeploymentUnitOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_DeploymentUnitOutlinedIconType: String = js.native
  }
  
  type _To = DeploymentUnitOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `deploymentUnitOutlinedMod.foo` */
  override def _to: DeploymentUnitOutlinedIconType = default
}
