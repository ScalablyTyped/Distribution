package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BasePathMapping extends js.Object {
  /**
    * The base path name that callers of the API must provide as part of the URL after the domain name.
    */
  var basePath: js.UndefOr[String] = js.native
  /**
    * The string identifier of the associated RestApi.
    */
  var restApiId: js.UndefOr[String] = js.native
  /**
    * The name of the associated stage.
    */
  var stage: js.UndefOr[String] = js.native
}

object BasePathMapping {
  @scala.inline
  def apply(basePath: String = null, restApiId: String = null, stage: String = null): BasePathMapping = {
    val __obj = js.Dynamic.literal()
    if (basePath != null) __obj.updateDynamic("basePath")(basePath.asInstanceOf[js.Any])
    if (restApiId != null) __obj.updateDynamic("restApiId")(restApiId.asInstanceOf[js.Any])
    if (stage != null) __obj.updateDynamic("stage")(stage.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasePathMapping]
  }
}

