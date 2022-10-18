package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsLeftCircleOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/LeftCircleOutlined", JSImport.Default)
  @js.native
  val default: LeftCircleOutlinedIconType = js.native
  
  @js.native
  trait LeftCircleOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_LeftCircleOutlinedIconType: String = js.native
  }
  
  type _To = LeftCircleOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsLeftCircleOutlinedMod.foo` */
  override def _to: LeftCircleOutlinedIconType = default
}
