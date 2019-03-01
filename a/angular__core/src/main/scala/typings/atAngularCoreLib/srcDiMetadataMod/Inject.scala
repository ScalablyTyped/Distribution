package typings
package atAngularCoreLib.srcDiMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Inject extends js.Object {
  /**
    * A [DI token](guide/glossary#di-token) that maps to the dependency to be injected.
    */
  var token: js.Any
}

object Inject {
  @scala.inline
  def apply(token: js.Any): Inject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("token")(token)
    __obj.asInstanceOf[Inject]
  }
}

