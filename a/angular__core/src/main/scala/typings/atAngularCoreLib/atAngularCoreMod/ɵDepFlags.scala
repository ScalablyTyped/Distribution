package typings
package atAngularCoreLib.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ɵDepFlags extends js.Object

@JSImport("@angular/core", "ɵDepFlags")
@js.native
object ɵDepFlags extends js.Object {
  @js.native
  sealed trait None
    extends atAngularCoreLib.atAngularCoreMod.ɵDepFlags
  
  @js.native
  sealed trait Optional
    extends atAngularCoreLib.atAngularCoreMod.ɵDepFlags
  
  @js.native
  sealed trait Self
    extends atAngularCoreLib.atAngularCoreMod.ɵDepFlags
  
  @js.native
  sealed trait SkipSelf
    extends atAngularCoreLib.atAngularCoreMod.ɵDepFlags
  
  @js.native
  sealed trait Value
    extends atAngularCoreLib.atAngularCoreMod.ɵDepFlags
  
  /* 0 */ val None: None with scala.Double = js.native
  /* 2 */ val Optional: Optional with scala.Double = js.native
  /* 4 */ val Self: Self with scala.Double = js.native
  /* 1 */ val SkipSelf: SkipSelf with scala.Double = js.native
  /* 8 */ val Value: Value with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[atAngularCoreLib.atAngularCoreMod.ɵDepFlags with scala.Double] = js.native
}

