package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PropertyValueState extends js.Object

/**
  * defines the states of a property value in the process of obtaining the value (asynchronously).
  * @see PropertyValueInfo
  */
@JSGlobal("com.sun.star.ucb.PropertyValueState")
@js.native
object PropertyValueState extends js.Object {
  /** The given property name/handle is invalid. */
  @js.native
  sealed trait INVALID_NAME
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.PropertyValueState
  
  /** The given property type is invalid. */
  @js.native
  sealed trait INVALID_TYPE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.PropertyValueState
  
  /** The value was obtained. <p>The value is stored in PropertyValueInfo::Value. */
  @js.native
  sealed trait PROCESSED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.PropertyValueState
  
  /** The property value was not obtained yet. */
  @js.native
  sealed trait UNPROCESSED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.PropertyValueState
  
  /* 2 */ val INVALID_NAME: INVALID_NAME with scala.Double = js.native
  /* 3 */ val INVALID_TYPE: INVALID_TYPE with scala.Double = js.native
  /* 1 */ val PROCESSED: PROCESSED with scala.Double = js.native
  /* 0 */ val UNPROCESSED: UNPROCESSED with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.PropertyValueState with scala.Double
  ] = js.native
}

