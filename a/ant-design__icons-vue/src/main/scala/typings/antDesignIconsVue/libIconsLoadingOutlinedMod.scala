package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsLoadingOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/LoadingOutlined", JSImport.Default)
  @js.native
  val default: LoadingOutlinedIconType = js.native
  
  @js.native
  trait LoadingOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_LoadingOutlinedIconType: String = js.native
  }
  
  type _To = LoadingOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsLoadingOutlinedMod.foo` */
  override def _to: LoadingOutlinedIconType = default
}
