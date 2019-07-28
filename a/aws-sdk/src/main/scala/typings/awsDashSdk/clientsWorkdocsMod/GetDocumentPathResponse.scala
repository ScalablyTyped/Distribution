package typings.awsDashSdk.clientsWorkdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDocumentPathResponse extends js.Object {
  /**
    * The path information.
    */
  var Path: js.UndefOr[ResourcePath] = js.undefined
}

object GetDocumentPathResponse {
  @scala.inline
  def apply(Path: ResourcePath = null): GetDocumentPathResponse = {
    val __obj = js.Dynamic.literal()
    if (Path != null) __obj.updateDynamic("Path")(Path)
    __obj.asInstanceOf[GetDocumentPathResponse]
  }
}

