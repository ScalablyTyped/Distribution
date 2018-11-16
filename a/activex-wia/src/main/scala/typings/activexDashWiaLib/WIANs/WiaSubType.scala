package typings
package activexDashWiaLib.WIANs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WiaSubType extends js.Object

/**
     * The WiaSubType enumeration specifies more detail about the property value. Use the SubType property on the Property object to obtain these values for
     * the property.
     */
@JSGlobal("WIA.WiaSubType")
@js.native
object WiaSubType extends js.Object {
  @js.native
  sealed trait FlagSubType
    extends activexDashWiaLib.WIANs.WiaSubType
  
  @js.native
  sealed trait ListSubType
    extends activexDashWiaLib.WIANs.WiaSubType
  
  @js.native
  sealed trait RangeSubType
    extends activexDashWiaLib.WIANs.WiaSubType
  
  @js.native
  sealed trait UnspecifiedSubType
    extends activexDashWiaLib.WIANs.WiaSubType
  
  /* 3 */ val FlagSubType: FlagSubType with scala.Double = js.native
  /* 2 */ val ListSubType: ListSubType with scala.Double = js.native
  /* 1 */ val RangeSubType: RangeSubType with scala.Double = js.native
  /* 0 */ val UnspecifiedSubType: UnspecifiedSubType with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWiaLib.WIANs.WiaSubType with scala.Double] = js.native
}

