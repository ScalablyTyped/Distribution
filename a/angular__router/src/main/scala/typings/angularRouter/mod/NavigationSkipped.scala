package typings.angularRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/router", "NavigationSkipped")
@js.native
open class NavigationSkipped protected ()
  extends RouterEvent
     with Event2 {
  def this(
    /** @docsNotRequired */
  id: Double,
    /** @docsNotRequired */
  url: String,
    /**
    * A description of why the navigation was skipped. For debug purposes only. Use `code`
    * instead for a stable skipped reason that can be used in production.
    */
  reason: String
  ) = this()
  def this(
    /** @docsNotRequired */
  id: Double,
    /** @docsNotRequired */
  url: String,
    /**
    * A description of why the navigation was skipped. For debug purposes only. Use `code`
    * instead for a stable skipped reason that can be used in production.
    */
  reason: String,
    /**
    * A code to indicate why the navigation was skipped. This code is stable for
    * the reason and can be relied on whereas the `reason` string could change and should not be
    * used in production.
    */
  code: NavigationSkippedCode
  ) = this()
  
  /**
    * A code to indicate why the navigation was skipped. This code is stable for
    * the reason and can be relied on whereas the `reason` string could change and should not be
    * used in production.
    */
  val code: js.UndefOr[NavigationSkippedCode] = js.native
  
  /**
    * A description of why the navigation was skipped. For debug purposes only. Use `code`
    * instead for a stable skipped reason that can be used in production.
    */
  var reason: String = js.native
  
  val `type`: String | Double = js.native
}
