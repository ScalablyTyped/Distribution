package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exclamationCircleFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/ExclamationCircleFilled", JSImport.Default)
  @js.native
  val default: ExclamationCircleFilledIconType = js.native
  
  @js.native
  trait ExclamationCircleFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_ExclamationCircleFilledIconType: String = js.native
  }
  
  type _To = ExclamationCircleFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `exclamationCircleFilledMod.foo` */
  override def _to: ExclamationCircleFilledIconType = default
}
