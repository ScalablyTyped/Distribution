package typings.awsLambda

import typings.awsLambda.handlerMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sesMod {
  
  @js.native
  trait SESEvent extends StObject {
    
    var Records: js.Array[SESEventRecord] = js.native
  }
  object SESEvent {
    
    @scala.inline
    def apply(Records: js.Array[SESEventRecord]): SESEvent = {
      val __obj = js.Dynamic.literal(Records = Records.asInstanceOf[js.Any])
      __obj.asInstanceOf[SESEvent]
    }
    
    @scala.inline
    implicit class SESEventMutableBuilder[Self <: SESEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRecords(value: js.Array[SESEventRecord]): Self = StObject.set(x, "Records", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecordsVarargs(value: SESEventRecord*): Self = StObject.set(x, "Records", js.Array(value :_*))
    }
  }
  
  @js.native
  trait SESEventRecord extends StObject {
    
    var eventSource: String = js.native
    
    var eventVersion: String = js.native
    
    var ses: SESMessage = js.native
  }
  object SESEventRecord {
    
    @scala.inline
    def apply(eventSource: String, eventVersion: String, ses: SESMessage): SESEventRecord = {
      val __obj = js.Dynamic.literal(eventSource = eventSource.asInstanceOf[js.Any], eventVersion = eventVersion.asInstanceOf[js.Any], ses = ses.asInstanceOf[js.Any])
      __obj.asInstanceOf[SESEventRecord]
    }
    
    @scala.inline
    implicit class SESEventRecordMutableBuilder[Self <: SESEventRecord] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEventSource(value: String): Self = StObject.set(x, "eventSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventVersion(value: String): Self = StObject.set(x, "eventVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSes(value: SESMessage): Self = StObject.set(x, "ses", value.asInstanceOf[js.Any])
    }
  }
  
  type SESHandler = Handler[SESEvent, Unit]
  
  @js.native
  trait SESMail extends StObject {
    
    var commonHeaders: SESMailCommonHeaders = js.native
    
    var destination: js.Array[String] = js.native
    
    var headers: js.Array[SESMailHeader] = js.native
    
    var headersTruncated: Boolean = js.native
    
    var messageId: String = js.native
    
    var source: String = js.native
    
    var timestamp: String = js.native
  }
  object SESMail {
    
    @scala.inline
    def apply(
      commonHeaders: SESMailCommonHeaders,
      destination: js.Array[String],
      headers: js.Array[SESMailHeader],
      headersTruncated: Boolean,
      messageId: String,
      source: String,
      timestamp: String
    ): SESMail = {
      val __obj = js.Dynamic.literal(commonHeaders = commonHeaders.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], headersTruncated = headersTruncated.asInstanceOf[js.Any], messageId = messageId.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[SESMail]
    }
    
    @scala.inline
    implicit class SESMailMutableBuilder[Self <: SESMail] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCommonHeaders(value: SESMailCommonHeaders): Self = StObject.set(x, "commonHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestination(value: js.Array[String]): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestinationVarargs(value: String*): Self = StObject.set(x, "destination", js.Array(value :_*))
      
      @scala.inline
      def setHeaders(value: js.Array[SESMailHeader]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersTruncated(value: Boolean): Self = StObject.set(x, "headersTruncated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersVarargs(value: SESMailHeader*): Self = StObject.set(x, "headers", js.Array(value :_*))
      
      @scala.inline
      def setMessageId(value: String): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SESMailCommonHeaders extends StObject {
    
    var date: String = js.native
    
    var from: js.Array[String] = js.native
    
    var messageId: String = js.native
    
    var returnPath: String = js.native
    
    var subject: String = js.native
    
    var to: js.Array[String] = js.native
  }
  object SESMailCommonHeaders {
    
    @scala.inline
    def apply(
      date: String,
      from: js.Array[String],
      messageId: String,
      returnPath: String,
      subject: String,
      to: js.Array[String]
    ): SESMailCommonHeaders = {
      val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], messageId = messageId.asInstanceOf[js.Any], returnPath = returnPath.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[SESMailCommonHeaders]
    }
    
    @scala.inline
    implicit class SESMailCommonHeadersMutableBuilder[Self <: SESMailCommonHeaders] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrom(value: js.Array[String]): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromVarargs(value: String*): Self = StObject.set(x, "from", js.Array(value :_*))
      
      @scala.inline
      def setMessageId(value: String): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturnPath(value: String): Self = StObject.set(x, "returnPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTo(value: js.Array[String]): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToVarargs(value: String*): Self = StObject.set(x, "to", js.Array(value :_*))
    }
  }
  
  @js.native
  trait SESMailHeader extends StObject {
    
    var name: String = js.native
    
    var value: String = js.native
  }
  object SESMailHeader {
    
    @scala.inline
    def apply(name: String, value: String): SESMailHeader = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[SESMailHeader]
    }
    
    @scala.inline
    implicit class SESMailHeaderMutableBuilder[Self <: SESMailHeader] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SESMessage extends StObject {
    
    var mail: SESMail = js.native
    
    var receipt: SESReceipt = js.native
  }
  object SESMessage {
    
    @scala.inline
    def apply(mail: SESMail, receipt: SESReceipt): SESMessage = {
      val __obj = js.Dynamic.literal(mail = mail.asInstanceOf[js.Any], receipt = receipt.asInstanceOf[js.Any])
      __obj.asInstanceOf[SESMessage]
    }
    
    @scala.inline
    implicit class SESMessageMutableBuilder[Self <: SESMessage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMail(value: SESMail): Self = StObject.set(x, "mail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReceipt(value: SESReceipt): Self = StObject.set(x, "receipt", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SESReceipt extends StObject {
    
    var action: SESReceiptAction = js.native
    
    var dkimVerdict: SESReceiptStatus = js.native
    
    var dmarcVerdict: SESReceiptStatus = js.native
    
    var processingTimeMillis: Double = js.native
    
    var recipients: js.Array[String] = js.native
    
    var spamVerdict: SESReceiptStatus = js.native
    
    var spfVerdict: SESReceiptStatus = js.native
    
    var timestamp: String = js.native
    
    var virusVerdict: SESReceiptStatus = js.native
  }
  object SESReceipt {
    
    @scala.inline
    def apply(
      action: SESReceiptAction,
      dkimVerdict: SESReceiptStatus,
      dmarcVerdict: SESReceiptStatus,
      processingTimeMillis: Double,
      recipients: js.Array[String],
      spamVerdict: SESReceiptStatus,
      spfVerdict: SESReceiptStatus,
      timestamp: String,
      virusVerdict: SESReceiptStatus
    ): SESReceipt = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], dkimVerdict = dkimVerdict.asInstanceOf[js.Any], dmarcVerdict = dmarcVerdict.asInstanceOf[js.Any], processingTimeMillis = processingTimeMillis.asInstanceOf[js.Any], recipients = recipients.asInstanceOf[js.Any], spamVerdict = spamVerdict.asInstanceOf[js.Any], spfVerdict = spfVerdict.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], virusVerdict = virusVerdict.asInstanceOf[js.Any])
      __obj.asInstanceOf[SESReceipt]
    }
    
    @scala.inline
    implicit class SESReceiptMutableBuilder[Self <: SESReceipt] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: SESReceiptAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDkimVerdict(value: SESReceiptStatus): Self = StObject.set(x, "dkimVerdict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDmarcVerdict(value: SESReceiptStatus): Self = StObject.set(x, "dmarcVerdict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProcessingTimeMillis(value: Double): Self = StObject.set(x, "processingTimeMillis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecipients(value: js.Array[String]): Self = StObject.set(x, "recipients", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecipientsVarargs(value: String*): Self = StObject.set(x, "recipients", js.Array(value :_*))
      
      @scala.inline
      def setSpamVerdict(value: SESReceiptStatus): Self = StObject.set(x, "spamVerdict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpfVerdict(value: SESReceiptStatus): Self = StObject.set(x, "spfVerdict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVirusVerdict(value: SESReceiptStatus): Self = StObject.set(x, "virusVerdict", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SESReceiptAction extends StObject {
    
    var functionArn: String = js.native
    
    var invocationType: String = js.native
    
    var `type`: String = js.native
  }
  object SESReceiptAction {
    
    @scala.inline
    def apply(functionArn: String, invocationType: String, `type`: String): SESReceiptAction = {
      val __obj = js.Dynamic.literal(functionArn = functionArn.asInstanceOf[js.Any], invocationType = invocationType.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SESReceiptAction]
    }
    
    @scala.inline
    implicit class SESReceiptActionMutableBuilder[Self <: SESReceiptAction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFunctionArn(value: String): Self = StObject.set(x, "functionArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvocationType(value: String): Self = StObject.set(x, "invocationType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SESReceiptStatus extends StObject {
    
    var status: String = js.native
  }
  object SESReceiptStatus {
    
    @scala.inline
    def apply(status: String): SESReceiptStatus = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[SESReceiptStatus]
    }
    
    @scala.inline
    implicit class SESReceiptStatusMutableBuilder[Self <: SESReceiptStatus] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
}
