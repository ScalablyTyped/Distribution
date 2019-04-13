package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateAlgorithmOutput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the new algorithm.
    */
  var AlgorithmArn: awsDashSdkLib.clientsSagemakerMod.AlgorithmArn
}

object CreateAlgorithmOutput {
  @scala.inline
  def apply(AlgorithmArn: AlgorithmArn): CreateAlgorithmOutput = {
    val __obj = js.Dynamic.literal(AlgorithmArn = AlgorithmArn)
  
    __obj.asInstanceOf[CreateAlgorithmOutput]
  }
}

