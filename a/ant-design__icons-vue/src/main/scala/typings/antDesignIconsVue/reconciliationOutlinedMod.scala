package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reconciliationOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/ReconciliationOutlined", JSImport.Default)
  @js.native
  val default: ReconciliationOutlinedIconType = js.native
  
  @js.native
  trait ReconciliationOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_ReconciliationOutlinedIconType: String = js.native
  }
  
  type _To = ReconciliationOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `reconciliationOutlinedMod.foo` */
  override def _to: ReconciliationOutlinedIconType = default
}
