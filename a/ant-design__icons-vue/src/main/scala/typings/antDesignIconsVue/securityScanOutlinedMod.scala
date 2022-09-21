package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object securityScanOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/SecurityScanOutlined", JSImport.Default)
  @js.native
  val default: SecurityScanOutlinedIconType = js.native
  
  @js.native
  trait SecurityScanOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_SecurityScanOutlinedIconType: String = js.native
  }
  
  type _To = SecurityScanOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `securityScanOutlinedMod.foo` */
  override def _to: SecurityScanOutlinedIconType = default
}
