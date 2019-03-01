package typings
package atAngularRouterLib.srcEventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/router/src/events", "Scroll")
@js.native
class Scroll protected () extends Event {
  def this(/** @docsNotRequired */
  routerEvent: NavigationEnd) = this()
  def this(/** @docsNotRequired */
  routerEvent: NavigationEnd, /** @docsNotRequired */
  position: js.Tuple2[scala.Double, scala.Double]) = this()
  def this(/** @docsNotRequired */
  routerEvent: NavigationEnd, /** @docsNotRequired */
  position: js.Tuple2[scala.Double, scala.Double], /** @docsNotRequired */
  anchor: java.lang.String) = this()
  def this(/** @docsNotRequired */
  routerEvent: NavigationEnd, /** @docsNotRequired */
  position: scala.Null, /** @docsNotRequired */
  anchor: java.lang.String) = this()
  /** @docsNotRequired */
  val anchor: java.lang.String | scala.Null = js.native
  /** @docsNotRequired */
  val position: (js.Tuple2[scala.Double, scala.Double]) | scala.Null = js.native
  /** @docsNotRequired */
  val routerEvent: NavigationEnd = js.native
}

