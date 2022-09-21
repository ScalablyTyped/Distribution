package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clusterOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/ClusterOutlined", JSImport.Default)
  @js.native
  val default: ClusterOutlinedIconType = js.native
  
  @js.native
  trait ClusterOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_ClusterOutlinedIconType: String = js.native
  }
  
  type _To = ClusterOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `clusterOutlinedMod.foo` */
  override def _to: ClusterOutlinedIconType = default
}
