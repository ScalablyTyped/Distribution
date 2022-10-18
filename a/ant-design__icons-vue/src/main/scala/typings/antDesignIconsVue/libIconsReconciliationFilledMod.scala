package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsReconciliationFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/ReconciliationFilled", JSImport.Default)
  @js.native
  val default: ReconciliationFilledIconType = js.native
  
  @js.native
  trait ReconciliationFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_ReconciliationFilledIconType: String = js.native
  }
  
  type _To = ReconciliationFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsReconciliationFilledMod.foo` */
  override def _to: ReconciliationFilledIconType = default
}
