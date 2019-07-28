package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestUploadCredentialsInput extends js.Object {
  /**
    * Unique identifier for a build to get credentials for.
    */
  var BuildId: typings.awsDashSdk.clientsGameliftMod.BuildId
}

object RequestUploadCredentialsInput {
  @scala.inline
  def apply(BuildId: BuildId): RequestUploadCredentialsInput = {
    val __obj = js.Dynamic.literal(BuildId = BuildId)
  
    __obj.asInstanceOf[RequestUploadCredentialsInput]
  }
}

