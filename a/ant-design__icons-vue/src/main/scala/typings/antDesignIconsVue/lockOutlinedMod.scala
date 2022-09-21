package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lockOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/LockOutlined", JSImport.Default)
  @js.native
  val default: LockOutlinedIconType = js.native
  
  @js.native
  trait LockOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_LockOutlinedIconType: String = js.native
  }
  
  type _To = LockOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `lockOutlinedMod.foo` */
  override def _to: LockOutlinedIconType = default
}
