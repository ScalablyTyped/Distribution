package typings
package awsDashSdkLib.clientsCodebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListSourceCredentialsOutput extends js.Object {
  /**
    *  A list of SourceCredentialsInfo objects. Each SourceCredentialsInfo object includes the authentication type, token ARN, and type of source provider for one set of credentials. 
    */
  var sourceCredentialsInfos: js.UndefOr[SourceCredentialsInfos] = js.undefined
}

object ListSourceCredentialsOutput {
  @scala.inline
  def apply(sourceCredentialsInfos: SourceCredentialsInfos = null): ListSourceCredentialsOutput = {
    val __obj = js.Dynamic.literal()
    if (sourceCredentialsInfos != null) __obj.updateDynamic("sourceCredentialsInfos")(sourceCredentialsInfos)
    __obj.asInstanceOf[ListSourceCredentialsOutput]
  }
}

