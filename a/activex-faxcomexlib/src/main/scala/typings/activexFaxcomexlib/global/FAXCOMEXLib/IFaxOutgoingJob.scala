package typings.activexFaxcomexlib.global.FAXCOMEXLib

import typings.activexFaxcomexlib.FAXCOMEXLib.FAX_JOB_EXTENDED_STATUS_ENUM
import typings.activexFaxcomexlib.FAXCOMEXLib.FAX_JOB_OPERATIONS_ENUM
import typings.activexFaxcomexlib.FAXCOMEXLib.FAX_JOB_STATUS_ENUM
import typings.activexFaxcomexlib.FAXCOMEXLib.FAX_PRIORITY_TYPE_ENUM
import typings.activexFaxcomexlib.FAXCOMEXLib.FAX_RECEIPT_TYPE_ENUM
import typings.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** IFaxOutgoingJob interface */
@JSGlobal("FAXCOMEXLib.IFaxOutgoingJob")
@js.native
class IFaxOutgoingJob protected ()
  extends StObject
     with typings.activexFaxcomexlib.FAXCOMEXLib.IFaxOutgoingJob {
  
  /** Available operations, a bit-wise combination of FAX_JOB_OPERATIONS values */
  /* CompleteClass */
  override val AvailableOperations: FAX_JOB_OPERATIONS_ENUM = js.native
  
  /** Called Station ID */
  /* CompleteClass */
  override val CSID: String = js.native
  
  /** Cancel the outbound job */
  /* CompleteClass */
  override def Cancel(): Unit = js.native
  
  /** Copy the job's TIFF image */
  /* CompleteClass */
  override def CopyTiff(bstrTiffPath: String): Unit = js.native
  
  /** Page currently in transmision */
  /* CompleteClass */
  override val CurrentPage: Double = js.native
  
  /** Device ID that transmits the job */
  /* CompleteClass */
  override val DeviceId: Double = js.native
  
  /** Document's friendly name */
  /* CompleteClass */
  override val DocumentName: String = js.native
  
  /** Extended status description */
  /* CompleteClass */
  override val ExtendedStatus: String = js.native
  
  /** Code of the job's extended status */
  /* CompleteClass */
  override val ExtendedStatusCode: FAX_JOB_EXTENDED_STATUS_ENUM = js.native
  
  /* CompleteClass */
  @JSName("FAXCOMEXLib.IFaxOutgoingJob_typekey")
  var FAXCOMEXLibDotIFaxOutgoingJob_typekey: typings.activexFaxcomexlib.FAXCOMEXLib.IFaxOutgoingJob = js.native
  
  /** Whether to group broadcast receipts */
  /* CompleteClass */
  override val GroupBroadcastReceipts: Boolean = js.native
  
  /** Unique job ID */
  /* CompleteClass */
  override val Id: String = js.native
  
  /** Time the job was originally scheduled to be transmitted */
  /* CompleteClass */
  override val OriginalScheduledTime: VarDate = js.native
  
  /** Total number of pages */
  /* CompleteClass */
  override val Pages: Double = js.native
  
  /** Pause the outbound job */
  /* CompleteClass */
  override def Pause(): Unit = js.native
  
  /** Priority of the fax */
  /* CompleteClass */
  override val Priority: FAX_PRIORITY_TYPE_ENUM = js.native
  
  /** Type of receipt */
  /* CompleteClass */
  override val ReceiptType: FAX_RECEIPT_TYPE_ENUM = js.native
  
  /** Recipient information object */
  /* CompleteClass */
  override val Recipient: typings.activexFaxcomexlib.FAXCOMEXLib.FaxRecipient = js.native
  
  /** Refresh the object */
  /* CompleteClass */
  override def Refresh(): Unit = js.native
  
  /** Restart the outbound job */
  /* CompleteClass */
  override def Restart(): Unit = js.native
  
  /** Resume the outbound job */
  /* CompleteClass */
  override def Resume(): Unit = js.native
  
  /** Number of failed transmission retries */
  /* CompleteClass */
  override val Retries: Double = js.native
  
  /** The time the fax job is scheduled to be transmitted */
  /* CompleteClass */
  override val ScheduledTime: VarDate = js.native
  
  /** Sender information object */
  /* CompleteClass */
  override val Sender: typings.activexFaxcomexlib.FAXCOMEXLib.FaxSender = js.native
  
  /** Size in bytes of TIFF file */
  /* CompleteClass */
  override val Size: Double = js.native
  
  /** Current queue status of the job */
  /* CompleteClass */
  override val Status: FAX_JOB_STATUS_ENUM = js.native
  
  /** Cover page's subject field */
  /* CompleteClass */
  override val Subject: String = js.native
  
  /** Unique ID the submission process created for the Job */
  /* CompleteClass */
  override val SubmissionId: String = js.native
  
  /** Time the job was submitted */
  /* CompleteClass */
  override val SubmissionTime: VarDate = js.native
  
  /** Transmitting Station ID */
  /* CompleteClass */
  override val TSID: String = js.native
  
  /** The time the fax job finished its transmission */
  /* CompleteClass */
  override val TransmissionEnd: VarDate = js.native
  
  /** The time the fax job started its transmission */
  /* CompleteClass */
  override val TransmissionStart: VarDate = js.native
}
