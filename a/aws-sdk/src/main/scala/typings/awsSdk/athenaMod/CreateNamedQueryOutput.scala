package typings.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateNamedQueryOutput extends js.Object {
  /**
    * The unique ID of the query.
    */
  var NamedQueryId: js.UndefOr[typings.awsSdk.athenaMod.NamedQueryId] = js.native
}

object CreateNamedQueryOutput {
  @scala.inline
  def apply(NamedQueryId: NamedQueryId = null): CreateNamedQueryOutput = {
    val __obj = js.Dynamic.literal()
    if (NamedQueryId != null) __obj.updateDynamic("NamedQueryId")(NamedQueryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateNamedQueryOutput]
  }
}

