package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoMLContainerDefinition extends js.Object {
  /**
    * Environment variables to set in the container. Refer to ContainerDefinition for more details.
    */
  var Environment: js.UndefOr[EnvironmentMap] = js.native
  /**
    * The ECR path of the container. Refer to ContainerDefinition for more details.
    */
  var Image: typings.awsDashSdk.clientsSagemakerMod.Image = js.native
  /**
    * The location of the model artifacts. Refer to ContainerDefinition for more details.
    */
  var ModelDataUrl: Url = js.native
}

object AutoMLContainerDefinition {
  @scala.inline
  def apply(Image: Image, ModelDataUrl: Url, Environment: EnvironmentMap = null): AutoMLContainerDefinition = {
    val __obj = js.Dynamic.literal(Image = Image.asInstanceOf[js.Any], ModelDataUrl = ModelDataUrl.asInstanceOf[js.Any])
    if (Environment != null) __obj.updateDynamic("Environment")(Environment.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoMLContainerDefinition]
  }
}

