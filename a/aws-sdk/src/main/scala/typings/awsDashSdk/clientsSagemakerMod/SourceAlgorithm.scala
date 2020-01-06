package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceAlgorithm extends js.Object {
  /**
    * The name of an algorithm that was used to create the model package. The algorithm must be either an algorithm resource in your Amazon SageMaker account or an algorithm in AWS Marketplace that you are subscribed to.
    */
  var AlgorithmName: ArnOrName = js.native
  /**
    * The Amazon S3 path where the model artifacts, which result from model training, are stored. This path must point to a single gzip compressed tar archive (.tar.gz suffix).
    */
  var ModelDataUrl: js.UndefOr[Url] = js.native
}

object SourceAlgorithm {
  @scala.inline
  def apply(AlgorithmName: ArnOrName, ModelDataUrl: Url = null): SourceAlgorithm = {
    val __obj = js.Dynamic.literal(AlgorithmName = AlgorithmName.asInstanceOf[js.Any])
    if (ModelDataUrl != null) __obj.updateDynamic("ModelDataUrl")(ModelDataUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceAlgorithm]
  }
}

