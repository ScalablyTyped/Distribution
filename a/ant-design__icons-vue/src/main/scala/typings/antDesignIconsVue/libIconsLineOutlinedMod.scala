package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsLineOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/LineOutlined", JSImport.Default)
  @js.native
  val default: LineOutlinedIconType = js.native
  
  @js.native
  trait LineOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_LineOutlinedIconType: String = js.native
  }
  
  type _To = LineOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsLineOutlinedMod.foo` */
  override def _to: LineOutlinedIconType = default
}
