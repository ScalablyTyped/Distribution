package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsCloudServerOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/CloudServerOutlined", JSImport.Default)
  @js.native
  val default: CloudServerOutlinedIconType = js.native
  
  @js.native
  trait CloudServerOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_CloudServerOutlinedIconType: String = js.native
  }
  
  type _To = CloudServerOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsCloudServerOutlinedMod.foo` */
  override def _to: CloudServerOutlinedIconType = default
}
