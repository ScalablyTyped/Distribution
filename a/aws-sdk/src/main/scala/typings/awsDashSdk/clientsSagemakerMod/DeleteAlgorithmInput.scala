package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteAlgorithmInput extends js.Object {
  /**
    * The name of the algorithm to delete.
    */
  var AlgorithmName: EntityName
}

object DeleteAlgorithmInput {
  @scala.inline
  def apply(AlgorithmName: EntityName): DeleteAlgorithmInput = {
    val __obj = js.Dynamic.literal(AlgorithmName = AlgorithmName)
  
    __obj.asInstanceOf[DeleteAlgorithmInput]
  }
}

