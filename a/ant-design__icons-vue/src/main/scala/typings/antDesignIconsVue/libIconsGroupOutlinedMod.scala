package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsGroupOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/GroupOutlined", JSImport.Default)
  @js.native
  val default: GroupOutlinedIconType = js.native
  
  @js.native
  trait GroupOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_GroupOutlinedIconType: String = js.native
  }
  
  type _To = GroupOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsGroupOutlinedMod.foo` */
  override def _to: GroupOutlinedIconType = default
}
