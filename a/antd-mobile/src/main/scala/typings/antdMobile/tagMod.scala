package typings.antdMobile

import org.scalablytyped.runtime.Shortcut
import typings.antdMobile.tagTagMod.TagProps
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tagMod extends Shortcut {
  
  @JSImport("antd-mobile/es/components/tag", JSImport.Default)
  @js.native
  val default: FC[TagProps] = js.native
  
  type _To = FC[TagProps]
  
  /* This means you don't have to write `default`, but can instead just say `tagMod.foo` */
  override def _to: FC[TagProps] = default
}
