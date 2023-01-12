package typings.awsGreengrassCoreSdk

import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable6
import typings.awsGreengrassCoreSdk.anon.Definition
import typings.awsGreengrassCoreSdk.anon.TypeofMessageStreamInfoEx
import typings.awsGreengrassCoreSdk.anon.TypeofMessageStreamInfoSt
import typings.awsGreengrassCoreSdk.streamManagerDataMod.MessageStreamDefinition
import typings.awsGreengrassCoreSdk.streamManagerDataMod.TypesMap
import typings.awsGreengrassCoreSdk.streamManagerDataMod.ValidationsMap
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object streamManagerDataMessageStreamInfoMod {
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/data/MessageStreamInfo", "MessageStreamInfo")
  @js.native
  /**
    * @param definition
    * @param storageStatus  Stream status including oldest/newest sequence number and total bytes.
    * @param exportStatuses
    */
  open class MessageStreamInfo () extends StObject {
    def this(definition: MessageStreamDefinition) = this()
    def this(definition: Null, storageStatus: MessageStreamInfoStorageStatus) = this()
    def this(definition: Unit, storageStatus: MessageStreamInfoStorageStatus) = this()
    def this(definition: MessageStreamDefinition, storageStatus: MessageStreamInfoStorageStatus) = this()
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
      definition: MessageStreamDefinition,
      storageStatus: Null,
      exportStatuses: js.Array[MessageStreamInfoExportStatuses]
    ) = this()
    def this(
      definition: MessageStreamDefinition,
      storageStatus: Unit,
      exportStatuses: js.Array[MessageStreamInfoExportStatuses]
    ) = this()
    def this(
      definition: MessageStreamDefinition,
      storageStatus: MessageStreamInfoStorageStatus,
      exportStatuses: js.Array[MessageStreamInfoExportStatuses]
    ) = this()
    
    def asMap(): Definition = js.native
    
    def definition: MessageStreamDefinition | Null = js.native
    /**
      * @param value
      */
    def definition_=(value: MessageStreamDefinition | Null): Unit = js.native
    
    def exportStatuses: js.Array[MessageStreamInfoExportStatuses] = js.native
    /**
      * @param value
      */
    def exportStatuses_=(value: js.Array[MessageStreamInfoExportStatuses]): Unit = js.native
    
    /**
      * Stream status including oldest/newest sequence number and total bytes.
      */
    def storageStatus: MessageStreamInfoStorageStatus = js.native
    /**
      * @param value  Stream status including oldest/newest sequence number and total bytes.
      */
    def storageStatus_=(value: MessageStreamInfoStorageStatus): Unit = js.native
    
    /**
      * @param value
      */
    def withDefinition(): this.type = js.native
    def withDefinition(value: MessageStreamDefinition): this.type = js.native
    
    /**
      * @param value
      */
    def withExportStatuses(value: js.Array[MessageStreamInfoExportStatuses]): this.type = js.native
    
    /**
      * @param value Stream status including oldest/newest sequence number and total bytes.
      */
    def withStorageStatus(value: MessageStreamInfoStorageStatus): this.type = js.native
  }
  /* static members */
  object MessageStreamInfo {
    
    @JSImport("aws-greengrass-core-sdk/stream-manager/data/MessageStreamInfo", "MessageStreamInfo")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("aws-greengrass-core-sdk/stream-manager/data/MessageStreamInfo", "MessageStreamInfo._exportStatuses")
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
    @JSImport("aws-greengrass-core-sdk/stream-manager/data/MessageStreamInfo", "MessageStreamInfo._storageStatus")
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
    
    @JSImport("aws-greengrass-core-sdk/stream-manager/data/MessageStreamInfo", "MessageStreamInfo.formatsMap")
    @js.native
    def formatsMap: Record[String, scala.Nothing] = js.native
    inline def formatsMap_=(x: Record[String, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formatsMap")(x.asInstanceOf[js.Any])
    
    inline def fromMap(d: Record[String, Any]): MessageStreamInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMap")(d.asInstanceOf[js.Any]).asInstanceOf[MessageStreamInfo]
    
    @JSImport("aws-greengrass-core-sdk/stream-manager/data/MessageStreamInfo", "MessageStreamInfo.typesMap")
    @js.native
    def typesMap: TypesMap = js.native
    inline def typesMap_=(x: TypesMap): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("typesMap")(x.asInstanceOf[js.Any])
    
    @JSImport("aws-greengrass-core-sdk/stream-manager/data/MessageStreamInfo", "MessageStreamInfo.validationsMap")
    @js.native
    def validationsMap: ValidationsMap = js.native
    inline def validationsMap_=(x: ValidationsMap): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validationsMap")(x.asInstanceOf[js.Any])
  }
  
  /**
    * Export status including the export identifier and the last exported sequence number for that export task.
    */
  @js.native
  trait MessageStreamInfoExportStatuses extends StObject {
    
    def asMap(): MessageStreamInfoExportStatusesMap = js.native
    
    /**
      * Error message from the last export attempt if it failed.
      */
    def errorMessage: String | Null = js.native
    /**
      * @param value Error message from the last export attempt if it failed.
      */
    def errorMessage_=(value: String | Null): Unit = js.native
    
    /**
      * The unique export identifier.
      */
    def exportConfigIdentifier: String | Null = js.native
    /**
      * @param value The unique export identifier.
      */
    def exportConfigIdentifier_=(value: String | Null): Unit = js.native
    
    /**
      * Total bytes exported from the stream for this Export Config. It does not include the failed export attempts or messages which are skipped because of some non-retryable error.
      */
    def exportedBytesFromStream: Double | Null = js.native
    /**
      * @param value Total bytes exported from the stream for this Export Config. It does not include the failed export attempts or messages which are skipped because of some non-retryable error.
      */
    def exportedBytesFromStream_=(value: Double | Null): Unit = js.native
    
    /**
      * Total messages exported/processed.
      */
    def exportedMessagesCount: Double | Null = js.native
    /**
      * @param value Total messages exported/processed.
      */
    def exportedMessagesCount_=(value: Double | Null): Unit = js.native
    
    /**
      * The last time an export was attempted. Data is Unix epoch time in milliseconds.
      */
    def lastExportTime: Double | Null = js.native
    /**
      * @param value The last time an export was attempted. Data is Unix epoch time in milliseconds.
      */
    def lastExportTime_=(value: Double | Null): Unit = js.native
    
    /**
      * The sequence number of the last message which was successfully exported.
      */
    def lastExportedSequenceNumber: Double | Null = js.native
    /**
      * @param value The sequence number of the last message which was successfully exported.
      */
    def lastExportedSequenceNumber_=(value: Double | Null): Unit = js.native
    
    /**
      * @param value Error message from the last export attempt if it failed.
      */
    def withErrorMessage(): this.type = js.native
    def withErrorMessage(value: String): this.type = js.native
    
    /**
      * @param value The unique export identifier.
      */
    def withExportConfigIdentifier(): this.type = js.native
    def withExportConfigIdentifier(value: String): this.type = js.native
    
    /**
      * @param value Total bytes exported from the stream for this Export Config. It does not include the failed export attempts or messages which are skipped because of some non-retryable error.
      */
    def withExportedBytesFromStream(): this.type = js.native
    def withExportedBytesFromStream(value: Double): this.type = js.native
    
    /**
      * @param value Total messages exported/processed.
      */
    def withExportedMessagesCount(): this.type = js.native
    def withExportedMessagesCount(value: Double): this.type = js.native
    
    /**
      * @param value The last time an export was attempted. Data is Unix epoch time in milliseconds.
      */
    def withLastExportTime(): this.type = js.native
    def withLastExportTime(value: Double): this.type = js.native
    
    /**
      * @param value The sequence number of the last message which was successfully exported.
      */
    def withLastExportedSequenceNumber(): this.type = js.native
    def withLastExportedSequenceNumber(value: Double): this.type = js.native
  }
  
  trait MessageStreamInfoExportStatusesMap extends StObject {
    
    var errorMessage: js.UndefOr[String] = js.undefined
    
    var exportConfigIdentifier: js.UndefOr[String] = js.undefined
    
    var exportedBytesFromStream: js.UndefOr[Double] = js.undefined
    
    var exportedMessagesCount: js.UndefOr[Double] = js.undefined
    
    var lastExportTime: js.UndefOr[Double] = js.undefined
    
    var lastExportedSequenceNumber: js.UndefOr[Double] = js.undefined
  }
  object MessageStreamInfoExportStatusesMap {
    
    inline def apply(): MessageStreamInfoExportStatusesMap = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MessageStreamInfoExportStatusesMap]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MessageStreamInfoExportStatusesMap] (val x: Self) extends AnyVal {
      
      inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
      
      inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
      
      inline def setExportConfigIdentifier(value: String): Self = StObject.set(x, "exportConfigIdentifier", value.asInstanceOf[js.Any])
      
      inline def setExportConfigIdentifierUndefined: Self = StObject.set(x, "exportConfigIdentifier", js.undefined)
      
      inline def setExportedBytesFromStream(value: Double): Self = StObject.set(x, "exportedBytesFromStream", value.asInstanceOf[js.Any])
      
      inline def setExportedBytesFromStreamUndefined: Self = StObject.set(x, "exportedBytesFromStream", js.undefined)
      
      inline def setExportedMessagesCount(value: Double): Self = StObject.set(x, "exportedMessagesCount", value.asInstanceOf[js.Any])
      
      inline def setExportedMessagesCountUndefined: Self = StObject.set(x, "exportedMessagesCount", js.undefined)
      
      inline def setLastExportTime(value: Double): Self = StObject.set(x, "lastExportTime", value.asInstanceOf[js.Any])
      
      inline def setLastExportTimeUndefined: Self = StObject.set(x, "lastExportTime", js.undefined)
      
      inline def setLastExportedSequenceNumber(value: Double): Self = StObject.set(x, "lastExportedSequenceNumber", value.asInstanceOf[js.Any])
      
      inline def setLastExportedSequenceNumberUndefined: Self = StObject.set(x, "lastExportedSequenceNumber", js.undefined)
    }
  }
  
  @js.native
  trait MessageStreamInfoStorageStatus extends StObject {
    
    def asMap(): MessageStreamInfoStorageStatusMap = js.native
    
    /**
      * The sequence number of the last appended message.
      */
    def newestSequenceNumber: Double | Null = js.native
    /**
      * @param value The sequence number of the last appended message.
      */
    def newestSequenceNumber_=(value: Double | Null): Unit = js.native
    
    /**
      * The sequence number of the first message which is still accessible in the stream.
      */
    def oldestSequenceNumber: Double | Null = js.native
    /**
      * @param value The sequence number of the first message which is still accessible in the stream.
      */
    def oldestSequenceNumber_=(value: Double | Null): Unit = js.native
    
    /**
      * The current total size of the stream in bytes.
      */
    def totalBytes: Double | Null = js.native
    /**
      * @param value The current total size of the stream in bytes.
      */
    def totalBytes_=(value: Double | Null): Unit = js.native
    
    /**
      * @param value The sequence number of the last appended message.
      */
    def withNewestSequenceNumber(): this.type = js.native
    def withNewestSequenceNumber(value: Double): this.type = js.native
    
    /**
      * @param value The sequence number of the first message which is still accessible in the stream.
      */
    def withOldestSequenceNumber(): this.type = js.native
    def withOldestSequenceNumber(value: Double): this.type = js.native
    
    /**
      * @param value The current total size of the stream in bytes.
      * @returns
      */
    def withTotalBytes(): this.type = js.native
    def withTotalBytes(value: Double): this.type = js.native
  }
  
  trait MessageStreamInfoStorageStatusMap extends StObject {
    
    var newestSequenceNumber: js.UndefOr[Double] = js.undefined
    
    var oldestSequenceNumber: js.UndefOr[Double] = js.undefined
    
    var totalBytes: js.UndefOr[Double] = js.undefined
  }
  object MessageStreamInfoStorageStatusMap {
    
    inline def apply(): MessageStreamInfoStorageStatusMap = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MessageStreamInfoStorageStatusMap]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MessageStreamInfoStorageStatusMap] (val x: Self) extends AnyVal {
      
      inline def setNewestSequenceNumber(value: Double): Self = StObject.set(x, "newestSequenceNumber", value.asInstanceOf[js.Any])
      
      inline def setNewestSequenceNumberUndefined: Self = StObject.set(x, "newestSequenceNumber", js.undefined)
      
      inline def setOldestSequenceNumber(value: Double): Self = StObject.set(x, "oldestSequenceNumber", value.asInstanceOf[js.Any])
      
      inline def setOldestSequenceNumberUndefined: Self = StObject.set(x, "oldestSequenceNumber", js.undefined)
      
      inline def setTotalBytes(value: Double): Self = StObject.set(x, "totalBytes", value.asInstanceOf[js.Any])
      
      inline def setTotalBytesUndefined: Self = StObject.set(x, "totalBytes", js.undefined)
    }
  }
}
