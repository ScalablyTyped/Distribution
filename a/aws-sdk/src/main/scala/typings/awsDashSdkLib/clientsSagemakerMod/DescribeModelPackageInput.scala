package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeModelPackageInput extends js.Object {
  /**
    * The name of the model package to describe.
    */
  var ModelPackageName: ArnOrName
}

object DescribeModelPackageInput {
  @scala.inline
  def apply(ModelPackageName: ArnOrName): DescribeModelPackageInput = {
    val __obj = js.Dynamic.literal(ModelPackageName = ModelPackageName)
  
    __obj.asInstanceOf[DescribeModelPackageInput]
  }
}

