package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object googleCircleFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/GoogleCircleFilled", JSImport.Default)
  @js.native
  val default: GoogleCircleFilledIconType = js.native
  
  @js.native
  trait GoogleCircleFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_GoogleCircleFilledIconType: String = js.native
  }
  
  type _To = GoogleCircleFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `googleCircleFilledMod.foo` */
  override def _to: GoogleCircleFilledIconType = default
}
