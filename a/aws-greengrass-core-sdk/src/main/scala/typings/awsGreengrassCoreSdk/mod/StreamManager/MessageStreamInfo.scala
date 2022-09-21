package typings.awsGreengrassCoreSdk.mod.StreamManager

import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable6
import typings.awsGreengrassCoreSdk.anon.TypeofMessageStreamInfoEx
import typings.awsGreengrassCoreSdk.anon.TypeofMessageStreamInfoSt
import typings.awsGreengrassCoreSdk.dataMod.TypesMap
import typings.awsGreengrassCoreSdk.dataMod.ValidationsMap
import typings.awsGreengrassCoreSdk.messageStreamInfoMod.MessageStreamInfoExportStatuses
import typings.awsGreengrassCoreSdk.messageStreamInfoMod.MessageStreamInfoStorageStatus
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-greengrass-core-sdk", "StreamManager.MessageStreamInfo")
@js.native
/**
  * @param definition
  * @param storageStatus  Stream status including oldest/newest sequence number and total bytes.
  * @param exportStatuses
  */
open class MessageStreamInfo ()
  extends typings.awsGreengrassCoreSdk.streamManagerMod.MessageStreamInfo {
  def this(definition: typings.awsGreengrassCoreSdk.dataMod.MessageStreamDefinition) = this()
  def this(definition: Null, storageStatus: MessageStreamInfoStorageStatus) = this()
  def this(definition: Unit, storageStatus: MessageStreamInfoStorageStatus) = this()
  def this(
    definition: typings.awsGreengrassCoreSdk.dataMod.MessageStreamDefinition,
    storageStatus: MessageStreamInfoStorageStatus
  ) = this()
  def this(definition: Null, storageStatus: Null, exportStatuses: js.Array[MessageStreamInfoExportStatuses]) = this()
  def this(definition: Null, storageStatus: Unit, exportStatuses: js.Array[MessageStreamInfoExportStatuses]) = this()
  def this(
    definition: Null,
    storageStatus: MessageStreamInfoStorageStatus,
    exportStatuses: js.Array[MessageStreamInfoExportStatuses]
  ) = this()
  def this(definition: Unit, storageStatus: Null, exportStatuses: js.Array[MessageStreamInfoExportStatuses]) = this()
  def this(definition: Unit, storageStatus: Unit, exportStatuses: js.Array[MessageStreamInfoExportStatuses]) = this()
  def this(
    definition: Unit,
    storageStatus: MessageStreamInfoStorageStatus,
    exportStatuses: js.Array[MessageStreamInfoExportStatuses]
  ) = this()
  def this(
    definition: typings.awsGreengrassCoreSdk.dataMod.MessageStreamDefinition,
    storageStatus: Null,
    exportStatuses: js.Array[MessageStreamInfoExportStatuses]
  ) = this()
  def this(
    definition: typings.awsGreengrassCoreSdk.dataMod.MessageStreamDefinition,
    storageStatus: Unit,
    exportStatuses: js.Array[MessageStreamInfoExportStatuses]
  ) = this()
  def this(
    definition: typings.awsGreengrassCoreSdk.dataMod.MessageStreamDefinition,
    storageStatus: MessageStreamInfoStorageStatus,
    exportStatuses: js.Array[MessageStreamInfoExportStatuses]
  ) = this()
}
/* static members */
object MessageStreamInfo {
  
  @JSImport("aws-greengrass-core-sdk", "StreamManager.MessageStreamInfo")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("aws-greengrass-core-sdk", "StreamManager.MessageStreamInfo._exportStatuses")
  @js.native
  def _exportStatuses: TypeofMessageStreamInfoEx & (Instantiable6[
    /* exportConfigIdentifier */ js.UndefOr[String | Null], 
    /* lastExportedSequenceNumber */ js.UndefOr[Double | Null], 
    /* lastExportTime */ js.UndefOr[Double | Null], 
    /* errorMessage */ js.UndefOr[String | Null], 
    /* exportedBytesFromStream */ js.UndefOr[Double | Null], 
    /* exportedMessagesCount */ js.UndefOr[Double | Null], 
    MessageStreamInfoExportStatuses
  ]) = js.native
  inline def _exportStatuses_=(
    x: TypeofMessageStreamInfoEx & (Instantiable6[
      /* exportConfigIdentifier */ js.UndefOr[String | Null], 
      /* lastExportedSequenceNumber */ js.UndefOr[Double | Null], 
      /* lastExportTime */ js.UndefOr[Double | Null], 
      /* errorMessage */ js.UndefOr[String | Null], 
      /* exportedBytesFromStream */ js.UndefOr[Double | Null], 
      /* exportedMessagesCount */ js.UndefOr[Double | Null], 
      MessageStreamInfoExportStatuses
    ])
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_exportStatuses")(x.asInstanceOf[js.Any])
  
  /**
    * Stream status including oldest/newest sequence number and total bytes.
    */
  @JSImport("aws-greengrass-core-sdk", "StreamManager.MessageStreamInfo._storageStatus")
  @js.native
  def _storageStatus: TypeofMessageStreamInfoSt & (Instantiable3[
    /* oldestSequenceNumber */ js.UndefOr[Double | Null], 
    /* newestSequenceNumber */ js.UndefOr[Double | Null], 
    /* totalBytes */ js.UndefOr[Double | Null], 
    MessageStreamInfoStorageStatus
  ]) = js.native
  inline def _storageStatus_=(
    x: TypeofMessageStreamInfoSt & (Instantiable3[
      /* oldestSequenceNumber */ js.UndefOr[Double | Null], 
      /* newestSequenceNumber */ js.UndefOr[Double | Null], 
      /* totalBytes */ js.UndefOr[Double | Null], 
      MessageStreamInfoStorageStatus
    ])
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_storageStatus")(x.asInstanceOf[js.Any])
  
  @JSImport("aws-greengrass-core-sdk", "StreamManager.MessageStreamInfo.formatsMap")
  @js.native
  def formatsMap: Record[String, scala.Nothing] = js.native
  inline def formatsMap_=(x: Record[String, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formatsMap")(x.asInstanceOf[js.Any])
  
  inline def fromMap(d: Record[String, Any]): typings.awsGreengrassCoreSdk.messageStreamInfoMod.MessageStreamInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMap")(d.asInstanceOf[js.Any]).asInstanceOf[typings.awsGreengrassCoreSdk.messageStreamInfoMod.MessageStreamInfo]
  
  @JSImport("aws-greengrass-core-sdk", "StreamManager.MessageStreamInfo.typesMap")
  @js.native
  def typesMap: TypesMap = js.native
  inline def typesMap_=(x: TypesMap): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("typesMap")(x.asInstanceOf[js.Any])
  
  @JSImport("aws-greengrass-core-sdk", "StreamManager.MessageStreamInfo.validationsMap")
  @js.native
  def validationsMap: ValidationsMap = js.native
  inline def validationsMap_=(x: ValidationsMap): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validationsMap")(x.asInstanceOf[js.Any])
}
