package typings.angularRouter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/router", "Scroll")
@js.native
class Scroll protected () extends Event {
  def this(/** @docsNotRequired */
  routerEvent: NavigationEnd) = this()
  def this(
    /** @docsNotRequired */
  routerEvent: NavigationEnd,
    /** @docsNotRequired */
  position: js.Tuple2[Double, Double]
  ) = this()
  def this(
    /** @docsNotRequired */
  routerEvent: NavigationEnd,
    /** @docsNotRequired */
  position: js.Tuple2[Double, Double],
    /** @docsNotRequired */
  anchor: String
  ) = this()
  def this(
    /** @docsNotRequired */
  routerEvent: NavigationEnd,
    /** @docsNotRequired */
  position: Null,
    /** @docsNotRequired */
  anchor: String
  ) = this()
  
  /** @docsNotRequired */
  val anchor: String | Null = js.native
  
  /** @docsNotRequired */
  val position: (js.Tuple2[Double, Double]) | Null = js.native
  
  /** @docsNotRequired */
  val routerEvent: NavigationEnd = js.native
}
