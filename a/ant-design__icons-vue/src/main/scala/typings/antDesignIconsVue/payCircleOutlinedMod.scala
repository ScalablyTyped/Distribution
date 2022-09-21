package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object payCircleOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/PayCircleOutlined", JSImport.Default)
  @js.native
  val default: PayCircleOutlinedIconType = js.native
  
  @js.native
  trait PayCircleOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_PayCircleOutlinedIconType: String = js.native
  }
  
  type _To = PayCircleOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `payCircleOutlinedMod.foo` */
  override def _to: PayCircleOutlinedIconType = default
}
