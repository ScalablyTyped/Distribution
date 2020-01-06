package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteModelPackageInput extends js.Object {
  /**
    * The name of the model package. The name must have 1 to 63 characters. Valid characters are a-z, A-Z, 0-9, and - (hyphen).
    */
  var ModelPackageName: EntityName = js.native
}

object DeleteModelPackageInput {
  @scala.inline
  def apply(ModelPackageName: EntityName): DeleteModelPackageInput = {
    val __obj = js.Dynamic.literal(ModelPackageName = ModelPackageName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteModelPackageInput]
  }
}

