package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsQqCircleFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/QqCircleFilled", JSImport.Default)
  @js.native
  val default: QqCircleFilledIconType = js.native
  
  @js.native
  trait QqCircleFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_QqCircleFilledIconType: String = js.native
  }
  
  type _To = QqCircleFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsQqCircleFilledMod.foo` */
  override def _to: QqCircleFilledIconType = default
}
