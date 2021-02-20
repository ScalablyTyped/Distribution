package typings.angularUiBootstrap.mod.angularAugmentingMod.ui.bootstrap

import typings.angular.mod.IRootScopeService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IModalScope extends IRootScopeService {
  
  /**
    * Close the dialog resolving the promise to the given value. If `preventDefault` is called on the `modal.closing` event then the modal will remain open.
    *
    * @returns true if the modal was closed; otherwise false
    */
  @JSName("$close")
  def $close(): Boolean = js.native
  @JSName("$close")
  def $close(result: js.Any): Boolean = js.native
  
  /**
    * Dismiss the dialog without assigning a value to the promise output. If `preventDefault` is called on the `modal.closing` event then the modal will remain open.
    *
    * @returns true if the modal was closed; otherwise false
    */
  @JSName("$dismiss")
  def $dismiss(): Boolean = js.native
  @JSName("$dismiss")
  def $dismiss(reason: js.Any): Boolean = js.native
}
