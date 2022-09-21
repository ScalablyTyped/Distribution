package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/CheckOutlined", JSImport.Default)
  @js.native
  val default: CheckOutlinedIconType = js.native
  
  @js.native
  trait CheckOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_CheckOutlinedIconType: String = js.native
  }
  
  type _To = CheckOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `checkOutlinedMod.foo` */
  override def _to: CheckOutlinedIconType = default
}
