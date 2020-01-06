package typings.awsDashSdk.clientsCodebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSourceCredentialsOutput extends js.Object {
  /**
    *  A list of SourceCredentialsInfo objects. Each SourceCredentialsInfo object includes the authentication type, token ARN, and type of source provider for one set of credentials. 
    */
  var sourceCredentialsInfos: js.UndefOr[SourceCredentialsInfos] = js.native
}

object ListSourceCredentialsOutput {
  @scala.inline
  def apply(sourceCredentialsInfos: SourceCredentialsInfos = null): ListSourceCredentialsOutput = {
    val __obj = js.Dynamic.literal()
    if (sourceCredentialsInfos != null) __obj.updateDynamic("sourceCredentialsInfos")(sourceCredentialsInfos.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSourceCredentialsOutput]
  }
}

