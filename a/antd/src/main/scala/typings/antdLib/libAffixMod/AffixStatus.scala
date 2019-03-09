package typings
package antdLib.libAffixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AffixStatus extends js.Object

@JSImport("antd/lib/affix", "AffixStatus")
@js.native
object AffixStatus extends js.Object {
  @js.native
  sealed trait None
    extends antdLib.libAffixMod.AffixStatus
  
  @js.native
  sealed trait Prepare
    extends antdLib.libAffixMod.AffixStatus
  
}

