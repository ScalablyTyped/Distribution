package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsZhihuCircleFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/ZhihuCircleFilled", JSImport.Default)
  @js.native
  val default: ZhihuCircleFilledIconType = js.native
  
  @js.native
  trait ZhihuCircleFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_ZhihuCircleFilledIconType: String = js.native
  }
  
  type _To = ZhihuCircleFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsZhihuCircleFilledMod.foo` */
  override def _to: ZhihuCircleFilledIconType = default
}
