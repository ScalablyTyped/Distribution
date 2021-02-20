package typings.antd.mod

import org.scalablytyped.runtime.Shortcut
import typings.antd.alertMod.AlertInterface
import typings.antd.errorBoundaryMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Alert extends Shortcut {
  
  @JSImport("antd", "Alert")
  @js.native
  val ^ : AlertInterface = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("antd", "Alert.ErrorBoundary")
  @js.native
  class ErrorBoundary () extends default
  
  type _To = AlertInterface
  
  /* This means you don't have to write `^`, but can instead just say `Alert.foo` */
  override def _to: AlertInterface = ^
}
