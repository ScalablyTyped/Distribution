package typings.awsLambda.sesMod

import typings.awsLambda.awsLambdaStrings.none_
import typings.awsLambda.awsLambdaStrings.quarantine
import typings.awsLambda.awsLambdaStrings.reject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SESReceipt extends StObject {
  
  var action: SESReceiptS3Action | SESReceiptSnsAction | SESReceiptBounceAction | SESReceiptLambdaAction | SESReceiptStopAction | SESReceiptWorkMailAction
  
  var dkimVerdict: SESReceiptStatus
  
  var dmarcPolicy: js.UndefOr[none_ | quarantine | reject] = js.undefined
  
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
    action: SESReceiptS3Action | SESReceiptSnsAction | SESReceiptBounceAction | SESReceiptLambdaAction | SESReceiptStopAction | SESReceiptWorkMailAction,
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
    
    inline def setAction(
      value: SESReceiptS3Action | SESReceiptSnsAction | SESReceiptBounceAction | SESReceiptLambdaAction | SESReceiptStopAction | SESReceiptWorkMailAction
    ): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setDkimVerdict(value: SESReceiptStatus): Self = StObject.set(x, "dkimVerdict", value.asInstanceOf[js.Any])
    
    inline def setDmarcPolicy(value: none_ | quarantine | reject): Self = StObject.set(x, "dmarcPolicy", value.asInstanceOf[js.Any])
    
    inline def setDmarcPolicyUndefined: Self = StObject.set(x, "dmarcPolicy", js.undefined)
    
    inline def setDmarcVerdict(value: SESReceiptStatus): Self = StObject.set(x, "dmarcVerdict", value.asInstanceOf[js.Any])
    
    inline def setProcessingTimeMillis(value: Double): Self = StObject.set(x, "processingTimeMillis", value.asInstanceOf[js.Any])
    
    inline def setRecipients(value: js.Array[String]): Self = StObject.set(x, "recipients", value.asInstanceOf[js.Any])
    
    inline def setRecipientsVarargs(value: String*): Self = StObject.set(x, "recipients", js.Array(value*))
    
    inline def setSpamVerdict(value: SESReceiptStatus): Self = StObject.set(x, "spamVerdict", value.asInstanceOf[js.Any])
    
    inline def setSpfVerdict(value: SESReceiptStatus): Self = StObject.set(x, "spfVerdict", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setVirusVerdict(value: SESReceiptStatus): Self = StObject.set(x, "virusVerdict", value.asInstanceOf[js.Any])
  }
}
