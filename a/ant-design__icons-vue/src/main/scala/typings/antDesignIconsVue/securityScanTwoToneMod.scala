package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object securityScanTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/SecurityScanTwoTone", JSImport.Default)
  @js.native
  val default: SecurityScanTwoToneIconType = js.native
  
  @js.native
  trait SecurityScanTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_SecurityScanTwoToneIconType: String = js.native
  }
  
  type _To = SecurityScanTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `securityScanTwoToneMod.foo` */
  override def _to: SecurityScanTwoToneIconType = default
}
