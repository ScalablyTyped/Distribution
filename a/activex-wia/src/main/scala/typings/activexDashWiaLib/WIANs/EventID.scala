package typings
package activexDashWiaLib.WIANs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EventID extends js.Object

/** String versions of globally unique identifiers (GUIDs) that identify DeviceManager events. */
@JSGlobal("WIA.EventID")
@js.native
object EventID extends js.Object {
  @js.native
  sealed trait wiaEventDeviceConnected
    extends activexDashWiaLib.WIANs.EventID
  
  @js.native
  sealed trait wiaEventDeviceDisconnected
    extends activexDashWiaLib.WIANs.EventID
  
  @js.native
  sealed trait wiaEventItemCreated
    extends activexDashWiaLib.WIANs.EventID
  
  @js.native
  sealed trait wiaEventItemDeleted
    extends activexDashWiaLib.WIANs.EventID
  
  @js.native
  sealed trait wiaEventScanEmailImage
    extends activexDashWiaLib.WIANs.EventID
  
  @js.native
  sealed trait wiaEventScanFaxImage
    extends activexDashWiaLib.WIANs.EventID
  
  @js.native
  sealed trait wiaEventScanFilmImage
    extends activexDashWiaLib.WIANs.EventID
  
  @js.native
  sealed trait wiaEventScanImage
    extends activexDashWiaLib.WIANs.EventID
  
  @js.native
  sealed trait wiaEventScanImage2
    extends activexDashWiaLib.WIANs.EventID
  
  @js.native
  sealed trait wiaEventScanImage3
    extends activexDashWiaLib.WIANs.EventID
  
  @js.native
  sealed trait wiaEventScanImage4
    extends activexDashWiaLib.WIANs.EventID
  
  @js.native
  sealed trait wiaEventScanOCRImage
    extends activexDashWiaLib.WIANs.EventID
  
  @js.native
  sealed trait wiaEventScanPrintImage
    extends activexDashWiaLib.WIANs.EventID
  
  /* "{A28BBADE-64B6-11D2-A231-00C04FA31809}" */ val wiaEventDeviceConnected: wiaEventDeviceConnected with java.lang.String = js.native
  /* "{143E4E83-6497-11D2-A231-00C04FA31809}" */ val wiaEventDeviceDisconnected: wiaEventDeviceDisconnected with java.lang.String = js.native
  /* "{4C8F4EF5-E14F-11D2-B326-00C04F68CE61}" */ val wiaEventItemCreated: wiaEventItemCreated with java.lang.String = js.native
  /* "{1D22A559-E14F-11D2-B326-00C04F68CE61}" */ val wiaEventItemDeleted: wiaEventItemDeleted with java.lang.String = js.native
  /* "{C686DCEE-54F2-419E-9A27-2FC7F2E98F9E}" */ val wiaEventScanEmailImage: wiaEventScanEmailImage with java.lang.String = js.native
  /* "{C00EB793-8C6E-11D2-977A-0000F87A926F}" */ val wiaEventScanFaxImage: wiaEventScanFaxImage with java.lang.String = js.native
  /* "{9B2B662C-6185-438C-B68B-E39EE25E71CB}" */ val wiaEventScanFilmImage: wiaEventScanFilmImage with java.lang.String = js.native
  /* "{A6C5A715-8C6E-11D2-977A-0000F87A926F}" */ val wiaEventScanImage: wiaEventScanImage with java.lang.String = js.native
  /* "{FC4767C1-C8B3-48A2-9CFA-2E90CB3D3590}" */ val wiaEventScanImage2: wiaEventScanImage2 with java.lang.String = js.native
  /* "{154E27BE-B617-4653-ACC5-0FD7BD4C65CE}" */ val wiaEventScanImage3: wiaEventScanImage3 with java.lang.String = js.native
  /* "{A65B704A-7F3C-4447-A75D-8A26DFCA1FDF}" */ val wiaEventScanImage4: wiaEventScanImage4 with java.lang.String = js.native
  /* "{9D095B89-37D6-4877-AFED-62A297DC6DBE}" */ val wiaEventScanOCRImage: wiaEventScanOCRImage with java.lang.String = js.native
  /* "{B441F425-8C6E-11D2-977A-0000F87A926F}" */ val wiaEventScanPrintImage: wiaEventScanPrintImage with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[activexDashWiaLib.WIANs.EventID with java.lang.String] = js.native
}

