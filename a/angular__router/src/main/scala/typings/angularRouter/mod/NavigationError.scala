package typings.angularRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.angularRouter.mod.Event2 because Already inherited */ @JSImport("@angular/router", "NavigationError")
@js.native
open class NavigationError protected () extends RouterEvent {
  def this(
    /** @docsNotRequired */
  id: Double,
    /** @docsNotRequired */
  url: String,
    /** @docsNotRequired */
  error: Any
  ) = this()
  def this(
    /** @docsNotRequired */
  id: Double,
    /** @docsNotRequired */
  url: String,
    /** @docsNotRequired */
  error: Any,
    /**
    * The target of the navigation when the error occurred.
    *
    * Note that this can be `undefined` because an error could have occurred before the
    * `RouterStateSnapshot` was created for the navigation.
    */
  target: RouterStateSnapshot
  ) = this()
  
  /** @docsNotRequired */
  var error: Any = js.native
  
  /**
    * The target of the navigation when the error occurred.
    *
    * Note that this can be `undefined` because an error could have occurred before the
    * `RouterStateSnapshot` was created for the navigation.
    */
  val target: js.UndefOr[RouterStateSnapshot] = js.native
  
  val `type`: String | Double = js.native
}
