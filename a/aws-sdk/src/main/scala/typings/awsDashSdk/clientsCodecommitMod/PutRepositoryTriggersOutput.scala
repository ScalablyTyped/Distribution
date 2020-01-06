package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutRepositoryTriggersOutput extends js.Object {
  /**
    * The system-generated unique ID for the create or update operation.
    */
  var configurationId: js.UndefOr[RepositoryTriggersConfigurationId] = js.native
}

object PutRepositoryTriggersOutput {
  @scala.inline
  def apply(configurationId: RepositoryTriggersConfigurationId = null): PutRepositoryTriggersOutput = {
    val __obj = js.Dynamic.literal()
    if (configurationId != null) __obj.updateDynamic("configurationId")(configurationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutRepositoryTriggersOutput]
  }
}

