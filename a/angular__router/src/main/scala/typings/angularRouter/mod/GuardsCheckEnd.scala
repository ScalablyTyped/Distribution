package typings.angularRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/router", "GuardsCheckEnd")
@js.native
open class GuardsCheckEnd protected () extends RouterEvent {
  def this(
    /** @docsNotRequired */
  id: Double,
    /** @docsNotRequired */
  url: String,
    /** @docsNotRequired */
  urlAfterRedirects: String,
    /** @docsNotRequired */
  state: RouterStateSnapshot,
    /** @docsNotRequired */
  shouldActivate: Boolean
  ) = this()
  
  /** @docsNotRequired */
  var shouldActivate: Boolean = js.native
  
  /** @docsNotRequired */
  var state: RouterStateSnapshot = js.native
  
  val `type`: String | Double = js.native
  
  /** @docsNotRequired */
  var urlAfterRedirects: String = js.native
}
