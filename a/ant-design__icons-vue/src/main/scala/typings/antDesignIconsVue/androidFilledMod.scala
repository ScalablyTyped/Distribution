package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object androidFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/AndroidFilled", JSImport.Default)
  @js.native
  val default: AndroidFilledIconType = js.native
  
  @js.native
  trait AndroidFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_AndroidFilledIconType: String = js.native
  }
  
  type _To = AndroidFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `androidFilledMod.foo` */
  override def _to: AndroidFilledIconType = default
}
