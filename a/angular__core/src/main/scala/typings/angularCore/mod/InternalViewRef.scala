package typings.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InternalViewRef extends ViewRef {
  
  def attachToAppRef(appRef: ViewRefTracker): Unit = js.native
  
  def detachFromAppRef(): Unit = js.native
}
