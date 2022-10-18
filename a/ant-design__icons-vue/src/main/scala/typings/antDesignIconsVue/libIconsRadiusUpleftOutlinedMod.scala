package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsRadiusUpleftOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/RadiusUpleftOutlined", JSImport.Default)
  @js.native
  val default: RadiusUpleftOutlinedIconType = js.native
  
  @js.native
  trait RadiusUpleftOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_RadiusUpleftOutlinedIconType: String = js.native
  }
  
  type _To = RadiusUpleftOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsRadiusUpleftOutlinedMod.foo` */
  override def _to: RadiusUpleftOutlinedIconType = default
}
