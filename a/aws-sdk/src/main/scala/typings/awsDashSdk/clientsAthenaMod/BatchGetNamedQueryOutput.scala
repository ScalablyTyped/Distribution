package typings.awsDashSdk.clientsAthenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetNamedQueryOutput extends js.Object {
  /**
    * Information about the named query IDs submitted.
    */
  var NamedQueries: js.UndefOr[NamedQueryList] = js.native
  /**
    * Information about provided query IDs.
    */
  var UnprocessedNamedQueryIds: js.UndefOr[UnprocessedNamedQueryIdList] = js.native
}

object BatchGetNamedQueryOutput {
  @scala.inline
  def apply(NamedQueries: NamedQueryList = null, UnprocessedNamedQueryIds: UnprocessedNamedQueryIdList = null): BatchGetNamedQueryOutput = {
    val __obj = js.Dynamic.literal()
    if (NamedQueries != null) __obj.updateDynamic("NamedQueries")(NamedQueries.asInstanceOf[js.Any])
    if (UnprocessedNamedQueryIds != null) __obj.updateDynamic("UnprocessedNamedQueryIds")(UnprocessedNamedQueryIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetNamedQueryOutput]
  }
}

