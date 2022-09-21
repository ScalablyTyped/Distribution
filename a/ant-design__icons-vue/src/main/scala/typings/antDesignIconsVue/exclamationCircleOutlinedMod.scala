package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exclamationCircleOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/ExclamationCircleOutlined", JSImport.Default)
  @js.native
  val default: ExclamationCircleOutlinedIconType = js.native
  
  @js.native
  trait ExclamationCircleOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_ExclamationCircleOutlinedIconType: String = js.native
  }
  
  type _To = ExclamationCircleOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `exclamationCircleOutlinedMod.foo` */
  override def _to: ExclamationCircleOutlinedIconType = default
}
