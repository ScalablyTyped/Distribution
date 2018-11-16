package typings
package activexDashFaxcomexlibLib.FAXCOMEXLibNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FAX_PROVIDER_STATUS_ENUM extends js.Object

// tslint:disable-next-line:no-const-enum
@JSGlobal("FAXCOMEXLib.FAX_PROVIDER_STATUS_ENUM")
@js.native
object FAX_PROVIDER_STATUS_ENUM extends js.Object {
  @js.native
  sealed trait fpsBAD_GUID
    extends activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_PROVIDER_STATUS_ENUM
  
  @js.native
  sealed trait fpsBAD_VERSION
    extends activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_PROVIDER_STATUS_ENUM
  
  @js.native
  sealed trait fpsCANT_INIT
    extends activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_PROVIDER_STATUS_ENUM
  
  @js.native
  sealed trait fpsCANT_LINK
    extends activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_PROVIDER_STATUS_ENUM
  
  @js.native
  sealed trait fpsCANT_LOAD
    extends activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_PROVIDER_STATUS_ENUM
  
  @js.native
  sealed trait fpsSERVER_ERROR
    extends activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_PROVIDER_STATUS_ENUM
  
  @js.native
  sealed trait fpsSUCCESS
    extends activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_PROVIDER_STATUS_ENUM
  
  /* 2 */ val fpsBAD_GUID: fpsBAD_GUID with scala.Double = js.native
  /* 3 */ val fpsBAD_VERSION: fpsBAD_VERSION with scala.Double = js.native
  /* 6 */ val fpsCANT_INIT: fpsCANT_INIT with scala.Double = js.native
  /* 5 */ val fpsCANT_LINK: fpsCANT_LINK with scala.Double = js.native
  /* 4 */ val fpsCANT_LOAD: fpsCANT_LOAD with scala.Double = js.native
  /* 1 */ val fpsSERVER_ERROR: fpsSERVER_ERROR with scala.Double = js.native
  /* 0 */ val fpsSUCCESS: fpsSUCCESS with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_PROVIDER_STATUS_ENUM with scala.Double
  ] = js.native
}

