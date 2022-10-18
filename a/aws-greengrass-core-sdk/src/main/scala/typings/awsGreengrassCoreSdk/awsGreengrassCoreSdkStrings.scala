package typings.awsGreengrassCoreSdk

import typings.awsGreengrassCoreSdk.streamManagerDataMod.ExportFormatValue
import typings.awsGreengrassCoreSdk.streamManagerDataMod.PersistenceValue
import typings.awsGreengrassCoreSdk.streamManagerDataMod.StrategyOnFullValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object awsGreengrassCoreSdkStrings {
  
  @js.native
  sealed trait `0`
    extends StObject
       with PersistenceValue
       with StrategyOnFullValue
  inline def `0`: `0` = "0".asInstanceOf[`0`]
  
  @js.native
  sealed trait `1`
    extends StObject
       with PersistenceValue
       with StrategyOnFullValue
  inline def `1`: `1` = "1".asInstanceOf[`1`]
  
  @js.native
  sealed trait AllOrError extends StObject
  inline def AllOrError: AllOrError = "AllOrError".asInstanceOf[AllOrError]
  
  @js.native
  sealed trait BestEffort extends StObject
  inline def BestEffort: BestEffort = "BestEffort".asInstanceOf[BestEffort]
  
  @js.native
  sealed trait Canceled extends StObject
  inline def Canceled: Canceled = "Canceled".asInstanceOf[Canceled]
  
  @js.native
  sealed trait DEBUG extends StObject
  inline def DEBUG: DEBUG = "DEBUG".asInstanceOf[DEBUG]
  
  @js.native
  sealed trait ERROR extends StObject
  inline def ERROR: ERROR = "ERROR".asInstanceOf[ERROR]
  
  @js.native
  sealed trait Failure extends StObject
  inline def Failure: Failure = "Failure".asInstanceOf[Failure]
  
  @js.native
  sealed trait File extends StObject
  inline def File: File = "File".asInstanceOf[File]
  
  @js.native
  sealed trait INFO extends StObject
  inline def INFO: INFO = "INFO".asInstanceOf[INFO]
  
  @js.native
  sealed trait InProgress extends StObject
  inline def InProgress: InProgress = "InProgress".asInstanceOf[InProgress]
  
  @js.native
  sealed trait JSON_BATCHED
    extends StObject
       with ExportFormatValue
  inline def JSON_BATCHED: JSON_BATCHED = "JSON_BATCHED".asInstanceOf[JSON_BATCHED]
  
  @js.native
  sealed trait Memory extends StObject
  inline def Memory: Memory = "Memory".asInstanceOf[Memory]
  
  @js.native
  sealed trait OverwriteOldestData extends StObject
  inline def OverwriteOldestData: OverwriteOldestData = "OverwriteOldestData".asInstanceOf[OverwriteOldestData]
  
  @js.native
  sealed trait RAW_NOT_BATCHED
    extends StObject
       with ExportFormatValue
  inline def RAW_NOT_BATCHED: RAW_NOT_BATCHED = "RAW_NOT_BATCHED".asInstanceOf[RAW_NOT_BATCHED]
  
  @js.native
  sealed trait RejectNewData extends StObject
  inline def RejectNewData: RejectNewData = "RejectNewData".asInstanceOf[RejectNewData]
  
  @js.native
  sealed trait S3Task extends StObject
  inline def S3Task: S3Task = "S3Task".asInstanceOf[S3Task]
  
  @js.native
  sealed trait Success extends StObject
  inline def Success: Success = "Success".asInstanceOf[Success]
  
  @js.native
  sealed trait TRACE extends StObject
  inline def TRACE: TRACE = "TRACE".asInstanceOf[TRACE]
  
  @js.native
  sealed trait WARN extends StObject
  inline def WARN: WARN = "WARN".asInstanceOf[WARN]
  
  @js.native
  sealed trait Warning extends StObject
  inline def Warning: Warning = "Warning".asInstanceOf[Warning]
}
