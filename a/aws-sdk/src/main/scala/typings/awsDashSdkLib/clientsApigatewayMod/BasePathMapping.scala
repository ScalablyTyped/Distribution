package typings
package awsDashSdkLib.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasePathMapping extends js.Object {
  /**
    * The base path name that callers of the API must provide as part of the URL after the domain name.
    */
  var basePath: js.UndefOr[String] = js.undefined
  /**
    * The string identifier of the associated RestApi.
    */
  var restApiId: js.UndefOr[String] = js.undefined
  /**
    * The name of the associated stage.
    */
  var stage: js.UndefOr[String] = js.undefined
}

object BasePathMapping {
  @scala.inline
  def apply(basePath: String = null, restApiId: String = null, stage: String = null): BasePathMapping = {
    val __obj = js.Dynamic.literal()
    if (basePath != null) __obj.updateDynamic("basePath")(basePath)
    if (restApiId != null) __obj.updateDynamic("restApiId")(restApiId)
    if (stage != null) __obj.updateDynamic("stage")(stage)
    __obj.asInstanceOf[BasePathMapping]
  }
}

