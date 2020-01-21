package typings.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetNamedQueryOutput extends js.Object {
  /**
    * Information about the query.
    */
  var NamedQuery: js.UndefOr[typings.awsSdk.athenaMod.NamedQuery] = js.native
}

object GetNamedQueryOutput {
  @scala.inline
  def apply(NamedQuery: NamedQuery = null): GetNamedQueryOutput = {
    val __obj = js.Dynamic.literal()
    if (NamedQuery != null) __obj.updateDynamic("NamedQuery")(NamedQuery.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetNamedQueryOutput]
  }
}

