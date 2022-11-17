package typings.angularRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/router", "NavigationCancel")
@js.native
open class NavigationCancel protected () extends RouterEvent {
  def this(
    /** @docsNotRequired */
  id: Double,
    /** @docsNotRequired */
  url: String,
    /**
    * A description of why the navigation was cancelled. For debug purposes only. Use `code`
    * instead for a stable cancellation reason that can be used in production.
    */
  reason: String
  ) = this()
  def this(
    /** @docsNotRequired */
  id: Double,
    /** @docsNotRequired */
  url: String,
    /**
    * A description of why the navigation was cancelled. For debug purposes only. Use `code`
    * instead for a stable cancellation reason that can be used in production.
    */
  reason: String,
    /**
    * A code to indicate why the navigation was canceled. This cancellation code is stable for
    * the reason and can be relied on whereas the `reason` string could change and should not be
    * used in production.
    */
  code: NavigationCancellationCode
  ) = this()
  
  /**
    * A code to indicate why the navigation was canceled. This cancellation code is stable for
    * the reason and can be relied on whereas the `reason` string could change and should not be
    * used in production.
    */
  val code: js.UndefOr[NavigationCancellationCode] = js.native
  
  /**
    * A description of why the navigation was cancelled. For debug purposes only. Use `code`
    * instead for a stable cancellation reason that can be used in production.
    */
  var reason: String = js.native
  
  val `type`: String | Double = js.native
}
