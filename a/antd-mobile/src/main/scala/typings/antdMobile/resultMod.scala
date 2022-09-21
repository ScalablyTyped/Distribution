package typings.antdMobile

import org.scalablytyped.runtime.Shortcut
import typings.antdMobile.resultResultMod.ResultProps
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resultMod extends Shortcut {
  
  @JSImport("antd-mobile/es/components/result", JSImport.Default)
  @js.native
  val default: FC[ResultProps] = js.native
  
  type _To = FC[ResultProps]
  
  /* This means you don't have to write `default`, but can instead just say `resultMod.foo` */
  override def _to: FC[ResultProps] = default
}
