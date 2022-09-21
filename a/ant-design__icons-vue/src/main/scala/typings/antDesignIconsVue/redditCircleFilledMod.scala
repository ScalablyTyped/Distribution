package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object redditCircleFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/RedditCircleFilled", JSImport.Default)
  @js.native
  val default: RedditCircleFilledIconType = js.native
  
  @js.native
  trait RedditCircleFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_RedditCircleFilledIconType: String = js.native
  }
  
  type _To = RedditCircleFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `redditCircleFilledMod.foo` */
  override def _to: RedditCircleFilledIconType = default
}
