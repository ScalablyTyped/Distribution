package typings
package atAngularCoreLib.srcViewTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DepFlags extends js.Object

@JSImport("@angular/core/src/view/types", "DepFlags")
@js.native
object DepFlags extends js.Object {
  @js.native
  sealed trait None
    extends atAngularCoreLib.srcViewTypesMod.DepFlags
  
  @js.native
  sealed trait Optional
    extends atAngularCoreLib.srcViewTypesMod.DepFlags
  
  @js.native
  sealed trait Self
    extends atAngularCoreLib.srcViewTypesMod.DepFlags
  
  @js.native
  sealed trait SkipSelf
    extends atAngularCoreLib.srcViewTypesMod.DepFlags
  
  @js.native
  sealed trait Value
    extends atAngularCoreLib.srcViewTypesMod.DepFlags
  
  /* 0 */ val None: None with scala.Double = js.native
  /* 2 */ val Optional: Optional with scala.Double = js.native
  /* 4 */ val Self: Self with scala.Double = js.native
  /* 1 */ val SkipSelf: SkipSelf with scala.Double = js.native
  /* 8 */ val Value: Value with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[atAngularCoreLib.srcViewTypesMod.DepFlags with scala.Double] = js.native
}

