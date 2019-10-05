package typings.activexDashWia.WIA

import typings.activexDashWia.activexDashWiaStrings.`{143E4E83-6497-11D2-A231-00C04FA31809}`
import typings.activexDashWia.activexDashWiaStrings.`{154E27BE-B617-4653-ACC5-0FD7BD4C65CE}`
import typings.activexDashWia.activexDashWiaStrings.`{1D22A559-E14F-11D2-B326-00C04F68CE61}`
import typings.activexDashWia.activexDashWiaStrings.`{4C8F4EF5-E14F-11D2-B326-00C04F68CE61}`
import typings.activexDashWia.activexDashWiaStrings.`{9B2B662C-6185-438C-B68B-E39EE25E71CB}`
import typings.activexDashWia.activexDashWiaStrings.`{9D095B89-37D6-4877-AFED-62A297DC6DBE}`
import typings.activexDashWia.activexDashWiaStrings.`{A28BBADE-64B6-11D2-A231-00C04FA31809}`
import typings.activexDashWia.activexDashWiaStrings.`{A65B704A-7F3C-4447-A75D-8A26DFCA1FDF}`
import typings.activexDashWia.activexDashWiaStrings.`{A6C5A715-8C6E-11D2-977A-0000F87A926F}`
import typings.activexDashWia.activexDashWiaStrings.`{B441F425-8C6E-11D2-977A-0000F87A926F}`
import typings.activexDashWia.activexDashWiaStrings.`{C00EB793-8C6E-11D2-977A-0000F87A926F}`
import typings.activexDashWia.activexDashWiaStrings.`{C686DCEE-54F2-419E-9A27-2FC7F2E98F9E}`
import typings.activexDashWia.activexDashWiaStrings.`{FC4767C1-C8B3-48A2-9CFA-2E90CB3D3590}`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** String versions of globally unique identifiers (GUIDs) that identify DeviceManager events. */
/* Rewritten from type alias, can be one of: 
  - typings.activexDashWia.activexDashWiaStrings.`{A28BBADE-64B6-11D2-A231-00C04FA31809}`
  - typings.activexDashWia.activexDashWiaStrings.`{143E4E83-6497-11D2-A231-00C04FA31809}`
  - typings.activexDashWia.activexDashWiaStrings.`{4C8F4EF5-E14F-11D2-B326-00C04F68CE61}`
  - typings.activexDashWia.activexDashWiaStrings.`{1D22A559-E14F-11D2-B326-00C04F68CE61}`
  - typings.activexDashWia.activexDashWiaStrings.`{C686DCEE-54F2-419E-9A27-2FC7F2E98F9E}`
  - typings.activexDashWia.activexDashWiaStrings.`{C00EB793-8C6E-11D2-977A-0000F87A926F}`
  - typings.activexDashWia.activexDashWiaStrings.`{9B2B662C-6185-438C-B68B-E39EE25E71CB}`
  - typings.activexDashWia.activexDashWiaStrings.`{A6C5A715-8C6E-11D2-977A-0000F87A926F}`
  - typings.activexDashWia.activexDashWiaStrings.`{FC4767C1-C8B3-48A2-9CFA-2E90CB3D3590}`
  - typings.activexDashWia.activexDashWiaStrings.`{154E27BE-B617-4653-ACC5-0FD7BD4C65CE}`
  - typings.activexDashWia.activexDashWiaStrings.`{A65B704A-7F3C-4447-A75D-8A26DFCA1FDF}`
  - typings.activexDashWia.activexDashWiaStrings.`{9D095B89-37D6-4877-AFED-62A297DC6DBE}`
  - typings.activexDashWia.activexDashWiaStrings.`{B441F425-8C6E-11D2-977A-0000F87A926F}`
*/
trait EventID extends js.Object

object EventID {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def wiaEventDeviceConnected: `{A28BBADE-64B6-11D2-A231-00C04FA31809}` = this.cast("{A28BBADE-64B6-11D2-A231-00C04FA31809}")
  @scala.inline
  def wiaEventDeviceDisconnected: `{143E4E83-6497-11D2-A231-00C04FA31809}` = this.cast("{143E4E83-6497-11D2-A231-00C04FA31809}")
  @scala.inline
  def wiaEventItemCreated: `{4C8F4EF5-E14F-11D2-B326-00C04F68CE61}` = this.cast("{4C8F4EF5-E14F-11D2-B326-00C04F68CE61}")
  @scala.inline
  def wiaEventItemDeleted: `{1D22A559-E14F-11D2-B326-00C04F68CE61}` = this.cast("{1D22A559-E14F-11D2-B326-00C04F68CE61}")
  @scala.inline
  def wiaEventScanEmailImage: `{C686DCEE-54F2-419E-9A27-2FC7F2E98F9E}` = this.cast("{C686DCEE-54F2-419E-9A27-2FC7F2E98F9E}")
  @scala.inline
  def wiaEventScanFaxImage: `{C00EB793-8C6E-11D2-977A-0000F87A926F}` = this.cast("{C00EB793-8C6E-11D2-977A-0000F87A926F}")
  @scala.inline
  def wiaEventScanFilmImage: `{9B2B662C-6185-438C-B68B-E39EE25E71CB}` = this.cast("{9B2B662C-6185-438C-B68B-E39EE25E71CB}")
  @scala.inline
  def wiaEventScanImage: `{A6C5A715-8C6E-11D2-977A-0000F87A926F}` = this.cast("{A6C5A715-8C6E-11D2-977A-0000F87A926F}")
  @scala.inline
  def wiaEventScanImage2: `{FC4767C1-C8B3-48A2-9CFA-2E90CB3D3590}` = this.cast("{FC4767C1-C8B3-48A2-9CFA-2E90CB3D3590}")
  @scala.inline
  def wiaEventScanImage3: `{154E27BE-B617-4653-ACC5-0FD7BD4C65CE}` = this.cast("{154E27BE-B617-4653-ACC5-0FD7BD4C65CE}")
  @scala.inline
  def wiaEventScanImage4: `{A65B704A-7F3C-4447-A75D-8A26DFCA1FDF}` = this.cast("{A65B704A-7F3C-4447-A75D-8A26DFCA1FDF}")
  @scala.inline
  def wiaEventScanOCRImage: `{9D095B89-37D6-4877-AFED-62A297DC6DBE}` = this.cast("{9D095B89-37D6-4877-AFED-62A297DC6DBE}")
  @scala.inline
  def wiaEventScanPrintImage: `{B441F425-8C6E-11D2-977A-0000F87A926F}` = this.cast("{B441F425-8C6E-11D2-977A-0000F87A926F}")
}

