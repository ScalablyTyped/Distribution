package typings.angularEs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("angular-es", "Directive")
@js.native
object Directive extends js.Object {
  
  /**
    * Register directive
    *
    * @param name - directive selector, can be in hyphen-case
    *
    * @returns decorated class
    */
  def apply(name: String): ngESDecorator = js.native
}
