package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exclamationOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/ExclamationOutlined", JSImport.Default)
  @js.native
  val default: ExclamationOutlinedIconType = js.native
  
  @js.native
  trait ExclamationOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_ExclamationOutlinedIconType: String = js.native
  }
  
  type _To = ExclamationOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `exclamationOutlinedMod.foo` */
  override def _to: ExclamationOutlinedIconType = default
}
