package typings
package activexDashFaxcomexlibLib.FAXCOMEXLibNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FAX_SERVER_EVENTS_TYPE_ENUM extends js.Object

// tslint:disable-next-line:no-const-enum
@JSGlobal("FAXCOMEXLib.FAX_SERVER_EVENTS_TYPE_ENUM")
@js.native
object FAX_SERVER_EVENTS_TYPE_ENUM extends js.Object {
  @js.native
  sealed trait fsetACTIVITY
    extends activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_SERVER_EVENTS_TYPE_ENUM
  
  @js.native
  sealed trait fsetCONFIG
    extends activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_SERVER_EVENTS_TYPE_ENUM
  
  @js.native
  sealed trait fsetDEVICE_STATUS
    extends activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_SERVER_EVENTS_TYPE_ENUM
  
  @js.native
  sealed trait fsetFXSSVC_ENDED
    extends activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_SERVER_EVENTS_TYPE_ENUM
  
  @js.native
  sealed trait fsetINCOMING_CALL
    extends activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_SERVER_EVENTS_TYPE_ENUM
  
  @js.native
  sealed trait fsetIN_ARCHIVE
    extends activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_SERVER_EVENTS_TYPE_ENUM
  
  @js.native
  sealed trait fsetIN_QUEUE
    extends activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_SERVER_EVENTS_TYPE_ENUM
  
  @js.native
  sealed trait fsetNONE
    extends activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_SERVER_EVENTS_TYPE_ENUM
  
  @js.native
  sealed trait fsetOUT_ARCHIVE
    extends activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_SERVER_EVENTS_TYPE_ENUM
  
  @js.native
  sealed trait fsetOUT_QUEUE
    extends activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_SERVER_EVENTS_TYPE_ENUM
  
  @js.native
  sealed trait fsetQUEUE_STATE
    extends activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_SERVER_EVENTS_TYPE_ENUM
  
  /* 8 */ val fsetACTIVITY: fsetACTIVITY with scala.Double = js.native
  /* 4 */ val fsetCONFIG: fsetCONFIG with scala.Double = js.native
  /* 256 */ val fsetDEVICE_STATUS: fsetDEVICE_STATUS with scala.Double = js.native
  /* 128 */ val fsetFXSSVC_ENDED: fsetFXSSVC_ENDED with scala.Double = js.native
  /* 512 */ val fsetINCOMING_CALL: fsetINCOMING_CALL with scala.Double = js.native
  /* 32 */ val fsetIN_ARCHIVE: fsetIN_ARCHIVE with scala.Double = js.native
  /* 1 */ val fsetIN_QUEUE: fsetIN_QUEUE with scala.Double = js.native
  /* 0 */ val fsetNONE: fsetNONE with scala.Double = js.native
  /* 64 */ val fsetOUT_ARCHIVE: fsetOUT_ARCHIVE with scala.Double = js.native
  /* 2 */ val fsetOUT_QUEUE: fsetOUT_QUEUE with scala.Double = js.native
  /* 16 */ val fsetQUEUE_STATE: fsetQUEUE_STATE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_SERVER_EVENTS_TYPE_ENUM with scala.Double
  ] = js.native
}

