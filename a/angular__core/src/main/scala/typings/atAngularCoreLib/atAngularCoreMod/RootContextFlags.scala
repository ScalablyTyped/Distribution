package typings
package atAngularCoreLib.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RootContextFlags extends js.Object

@JSImport("@angular/core", "RootContextFlags")
@js.native
object RootContextFlags extends js.Object {
  @js.native
  sealed trait DetectChanges
    extends atAngularCoreLib.atAngularCoreMod.RootContextFlags
  
  @js.native
  sealed trait Empty
    extends atAngularCoreLib.atAngularCoreMod.RootContextFlags
  
  @js.native
  sealed trait FlushPlayers
    extends atAngularCoreLib.atAngularCoreMod.RootContextFlags
  
}

