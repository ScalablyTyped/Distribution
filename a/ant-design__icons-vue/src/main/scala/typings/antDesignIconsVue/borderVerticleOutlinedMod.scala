package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object borderVerticleOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/BorderVerticleOutlined", JSImport.Default)
  @js.native
  val default: BorderVerticleOutlinedIconType = js.native
  
  @js.native
  trait BorderVerticleOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_BorderVerticleOutlinedIconType: String = js.native
  }
  
  type _To = BorderVerticleOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `borderVerticleOutlinedMod.foo` */
  override def _to: BorderVerticleOutlinedIconType = default
}
