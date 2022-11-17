package typings.angularRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/router", "NavigationEnd")
@js.native
open class NavigationEnd protected () extends RouterEvent {
  def this(
    /** @docsNotRequired */
  id: Double,
    /** @docsNotRequired */
  url: String,
    /** @docsNotRequired */
  urlAfterRedirects: String
  ) = this()
  
  val `type`: String | Double = js.native
  
  /** @docsNotRequired */
  var urlAfterRedirects: String = js.native
}
