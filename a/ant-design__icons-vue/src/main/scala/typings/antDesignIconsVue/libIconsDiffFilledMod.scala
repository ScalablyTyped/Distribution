package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsDiffFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/DiffFilled", JSImport.Default)
  @js.native
  val default: DiffFilledIconType = js.native
  
  @js.native
  trait DiffFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_DiffFilledIconType: String = js.native
  }
  
  type _To = DiffFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsDiffFilledMod.foo` */
  override def _to: DiffFilledIconType = default
}
