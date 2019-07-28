package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerSideEncryptionConfiguration extends js.Object {
  /**
    * Container for information about a particular server-side encryption configuration rule.
    */
  var Rules: ServerSideEncryptionRules
}

object ServerSideEncryptionConfiguration {
  @scala.inline
  def apply(Rules: ServerSideEncryptionRules): ServerSideEncryptionConfiguration = {
    val __obj = js.Dynamic.literal(Rules = Rules)
  
    __obj.asInstanceOf[ServerSideEncryptionConfiguration]
  }
}

