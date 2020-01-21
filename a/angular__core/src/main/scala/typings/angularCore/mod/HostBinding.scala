package typings.angularCore.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HostBinding extends js.Object {
  /**
    * The DOM property that is bound to a data property.
    */
  var hostPropertyName: js.UndefOr[String] = js.undefined
}

@JSImport("@angular/core", "HostBinding")
@js.native
object HostBinding extends TopLevel[HostBindingDecorator]

