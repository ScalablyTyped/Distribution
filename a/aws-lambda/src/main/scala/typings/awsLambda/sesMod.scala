package typings.awsLambda

import typings.awsLambda.handlerMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sesMod {
  
  trait SESEvent extends StObject {
    
    var Records: js.Array[SESEventRecord]
  }
  object SESEvent {
    
    inline def apply(Records: js.Array[SESEventRecord]): SESEvent = {
      val __obj = js.Dynamic.literal(Records = Records.asInstanceOf[js.Any])
      __obj.asInstanceOf[SESEvent]
    }
    
    extension [Self <: SESEvent](x: Self) {
      
      inline def setRecords(value: js.Array[SESEventRecord]): Self = StObject.set(x, "Records", value.asInstanceOf[js.Any])
      
      inline def setRecordsVarargs(value: SESEventRecord*): Self = StObject.set(x, "Records", js.Array(value :_*))
    }
  }
  
  trait SESEventRecord extends StObject {
    
    var eventSource: String
    
    var eventVersion: String
    
    var ses: SESMessage
  }
  object SESEventRecord {
    
    inline def apply(eventSource: String, eventVersion: String, ses: SESMessage): SESEventRecord = {
      val __obj = js.Dynamic.literal(eventSource = eventSource.asInstanceOf[js.Any], eventVersion = eventVersion.asInstanceOf[js.Any], ses = ses.asInstanceOf[js.Any])
      __obj.asInstanceOf[SESEventRecord]
    }
    
    extension [Self <: SESEventRecord](x: Self) {
      
      inline def setEventSource(value: String): Self = StObject.set(x, "eventSource", value.asInstanceOf[js.Any])
      
      inline def setEventVersion(value: String): Self = StObject.set(x, "eventVersion", value.asInstanceOf[js.Any])
      
      inline def setSes(value: SESMessage): Self = StObject.set(x, "ses", value.asInstanceOf[js.Any])
    }
  }
  
  type SESHandler = Handler[SESEvent, Unit]
  
  trait SESMail extends StObject {
    
    var commonHeaders: SESMailCommonHeaders
    
    var destination: js.Array[String]
    
    var headers: js.Array[SESMailHeader]
    
    var headersTruncated: Boolean
    
    var messageId: String
    
    var source: String
    
    var timestamp: String
  }
  object SESMail {
    
    inline def apply(
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
    
    extension [Self <: SESMail](x: Self) {
      
      inline def setCommonHeaders(value: SESMailCommonHeaders): Self = StObject.set(x, "commonHeaders", value.asInstanceOf[js.Any])
      
      inline def setDestination(value: js.Array[String]): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
      
      inline def setDestinationVarargs(value: String*): Self = StObject.set(x, "destination", js.Array(value :_*))
      
      inline def setHeaders(value: js.Array[SESMailHeader]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersTruncated(value: Boolean): Self = StObject.set(x, "headersTruncated", value.asInstanceOf[js.Any])
      
      inline def setHeadersVarargs(value: SESMailHeader*): Self = StObject.set(x, "headers", js.Array(value :_*))
      
      inline def setMessageId(value: String): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
  
  trait SESMailCommonHeaders extends StObject {
    
    var date: String
    
    var from: js.Array[String]
    
    var messageId: String
    
    var returnPath: String
    
    var subject: String
    
    var to: js.Array[String]
  }
  object SESMailCommonHeaders {
    
    inline def apply(
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
    
    extension [Self <: SESMailCommonHeaders](x: Self) {
      
      inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setFrom(value: js.Array[String]): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromVarargs(value: String*): Self = StObject.set(x, "from", js.Array(value :_*))
      
      inline def setMessageId(value: String): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
      
      inline def setReturnPath(value: String): Self = StObject.set(x, "returnPath", value.asInstanceOf[js.Any])
      
      inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
      
      inline def setTo(value: js.Array[String]): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToVarargs(value: String*): Self = StObject.set(x, "to", js.Array(value :_*))
    }
  }
  
  trait SESMailHeader extends StObject {
    
    var name: String
    
    var value: String
  }
  object SESMailHeader {
    
    inline def apply(name: String, value: String): SESMailHeader = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[SESMailHeader]
    }
    
    extension [Self <: SESMailHeader](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait SESMessage extends StObject {
    
    var mail: SESMail
    
    var receipt: SESReceipt
  }
  object SESMessage {
    
    inline def apply(mail: SESMail, receipt: SESReceipt): SESMessage = {
      val __obj = js.Dynamic.literal(mail = mail.asInstanceOf[js.Any], receipt = receipt.asInstanceOf[js.Any])
      __obj.asInstanceOf[SESMessage]
    }
    
    extension [Self <: SESMessage](x: Self) {
      
      inline def setMail(value: SESMail): Self = StObject.set(x, "mail", value.asInstanceOf[js.Any])
      
      inline def setReceipt(value: SESReceipt): Self = StObject.set(x, "receipt", value.asInstanceOf[js.Any])
    }
  }
  
  trait SESReceipt extends StObject {
    
    var action: SESReceiptAction
    
    var dkimVerdict: SESReceiptStatus
    
    var dmarcVerdict: SESReceiptStatus
    
    var processingTimeMillis: Double
    
    var recipients: js.Array[String]
    
    var spamVerdict: SESReceiptStatus
    
    var spfVerdict: SESReceiptStatus
    
    var timestamp: String
    
    var virusVerdict: SESReceiptStatus
  }
  object SESReceipt {
    
    inline def apply(
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
    
    extension [Self <: SESReceipt](x: Self) {
      
      inline def setAction(value: SESReceiptAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setDkimVerdict(value: SESReceiptStatus): Self = StObject.set(x, "dkimVerdict", value.asInstanceOf[js.Any])
      
      inline def setDmarcVerdict(value: SESReceiptStatus): Self = StObject.set(x, "dmarcVerdict", value.asInstanceOf[js.Any])
      
      inline def setProcessingTimeMillis(value: Double): Self = StObject.set(x, "processingTimeMillis", value.asInstanceOf[js.Any])
      
      inline def setRecipients(value: js.Array[String]): Self = StObject.set(x, "recipients", value.asInstanceOf[js.Any])
      
      inline def setRecipientsVarargs(value: String*): Self = StObject.set(x, "recipients", js.Array(value :_*))
      
      inline def setSpamVerdict(value: SESReceiptStatus): Self = StObject.set(x, "spamVerdict", value.asInstanceOf[js.Any])
      
      inline def setSpfVerdict(value: SESReceiptStatus): Self = StObject.set(x, "spfVerdict", value.asInstanceOf[js.Any])
      
      inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setVirusVerdict(value: SESReceiptStatus): Self = StObject.set(x, "virusVerdict", value.asInstanceOf[js.Any])
    }
  }
  
  trait SESReceiptAction extends StObject {
    
    var functionArn: String
    
    var invocationType: String
    
    var `type`: String
  }
  object SESReceiptAction {
    
    inline def apply(functionArn: String, invocationType: String, `type`: String): SESReceiptAction = {
      val __obj = js.Dynamic.literal(functionArn = functionArn.asInstanceOf[js.Any], invocationType = invocationType.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SESReceiptAction]
    }
    
    extension [Self <: SESReceiptAction](x: Self) {
      
      inline def setFunctionArn(value: String): Self = StObject.set(x, "functionArn", value.asInstanceOf[js.Any])
      
      inline def setInvocationType(value: String): Self = StObject.set(x, "invocationType", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait SESReceiptStatus extends StObject {
    
    var status: String
  }
  object SESReceiptStatus {
    
    inline def apply(status: String): SESReceiptStatus = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[SESReceiptStatus]
    }
    
    extension [Self <: SESReceiptStatus](x: Self) {
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
}
