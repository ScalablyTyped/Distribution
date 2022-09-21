package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fieldTimeOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/FieldTimeOutlined", JSImport.Default)
  @js.native
  val default: FieldTimeOutlinedIconType = js.native
  
  @js.native
  trait FieldTimeOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_FieldTimeOutlinedIconType: String = js.native
  }
  
  type _To = FieldTimeOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `fieldTimeOutlinedMod.foo` */
  override def _to: FieldTimeOutlinedIconType = default
}
