package typings
package awsDashSdkLib.clientsAthenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetNamedQueryOutput extends js.Object {
  /**
    * Information about the query.
    */
  var NamedQuery: js.UndefOr[NamedQuery] = js.undefined
}

object GetNamedQueryOutput {
  @scala.inline
  def apply(NamedQuery: NamedQuery = null): GetNamedQueryOutput = {
    val __obj = js.Dynamic.literal()
    if (NamedQuery != null) __obj.updateDynamic("NamedQuery")(NamedQuery)
    __obj.asInstanceOf[GetNamedQueryOutput]
  }
}

