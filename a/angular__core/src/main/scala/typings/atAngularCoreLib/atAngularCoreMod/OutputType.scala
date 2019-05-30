package typings
package atAngularCoreLib.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OutputType extends js.Object

@JSImport("@angular/core", "OutputType")
@js.native
object OutputType extends js.Object {
  @js.native
  sealed trait DirectiveOutput
    extends atAngularCoreLib.atAngularCoreMod.OutputType
  
  @js.native
  sealed trait ElementOutput
    extends atAngularCoreLib.atAngularCoreMod.OutputType
  
}

