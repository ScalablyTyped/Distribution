package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object payCircleFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/PayCircleFilled", JSImport.Default)
  @js.native
  val default: PayCircleFilledIconType = js.native
  
  @js.native
  trait PayCircleFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_PayCircleFilledIconType: String = js.native
  }
  
  type _To = PayCircleFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `payCircleFilledMod.foo` */
  override def _to: PayCircleFilledIconType = default
}
