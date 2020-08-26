package typings.angularCore.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Output extends js.Object {
  /**
    * The name of the DOM property to which the output property is bound.
    */
  var bindingPropertyName: js.UndefOr[String] = js.native
}

@JSImport("@angular/core", "Output")
@js.native
object Output extends TopLevel[OutputDecorator]

