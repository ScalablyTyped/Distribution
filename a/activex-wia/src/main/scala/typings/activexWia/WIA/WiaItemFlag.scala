package typings.activexWia.WIA

import typings.activexWia.activexWiaNumbers.`-2147483648`
import typings.activexWia.activexWiaNumbers.`0`
import typings.activexWia.activexWiaNumbers.`1024`
import typings.activexWia.activexWiaNumbers.`128`
import typings.activexWia.activexWiaNumbers.`16384`
import typings.activexWia.activexWiaNumbers.`16`
import typings.activexWia.activexWiaNumbers.`1`
import typings.activexWia.activexWiaNumbers.`2048`
import typings.activexWia.activexWiaNumbers.`256`
import typings.activexWia.activexWiaNumbers.`2`
import typings.activexWia.activexWiaNumbers.`32768`
import typings.activexWia.activexWiaNumbers.`32`
import typings.activexWia.activexWiaNumbers.`4096`
import typings.activexWia.activexWiaNumbers.`4`
import typings.activexWia.activexWiaNumbers.`512`
import typings.activexWia.activexWiaNumbers.`64`
import typings.activexWia.activexWiaNumbers.`65536`
import typings.activexWia.activexWiaNumbers.`8192`
import typings.activexWia.activexWiaNumbers.`8`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An Item's type is composed of bits from the WiaItemFlags enumeration. You can test an Item's type by using the AND operation with
  * Item.Properties("Item Flags") and a member from the WiaItemFlags enumeration.
  */
/* Rewritten from type alias, can be one of: 
  - typings.activexWia.activexWiaNumbers.`16`
  - typings.activexWia.activexWiaNumbers.`32`
  - typings.activexWia.activexWiaNumbers.`2048`
  - typings.activexWia.activexWiaNumbers.`128`
  - typings.activexWia.activexWiaNumbers.`64`
  - typings.activexWia.activexWiaNumbers.`256`
  - typings.activexWia.activexWiaNumbers.`2`
  - typings.activexWia.activexWiaNumbers.`4`
  - typings.activexWia.activexWiaNumbers.`0`
  - typings.activexWia.activexWiaNumbers.`16384`
  - typings.activexWia.activexWiaNumbers.`32768`
  - typings.activexWia.activexWiaNumbers.`512`
  - typings.activexWia.activexWiaNumbers.`1`
  - typings.activexWia.activexWiaNumbers.`-2147483648`
  - typings.activexWia.activexWiaNumbers.`8`
  - typings.activexWia.activexWiaNumbers.`4096`
  - typings.activexWia.activexWiaNumbers.`8192`
  - typings.activexWia.activexWiaNumbers.`65536`
  - typings.activexWia.activexWiaNumbers.`1024`
*/
trait WiaItemFlag extends StObject
object WiaItemFlag {
  
  @scala.inline
  def AnalyzeItemFlag: `16` = 16.asInstanceOf[`16`]
  
  @scala.inline
  def AudioItemFlag: `32` = 32.asInstanceOf[`32`]
  
  @scala.inline
  def BurstItemFlag: `2048` = 2048.asInstanceOf[`2048`]
  
  @scala.inline
  def DeletedItemFlag: `128` = 128.asInstanceOf[`128`]
  
  @scala.inline
  def DeviceItemFlag: `64` = 64.asInstanceOf[`64`]
  
  @scala.inline
  def DisconnectedItemFlag: `256` = 256.asInstanceOf[`256`]
  
  @scala.inline
  def FileItemFlag: `2` = 2.asInstanceOf[`2`]
  
  @scala.inline
  def FolderItemFlag: `4` = 4.asInstanceOf[`4`]
  
  @scala.inline
  def FreeItemFlag: `0` = 0.asInstanceOf[`0`]
  
  @scala.inline
  def GeneratedItemFlag: `16384` = 16384.asInstanceOf[`16384`]
  
  @scala.inline
  def HPanoramaItemFlag: `512` = 512.asInstanceOf[`512`]
  
  @scala.inline
  def HasAttachmentsItemFlag: `32768` = 32768.asInstanceOf[`32768`]
  
  @scala.inline
  def ImageItemFlag: `1` = 1.asInstanceOf[`1`]
  
  @scala.inline
  def RemovedItemFlag: `-2147483648` = -2147483648.asInstanceOf[`-2147483648`]
  
  @scala.inline
  def RootItemFlag: `8` = 8.asInstanceOf[`8`]
  
  @scala.inline
  def StorageItemFlag: `4096` = 4096.asInstanceOf[`4096`]
  
  @scala.inline
  def TransferItemFlag: `8192` = 8192.asInstanceOf[`8192`]
  
  @scala.inline
  def VPanoramaItemFlag: `1024` = 1024.asInstanceOf[`1024`]
  
  @scala.inline
  def VideoItemFlag: `65536` = 65536.asInstanceOf[`65536`]
}
