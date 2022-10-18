package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsUsergroupAddOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/UsergroupAddOutlined", JSImport.Default)
  @js.native
  val default: UsergroupAddOutlinedIconType = js.native
  
  @js.native
  trait UsergroupAddOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_UsergroupAddOutlinedIconType: String = js.native
  }
  
  type _To = UsergroupAddOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsUsergroupAddOutlinedMod.foo` */
  override def _to: UsergroupAddOutlinedIconType = default
}
