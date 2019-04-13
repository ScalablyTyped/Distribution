package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodeGenEdge extends js.Object {
  /**
    * The ID of the node at which the edge starts.
    */
  var Source: CodeGenIdentifier
  /**
    * The ID of the node at which the edge ends.
    */
  var Target: CodeGenIdentifier
  /**
    * The target of the edge.
    */
  var TargetParameter: js.UndefOr[CodeGenArgName] = js.undefined
}

object CodeGenEdge {
  @scala.inline
  def apply(Source: CodeGenIdentifier, Target: CodeGenIdentifier, TargetParameter: CodeGenArgName = null): CodeGenEdge = {
    val __obj = js.Dynamic.literal(Source = Source, Target = Target)
    if (TargetParameter != null) __obj.updateDynamic("TargetParameter")(TargetParameter)
    __obj.asInstanceOf[CodeGenEdge]
  }
}

