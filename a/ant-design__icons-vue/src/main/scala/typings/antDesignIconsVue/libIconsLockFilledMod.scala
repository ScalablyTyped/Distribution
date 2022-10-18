package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsLockFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/LockFilled", JSImport.Default)
  @js.native
  val default: LockFilledIconType = js.native
  
  @js.native
  trait LockFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_LockFilledIconType: String = js.native
  }
  
  type _To = LockFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsLockFilledMod.foo` */
  override def _to: LockFilledIconType = default
}
