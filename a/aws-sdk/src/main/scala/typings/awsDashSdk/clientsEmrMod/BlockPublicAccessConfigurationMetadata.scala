package typings.awsDashSdk.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlockPublicAccessConfigurationMetadata extends js.Object {
  /**
    * The Amazon Resource Name that created or last modified the configuration.
    */
  var CreatedByArn: ArnType
  /**
    * The date and time that the configuration was created.
    */
  var CreationDateTime: _Date
}

object BlockPublicAccessConfigurationMetadata {
  @scala.inline
  def apply(CreatedByArn: ArnType, CreationDateTime: _Date): BlockPublicAccessConfigurationMetadata = {
    val __obj = js.Dynamic.literal(CreatedByArn = CreatedByArn, CreationDateTime = CreationDateTime)
  
    __obj.asInstanceOf[BlockPublicAccessConfigurationMetadata]
  }
}

