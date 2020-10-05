package typings.angularRouter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/router", "RouterEvent")
@js.native
class RouterEvent protected () extends Event {
  def this(
    /** A unique ID that the router assigns to every router navigation. */
  id: Double,
    /** The URL that is the destination for this navigation. */
  url: String
  ) = this()
  /** A unique ID that the router assigns to every router navigation. */
  var id: Double = js.native
  /** The URL that is the destination for this navigation. */
  var url: String = js.native
}

