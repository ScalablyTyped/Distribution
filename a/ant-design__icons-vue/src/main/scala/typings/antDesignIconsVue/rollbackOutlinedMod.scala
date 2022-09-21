package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rollbackOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/RollbackOutlined", JSImport.Default)
  @js.native
  val default: RollbackOutlinedIconType = js.native
  
  @js.native
  trait RollbackOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_RollbackOutlinedIconType: String = js.native
  }
  
  type _To = RollbackOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `rollbackOutlinedMod.foo` */
  override def _to: RollbackOutlinedIconType = default
}
