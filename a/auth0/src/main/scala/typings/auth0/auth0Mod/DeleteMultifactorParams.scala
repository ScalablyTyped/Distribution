package typings.auth0.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteMultifactorParams extends js.Object {
  var id: String
  var provider: DeleteDeleteMultifactorParamsProvider
}

object DeleteMultifactorParams {
  @scala.inline
  def apply(id: String, provider: DeleteDeleteMultifactorParamsProvider): DeleteMultifactorParams = {
    val __obj = js.Dynamic.literal(id = id, provider = provider)
  
    __obj.asInstanceOf[DeleteMultifactorParams]
  }
}

