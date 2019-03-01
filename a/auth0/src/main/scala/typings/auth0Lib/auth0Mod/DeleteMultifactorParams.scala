package typings
package auth0Lib.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteMultifactorParams extends js.Object {
  var id: java.lang.String
  var provider: DeleteDeleteMultifactorParamsProvider
}

object DeleteMultifactorParams {
  @scala.inline
  def apply(id: java.lang.String, provider: DeleteDeleteMultifactorParamsProvider): DeleteMultifactorParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("provider")(provider)
    __obj.asInstanceOf[DeleteMultifactorParams]
  }
}

