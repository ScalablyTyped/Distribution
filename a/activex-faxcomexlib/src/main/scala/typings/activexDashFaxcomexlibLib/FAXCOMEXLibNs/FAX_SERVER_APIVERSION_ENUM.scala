package typings
package activexDashFaxcomexlibLib.FAXCOMEXLibNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FAX_SERVER_APIVERSION_ENUM extends js.Object

// tslint:disable-next-line:no-const-enum
@JSGlobal("FAXCOMEXLib.FAX_SERVER_APIVERSION_ENUM")
@js.native
object FAX_SERVER_APIVERSION_ENUM extends js.Object {
  @js.native
  sealed trait fsAPI_VERSION_0
    extends activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_SERVER_APIVERSION_ENUM
  
  @js.native
  sealed trait fsAPI_VERSION_1
    extends activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_SERVER_APIVERSION_ENUM
  
  @js.native
  sealed trait fsAPI_VERSION_2
    extends activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_SERVER_APIVERSION_ENUM
  
  @js.native
  sealed trait fsAPI_VERSION_3
    extends activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_SERVER_APIVERSION_ENUM
  
  /* 0 */ val fsAPI_VERSION_0: fsAPI_VERSION_0 with scala.Double = js.native
  /* 65536 */ val fsAPI_VERSION_1: fsAPI_VERSION_1 with scala.Double = js.native
  /* 131072 */ val fsAPI_VERSION_2: fsAPI_VERSION_2 with scala.Double = js.native
  /* 196608 */ val fsAPI_VERSION_3: fsAPI_VERSION_3 with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_SERVER_APIVERSION_ENUM with scala.Double
  ] = js.native
}

