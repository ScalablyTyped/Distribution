package typings
package activexDashWiaLib.WIANs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An Item's type is composed of bits from the WiaItemFlags enumeration. You can test an Item's type by using the AND operation with
  * Item.Properties("Item Flags") and a member from the WiaItemFlags enumeration.
  */
/* Rewritten from type alias, can be one of: 
  - activexDashWiaLib.activexDashWiaLibNumbers.`16`
  - activexDashWiaLib.activexDashWiaLibNumbers.`32`
  - activexDashWiaLib.activexDashWiaLibNumbers.`2048`
  - activexDashWiaLib.activexDashWiaLibNumbers.`128`
  - activexDashWiaLib.activexDashWiaLibNumbers.`64`
  - activexDashWiaLib.activexDashWiaLibNumbers.`256`
  - activexDashWiaLib.activexDashWiaLibNumbers.`2`
  - activexDashWiaLib.activexDashWiaLibNumbers.`4`
  - activexDashWiaLib.activexDashWiaLibNumbers.`0`
  - activexDashWiaLib.activexDashWiaLibNumbers.`16384`
  - activexDashWiaLib.activexDashWiaLibNumbers.`32768`
  - activexDashWiaLib.activexDashWiaLibNumbers.`512`
  - activexDashWiaLib.activexDashWiaLibNumbers.`1`
  - activexDashWiaLib.activexDashWiaLibNumbers.`-2147483648`
  - activexDashWiaLib.activexDashWiaLibNumbers.`8`
  - activexDashWiaLib.activexDashWiaLibNumbers.`4096`
  - activexDashWiaLib.activexDashWiaLibNumbers.`8192`
  - activexDashWiaLib.activexDashWiaLibNumbers.`65536`
  - activexDashWiaLib.activexDashWiaLibNumbers.`1024`
*/
trait WiaItemFlag extends js.Object

object WiaItemFlag {
  @scala.inline
  def AnalyzeItemFlag: activexDashWiaLib.activexDashWiaLibNumbers.`16` = this.cast(16)
  @scala.inline
  def AudioItemFlag: activexDashWiaLib.activexDashWiaLibNumbers.`32` = this.cast(32)
  @scala.inline
  def BurstItemFlag: activexDashWiaLib.activexDashWiaLibNumbers.`2048` = this.cast(2048)
  @scala.inline
  def DeletedItemFlag: activexDashWiaLib.activexDashWiaLibNumbers.`128` = this.cast(128)
  @scala.inline
  def DeviceItemFlag: activexDashWiaLib.activexDashWiaLibNumbers.`64` = this.cast(64)
  @scala.inline
  def DisconnectedItemFlag: activexDashWiaLib.activexDashWiaLibNumbers.`256` = this.cast(256)
  @scala.inline
  def FileItemFlag: activexDashWiaLib.activexDashWiaLibNumbers.`2` = this.cast(2)
  @scala.inline
  def FolderItemFlag: activexDashWiaLib.activexDashWiaLibNumbers.`4` = this.cast(4)
  @scala.inline
  def FreeItemFlag: activexDashWiaLib.activexDashWiaLibNumbers.`0` = this.cast(0)
  @scala.inline
  def GeneratedItemFlag: activexDashWiaLib.activexDashWiaLibNumbers.`16384` = this.cast(16384)
  @scala.inline
  def HPanoramaItemFlag: activexDashWiaLib.activexDashWiaLibNumbers.`512` = this.cast(512)
  @scala.inline
  def HasAttachmentsItemFlag: activexDashWiaLib.activexDashWiaLibNumbers.`32768` = this.cast(32768)
  @scala.inline
  def ImageItemFlag: activexDashWiaLib.activexDashWiaLibNumbers.`1` = this.cast(1)
  @scala.inline
  def RemovedItemFlag: activexDashWiaLib.activexDashWiaLibNumbers.`-2147483648` = this.cast(-2147483648)
  @scala.inline
  def RootItemFlag: activexDashWiaLib.activexDashWiaLibNumbers.`8` = this.cast(8)
  @scala.inline
  def StorageItemFlag: activexDashWiaLib.activexDashWiaLibNumbers.`4096` = this.cast(4096)
  @scala.inline
  def TransferItemFlag: activexDashWiaLib.activexDashWiaLibNumbers.`8192` = this.cast(8192)
  @scala.inline
  def VPanoramaItemFlag: activexDashWiaLib.activexDashWiaLibNumbers.`1024` = this.cast(1024)
  @scala.inline
  def VideoItemFlag: activexDashWiaLib.activexDashWiaLibNumbers.`65536` = this.cast(65536)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

