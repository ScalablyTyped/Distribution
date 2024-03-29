package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsLockTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/LockTwoTone", JSImport.Default)
  @js.native
  val default: LockTwoToneIconType = js.native
  
  @js.native
  trait LockTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_LockTwoToneIconType: String = js.native
  }
  
  type _To = LockTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsLockTwoToneMod.foo` */
  override def _to: LockTwoToneIconType = default
}
