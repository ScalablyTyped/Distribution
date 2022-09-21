package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object playCircleFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/PlayCircleFilled", JSImport.Default)
  @js.native
  val default: PlayCircleFilledIconType = js.native
  
  @js.native
  trait PlayCircleFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_PlayCircleFilledIconType: String = js.native
  }
  
  type _To = PlayCircleFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `playCircleFilledMod.foo` */
  override def _to: PlayCircleFilledIconType = default
}
