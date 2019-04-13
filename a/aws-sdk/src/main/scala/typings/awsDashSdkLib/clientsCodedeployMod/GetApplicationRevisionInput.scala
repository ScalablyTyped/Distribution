package typings
package awsDashSdkLib.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetApplicationRevisionInput extends js.Object {
  /**
    * The name of the application that corresponds to the revision.
    */
  var applicationName: ApplicationName
  /**
    * Information about the application revision to get, including type and location.
    */
  var revision: RevisionLocation
}

object GetApplicationRevisionInput {
  @scala.inline
  def apply(applicationName: ApplicationName, revision: RevisionLocation): GetApplicationRevisionInput = {
    val __obj = js.Dynamic.literal(applicationName = applicationName, revision = revision)
  
    __obj.asInstanceOf[GetApplicationRevisionInput]
  }
}

