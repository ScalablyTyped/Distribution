package typings
package atAngularCoreLib.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait IcuType extends js.Object

/**
  * Defines the ICU type of `select` or `plural`
  */
@JSImport("@angular/core", "IcuType")
@js.native
object IcuType extends js.Object {
  @js.native
  sealed trait plural
    extends atAngularCoreLib.atAngularCoreMod.IcuType
  
  @js.native
  sealed trait select
    extends atAngularCoreLib.atAngularCoreMod.IcuType
  
}

