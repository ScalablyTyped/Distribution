package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutParameterResult extends js.Object {
  /**
    * The new version number of a parameter. If you edit a parameter value, Parameter Store automatically creates a new version and assigns this new version a unique ID. You can reference a parameter version ID in API actions or in Systems Manager documents (SSM documents). By default, if you don't specify a specific version, the system returns the latest parameter value when a parameter is called.
    */
  var Version: js.UndefOr[PSParameterVersion] = js.undefined
}

object PutParameterResult {
  @scala.inline
  def apply(Version: js.UndefOr[PSParameterVersion] = js.undefined): PutParameterResult = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Version)) __obj.updateDynamic("Version")(Version)
    __obj.asInstanceOf[PutParameterResult]
  }
}

