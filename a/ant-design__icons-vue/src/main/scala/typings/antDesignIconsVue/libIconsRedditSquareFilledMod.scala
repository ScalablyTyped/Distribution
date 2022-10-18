package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsRedditSquareFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/RedditSquareFilled", JSImport.Default)
  @js.native
  val default: RedditSquareFilledIconType = js.native
  
  @js.native
  trait RedditSquareFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_RedditSquareFilledIconType: String = js.native
  }
  
  type _To = RedditSquareFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsRedditSquareFilledMod.foo` */
  override def _to: RedditSquareFilledIconType = default
}
