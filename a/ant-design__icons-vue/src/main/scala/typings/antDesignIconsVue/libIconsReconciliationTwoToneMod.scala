package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsReconciliationTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/ReconciliationTwoTone", JSImport.Default)
  @js.native
  val default: ReconciliationTwoToneIconType = js.native
  
  @js.native
  trait ReconciliationTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_ReconciliationTwoToneIconType: String = js.native
  }
  
  type _To = ReconciliationTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsReconciliationTwoToneMod.foo` */
  override def _to: ReconciliationTwoToneIconType = default
}
