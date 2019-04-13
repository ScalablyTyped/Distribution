package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateModelPackageOutput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the new model package.
    */
  var ModelPackageArn: awsDashSdkLib.clientsSagemakerMod.ModelPackageArn
}

object CreateModelPackageOutput {
  @scala.inline
  def apply(ModelPackageArn: ModelPackageArn): CreateModelPackageOutput = {
    val __obj = js.Dynamic.literal(ModelPackageArn = ModelPackageArn)
  
    __obj.asInstanceOf[CreateModelPackageOutput]
  }
}

