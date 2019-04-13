package typings
package awsDashSdkLib.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchGetApplicationsInput extends js.Object {
  /**
    * A list of application names separated by spaces.
    */
  var applicationNames: ApplicationsList
}

object BatchGetApplicationsInput {
  @scala.inline
  def apply(applicationNames: ApplicationsList): BatchGetApplicationsInput = {
    val __obj = js.Dynamic.literal(applicationNames = applicationNames)
  
    __obj.asInstanceOf[BatchGetApplicationsInput]
  }
}

