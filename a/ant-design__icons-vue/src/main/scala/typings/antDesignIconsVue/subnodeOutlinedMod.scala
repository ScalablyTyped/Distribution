package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object subnodeOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/SubnodeOutlined", JSImport.Default)
  @js.native
  val default: SubnodeOutlinedIconType = js.native
  
  @js.native
  trait SubnodeOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_SubnodeOutlinedIconType: String = js.native
  }
  
  type _To = SubnodeOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `subnodeOutlinedMod.foo` */
  override def _to: SubnodeOutlinedIconType = default
}
