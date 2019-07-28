package typings.activexDashWia.WIANs

import typings.activexDashWia.activexDashWiaNumbers.`-2147483648`
import typings.activexDashWia.activexDashWiaNumbers.`0`
import typings.activexDashWia.activexDashWiaNumbers.`1024`
import typings.activexDashWia.activexDashWiaNumbers.`128`
import typings.activexDashWia.activexDashWiaNumbers.`16384`
import typings.activexDashWia.activexDashWiaNumbers.`16`
import typings.activexDashWia.activexDashWiaNumbers.`1`
import typings.activexDashWia.activexDashWiaNumbers.`2048`
import typings.activexDashWia.activexDashWiaNumbers.`256`
import typings.activexDashWia.activexDashWiaNumbers.`2`
import typings.activexDashWia.activexDashWiaNumbers.`32768`
import typings.activexDashWia.activexDashWiaNumbers.`32`
import typings.activexDashWia.activexDashWiaNumbers.`4096`
import typings.activexDashWia.activexDashWiaNumbers.`4`
import typings.activexDashWia.activexDashWiaNumbers.`512`
import typings.activexDashWia.activexDashWiaNumbers.`64`
import typings.activexDashWia.activexDashWiaNumbers.`65536`
import typings.activexDashWia.activexDashWiaNumbers.`8192`
import typings.activexDashWia.activexDashWiaNumbers.`8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An Item's type is composed of bits from the WiaItemFlags enumeration. You can test an Item's type by using the AND operation with
  * Item.Properties("Item Flags") and a member from the WiaItemFlags enumeration.
  */
/* Rewritten from type alias, can be one of: 
  - typings.activexDashWia.activexDashWiaNumbers.`16`
  - typings.activexDashWia.activexDashWiaNumbers.`32`
  - typings.activexDashWia.activexDashWiaNumbers.`2048`
  - typings.activexDashWia.activexDashWiaNumbers.`128`
  - typings.activexDashWia.activexDashWiaNumbers.`64`
  - typings.activexDashWia.activexDashWiaNumbers.`256`
  - typings.activexDashWia.activexDashWiaNumbers.`2`
  - typings.activexDashWia.activexDashWiaNumbers.`4`
  - typings.activexDashWia.activexDashWiaNumbers.`0`
  - typings.activexDashWia.activexDashWiaNumbers.`16384`
  - typings.activexDashWia.activexDashWiaNumbers.`32768`
  - typings.activexDashWia.activexDashWiaNumbers.`512`
  - typings.activexDashWia.activexDashWiaNumbers.`1`
  - typings.activexDashWia.activexDashWiaNumbers.`-2147483648`
  - typings.activexDashWia.activexDashWiaNumbers.`8`
  - typings.activexDashWia.activexDashWiaNumbers.`4096`
  - typings.activexDashWia.activexDashWiaNumbers.`8192`
  - typings.activexDashWia.activexDashWiaNumbers.`65536`
  - typings.activexDashWia.activexDashWiaNumbers.`1024`
*/
trait WiaItemFlag extends js.Object

object WiaItemFlag {
  @scala.inline
  def AnalyzeItemFlag: `16` = this.cast(16)
  @scala.inline
  def AudioItemFlag: `32` = this.cast(32)
  @scala.inline
  def BurstItemFlag: `2048` = this.cast(2048)
  @scala.inline
  def DeletedItemFlag: `128` = this.cast(128)
  @scala.inline
  def DeviceItemFlag: `64` = this.cast(64)
  @scala.inline
  def DisconnectedItemFlag: `256` = this.cast(256)
  @scala.inline
  def FileItemFlag: `2` = this.cast(2)
  @scala.inline
  def FolderItemFlag: `4` = this.cast(4)
  @scala.inline
  def FreeItemFlag: `0` = this.cast(0)
  @scala.inline
  def GeneratedItemFlag: `16384` = this.cast(16384)
  @scala.inline
  def HPanoramaItemFlag: `512` = this.cast(512)
  @scala.inline
  def HasAttachmentsItemFlag: `32768` = this.cast(32768)
  @scala.inline
  def ImageItemFlag: `1` = this.cast(1)
  @scala.inline
  def RemovedItemFlag: `-2147483648` = this.cast(-2147483648)
  @scala.inline
  def RootItemFlag: `8` = this.cast(8)
  @scala.inline
  def StorageItemFlag: `4096` = this.cast(4096)
  @scala.inline
  def TransferItemFlag: `8192` = this.cast(8192)
  @scala.inline
  def VPanoramaItemFlag: `1024` = this.cast(1024)
  @scala.inline
  def VideoItemFlag: `65536` = this.cast(65536)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

