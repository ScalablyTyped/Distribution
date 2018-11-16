package typings
package activexDashFaxcomexlibLib.FAXCOMEXLibNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FAX_ACCOUNT_EVENTS_TYPE_ENUM extends js.Object

// tslint:disable-next-line:no-const-enum
@JSGlobal("FAXCOMEXLib.FAX_ACCOUNT_EVENTS_TYPE_ENUM")
@js.native
object FAX_ACCOUNT_EVENTS_TYPE_ENUM extends js.Object {
  @js.native
  sealed trait faetFXSSVC_ENDED
    extends activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_ACCOUNT_EVENTS_TYPE_ENUM
  
  @js.native
  sealed trait faetIN_ARCHIVE
    extends activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_ACCOUNT_EVENTS_TYPE_ENUM
  
  @js.native
  sealed trait faetIN_QUEUE
    extends activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_ACCOUNT_EVENTS_TYPE_ENUM
  
  @js.native
  sealed trait faetNONE
    extends activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_ACCOUNT_EVENTS_TYPE_ENUM
  
  @js.native
  sealed trait faetOUT_ARCHIVE
    extends activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_ACCOUNT_EVENTS_TYPE_ENUM
  
  @js.native
  sealed trait faetOUT_QUEUE
    extends activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_ACCOUNT_EVENTS_TYPE_ENUM
  
  /* 16 */ val faetFXSSVC_ENDED: faetFXSSVC_ENDED with scala.Double = js.native
  /* 4 */ val faetIN_ARCHIVE: faetIN_ARCHIVE with scala.Double = js.native
  /* 1 */ val faetIN_QUEUE: faetIN_QUEUE with scala.Double = js.native
  /* 0 */ val faetNONE: faetNONE with scala.Double = js.native
  /* 8 */ val faetOUT_ARCHIVE: faetOUT_ARCHIVE with scala.Double = js.native
  /* 2 */ val faetOUT_QUEUE: faetOUT_QUEUE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_ACCOUNT_EVENTS_TYPE_ENUM with scala.Double
  ] = js.native
}

