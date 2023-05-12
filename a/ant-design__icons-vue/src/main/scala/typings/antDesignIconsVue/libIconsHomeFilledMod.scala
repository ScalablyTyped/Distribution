package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsHomeFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/HomeFilled", JSImport.Default)
  @js.native
  val default: HomeFilledIconType = js.native
  
  @js.native
  trait HomeFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_HomeFilledIconType: String = js.native
  }
  
  type _To = HomeFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsHomeFilledMod.foo` */
  override def _to: HomeFilledIconType = default
}
