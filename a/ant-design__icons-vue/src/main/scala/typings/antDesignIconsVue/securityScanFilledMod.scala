package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object securityScanFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/SecurityScanFilled", JSImport.Default)
  @js.native
  val default: SecurityScanFilledIconType = js.native
  
  @js.native
  trait SecurityScanFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_SecurityScanFilledIconType: String = js.native
  }
  
  type _To = SecurityScanFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `securityScanFilledMod.foo` */
  override def _to: SecurityScanFilledIconType = default
}
