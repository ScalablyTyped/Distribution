package typings
package antdLib.esAffixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AffixStatus extends js.Object

@JSImport("antd/es/affix", "AffixStatus")
@js.native
object AffixStatus extends js.Object {
  @js.native
  sealed trait None
    extends antdLib.esAffixMod.AffixStatus
  
  @js.native
  sealed trait Prepare
    extends antdLib.esAffixMod.AffixStatus
  
}

