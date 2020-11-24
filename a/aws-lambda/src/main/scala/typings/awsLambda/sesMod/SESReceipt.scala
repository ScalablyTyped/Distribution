package typings.awsLambda.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SESReceipt extends js.Object {
  
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
  implicit class SESReceiptOps[Self <: SESReceipt] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAction(value: SESReceiptAction): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDkimVerdict(value: SESReceiptStatus): Self = this.set("dkimVerdict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDmarcVerdict(value: SESReceiptStatus): Self = this.set("dmarcVerdict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessingTimeMillis(value: Double): Self = this.set("processingTimeMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientsVarargs(value: String*): Self = this.set("recipients", js.Array(value :_*))
    
    @scala.inline
    def setRecipients(value: js.Array[String]): Self = this.set("recipients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpamVerdict(value: SESReceiptStatus): Self = this.set("spamVerdict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpfVerdict(value: SESReceiptStatus): Self = this.set("spfVerdict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: String): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirusVerdict(value: SESReceiptStatus): Self = this.set("virusVerdict", value.asInstanceOf[js.Any])
  }
}
