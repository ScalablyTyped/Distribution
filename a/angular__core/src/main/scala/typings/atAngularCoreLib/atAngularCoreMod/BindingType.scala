package typings
package atAngularCoreLib.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BindingType extends js.Object

@JSImport("@angular/core", "BindingType")
@js.native
object BindingType extends js.Object {
  @js.native
  sealed trait Class
    extends atAngularCoreLib.atAngularCoreMod.BindingType
  
  @js.native
  sealed trait Style
    extends atAngularCoreLib.atAngularCoreMod.BindingType
  
  @js.native
  sealed trait Unset
    extends atAngularCoreLib.atAngularCoreMod.BindingType
  
}

