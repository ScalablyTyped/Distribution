package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceAlgorithm extends js.Object {
  /**
    * The name of an algorithm that was used to create the model package. The algorithm must be either an algorithm resource in your Amazon SageMaker account or an algorithm in AWS Marketplace that you are subscribed to.
    */
  var AlgorithmName: ArnOrName
  /**
    * The Amazon S3 path where the model artifacts, which result from model training, are stored. This path must point to a single gzip compressed tar archive (.tar.gz suffix).
    */
  var ModelDataUrl: js.UndefOr[Url] = js.undefined
}

object SourceAlgorithm {
  @scala.inline
  def apply(AlgorithmName: ArnOrName, ModelDataUrl: Url = null): SourceAlgorithm = {
    val __obj = js.Dynamic.literal(AlgorithmName = AlgorithmName)
    if (ModelDataUrl != null) __obj.updateDynamic("ModelDataUrl")(ModelDataUrl)
    __obj.asInstanceOf[SourceAlgorithm]
  }
}

