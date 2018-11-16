package typings
package activexDashWiaLib.WIANs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WiaItemFlag extends js.Object

/**
     * An Item's type is composed of bits from the WiaItemFlags enumeration. You can test an Item's type by using the AND operation with
     * Item.Properties("Item Flags") and a member from the WiaItemFlags enumeration.
     */
@JSGlobal("WIA.WiaItemFlag")
@js.native
object WiaItemFlag extends js.Object {
  @js.native
  sealed trait AnalyzeItemFlag
    extends activexDashWiaLib.WIANs.WiaItemFlag
  
  @js.native
  sealed trait AudioItemFlag
    extends activexDashWiaLib.WIANs.WiaItemFlag
  
  @js.native
  sealed trait BurstItemFlag
    extends activexDashWiaLib.WIANs.WiaItemFlag
  
  @js.native
  sealed trait DeletedItemFlag
    extends activexDashWiaLib.WIANs.WiaItemFlag
  
  @js.native
  sealed trait DeviceItemFlag
    extends activexDashWiaLib.WIANs.WiaItemFlag
  
  @js.native
  sealed trait DisconnectedItemFlag
    extends activexDashWiaLib.WIANs.WiaItemFlag
  
  @js.native
  sealed trait FileItemFlag
    extends activexDashWiaLib.WIANs.WiaItemFlag
  
  @js.native
  sealed trait FolderItemFlag
    extends activexDashWiaLib.WIANs.WiaItemFlag
  
  @js.native
  sealed trait FreeItemFlag
    extends activexDashWiaLib.WIANs.WiaItemFlag
  
  @js.native
  sealed trait GeneratedItemFlag
    extends activexDashWiaLib.WIANs.WiaItemFlag
  
  @js.native
  sealed trait HPanoramaItemFlag
    extends activexDashWiaLib.WIANs.WiaItemFlag
  
  @js.native
  sealed trait HasAttachmentsItemFlag
    extends activexDashWiaLib.WIANs.WiaItemFlag
  
  @js.native
  sealed trait ImageItemFlag
    extends activexDashWiaLib.WIANs.WiaItemFlag
  
  @js.native
  sealed trait RemovedItemFlag
    extends activexDashWiaLib.WIANs.WiaItemFlag
  
  @js.native
  sealed trait RootItemFlag
    extends activexDashWiaLib.WIANs.WiaItemFlag
  
  @js.native
  sealed trait StorageItemFlag
    extends activexDashWiaLib.WIANs.WiaItemFlag
  
  @js.native
  sealed trait TransferItemFlag
    extends activexDashWiaLib.WIANs.WiaItemFlag
  
  @js.native
  sealed trait VPanoramaItemFlag
    extends activexDashWiaLib.WIANs.WiaItemFlag
  
  @js.native
  sealed trait VideoItemFlag
    extends activexDashWiaLib.WIANs.WiaItemFlag
  
  /* 16 */ val AnalyzeItemFlag: AnalyzeItemFlag with scala.Double = js.native
  /* 32 */ val AudioItemFlag: AudioItemFlag with scala.Double = js.native
  /* 2048 */ val BurstItemFlag: BurstItemFlag with scala.Double = js.native
  /* 128 */ val DeletedItemFlag: DeletedItemFlag with scala.Double = js.native
  /* 64 */ val DeviceItemFlag: DeviceItemFlag with scala.Double = js.native
  /* 256 */ val DisconnectedItemFlag: DisconnectedItemFlag with scala.Double = js.native
  /* 2 */ val FileItemFlag: FileItemFlag with scala.Double = js.native
  /* 4 */ val FolderItemFlag: FolderItemFlag with scala.Double = js.native
  /* 0 */ val FreeItemFlag: FreeItemFlag with scala.Double = js.native
  /* 16384 */ val GeneratedItemFlag: GeneratedItemFlag with scala.Double = js.native
  /* 512 */ val HPanoramaItemFlag: HPanoramaItemFlag with scala.Double = js.native
  /* 32768 */ val HasAttachmentsItemFlag: HasAttachmentsItemFlag with scala.Double = js.native
  /* 1 */ val ImageItemFlag: ImageItemFlag with scala.Double = js.native
  /* -2147483648 */ val RemovedItemFlag: RemovedItemFlag with scala.Double = js.native
  /* 8 */ val RootItemFlag: RootItemFlag with scala.Double = js.native
  /* 4096 */ val StorageItemFlag: StorageItemFlag with scala.Double = js.native
  /* 8192 */ val TransferItemFlag: TransferItemFlag with scala.Double = js.native
  /* 1024 */ val VPanoramaItemFlag: VPanoramaItemFlag with scala.Double = js.native
  /* 65536 */ val VideoItemFlag: VideoItemFlag with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWiaLib.WIANs.WiaItemFlag with scala.Double] = js.native
}

