package typings.antdMobile

import org.scalablytyped.runtime.Shortcut
import typings.antdMobile.spaceSpaceMod.SpaceProps
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spaceMod extends Shortcut {
  
  @JSImport("antd-mobile/es/components/space", JSImport.Default)
  @js.native
  val default: FC[SpaceProps] = js.native
  
  type _To = FC[SpaceProps]
  
  /* This means you don't have to write `default`, but can instead just say `spaceMod.foo` */
  override def _to: FC[SpaceProps] = default
}
