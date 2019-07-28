package typings.awsDashSdk.clientsLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionCodeLocation extends js.Object {
  /**
    * A presigned URL that you can use to download the deployment package.
    */
  var Location: js.UndefOr[String] = js.undefined
  /**
    * The service that's hosting the file.
    */
  var RepositoryType: js.UndefOr[String] = js.undefined
}

object FunctionCodeLocation {
  @scala.inline
  def apply(Location: String = null, RepositoryType: String = null): FunctionCodeLocation = {
    val __obj = js.Dynamic.literal()
    if (Location != null) __obj.updateDynamic("Location")(Location)
    if (RepositoryType != null) __obj.updateDynamic("RepositoryType")(RepositoryType)
    __obj.asInstanceOf[FunctionCodeLocation]
  }
}

