package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.linguistic2Ns.DictionaryEventFlagsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.linguistic2.DictionaryEventFlags.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait ACTIVATE_DIC
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.linguistic2Ns.DictionaryEventFlagsNs.Constants
  
  @js.native
  sealed trait ADD_ENTRY
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.linguistic2Ns.DictionaryEventFlagsNs.Constants
  
  @js.native
  sealed trait CHG_LANGUAGE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.linguistic2Ns.DictionaryEventFlagsNs.Constants
  
  @js.native
  sealed trait CHG_NAME
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.linguistic2Ns.DictionaryEventFlagsNs.Constants
  
  @js.native
  sealed trait DEACTIVATE_DIC
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.linguistic2Ns.DictionaryEventFlagsNs.Constants
  
  @js.native
  sealed trait DEL_ENTRY
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.linguistic2Ns.DictionaryEventFlagsNs.Constants
  
  @js.native
  sealed trait ENTRIES_CLEARED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.linguistic2Ns.DictionaryEventFlagsNs.Constants
  
  /* 32 */ val ACTIVATE_DIC: ACTIVATE_DIC with scala.Double = js.native
  /* 1 */ val ADD_ENTRY: ADD_ENTRY with scala.Double = js.native
  /* 8 */ val CHG_LANGUAGE: CHG_LANGUAGE with scala.Double = js.native
  /* 4 */ val CHG_NAME: CHG_NAME with scala.Double = js.native
  /* 64 */ val DEACTIVATE_DIC: DEACTIVATE_DIC with scala.Double = js.native
  /* 2 */ val DEL_ENTRY: DEL_ENTRY with scala.Double = js.native
  /* 16 */ val ENTRIES_CLEARED: ENTRIES_CLEARED with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.linguistic2Ns.DictionaryEventFlagsNs.Constants with scala.Double
  ] = js.native
}

