package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsAuditOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/AuditOutlined", JSImport.Default)
  @js.native
  val default: AuditOutlinedIconType = js.native
  
  @js.native
  trait AuditOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_AuditOutlinedIconType: String = js.native
  }
  
  type _To = AuditOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsAuditOutlinedMod.foo` */
  override def _to: AuditOutlinedIconType = default
}
