package typings
package atAngularRouterLib.atAngularRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/router", "RouterEvent")
@js.native
class RouterEvent protected () extends Event {
  def this(/** A unique ID that the router assigns to every router navigation. */
  id: scala.Double, /** The URL that is the destination for this navigation. */
  url: java.lang.String) = this()
  /** A unique ID that the router assigns to every router navigation. */
  var id: scala.Double = js.native
  /** The URL that is the destination for this navigation. */
  var url: java.lang.String = js.native
}

