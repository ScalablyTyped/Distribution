package typings.angularEs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("angular-es", "Inject")
@js.native
object Inject extends js.Object {
  
  /**
    * Add $inject property to target
    *
    * @param dependencies - dependencies to inject
    *
    * @returns decorated class
    */
  def apply(dependencies: String*): ngESDecorator = js.native
}
