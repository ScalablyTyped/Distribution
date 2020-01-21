package typings.angularEs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("angular-es", "Inject")
@js.native
object Inject extends js.Object {
  /**
    * Add $inject property to target
    *
    * @param {Array<string>} dependencies - dependencies to inject
    *
    * @returns {ngESDecorator} - decorated class
    */
  def apply(dependencies: String*): ngESDecorator = js.native
}

