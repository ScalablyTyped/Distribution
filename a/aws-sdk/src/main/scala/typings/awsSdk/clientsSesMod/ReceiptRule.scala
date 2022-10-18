package typings.awsSdk.clientsSesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReceiptRule extends StObject {
  
  /**
    * An ordered list of actions to perform on messages that match at least one of the recipient email addresses or domains specified in the receipt rule.
    */
  var Actions: js.UndefOr[ReceiptActionsList] = js.undefined
  
  /**
    * If true, the receipt rule is active. The default value is false.
    */
  var Enabled: js.UndefOr[typings.awsSdk.clientsSesMod.Enabled] = js.undefined
  
  /**
    * The name of the receipt rule. The name must:   This value can only contain ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-).   Start and end with a letter or number.   Contain less than 64 characters.  
    */
  var Name: ReceiptRuleName
  
  /**
    * The recipient domains and email addresses that the receipt rule applies to. If this field is not specified, this rule will match all recipients under all verified domains.
    */
  var Recipients: js.UndefOr[RecipientsList] = js.undefined
  
  /**
    * If true, then messages that this receipt rule applies to are scanned for spam and viruses. The default value is false.
    */
  var ScanEnabled: js.UndefOr[Enabled] = js.undefined
  
  /**
    * Specifies whether Amazon SES should require that incoming email is delivered over a connection encrypted with Transport Layer Security (TLS). If this parameter is set to Require, Amazon SES will bounce emails that are not received over TLS. The default is Optional.
    */
  var TlsPolicy: js.UndefOr[typings.awsSdk.clientsSesMod.TlsPolicy] = js.undefined
}
object ReceiptRule {
  
  inline def apply(Name: ReceiptRuleName): ReceiptRule = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReceiptRule]
  }
  
  extension [Self <: ReceiptRule](x: Self) {
    
    inline def setActions(value: ReceiptActionsList): Self = StObject.set(x, "Actions", value.asInstanceOf[js.Any])
    
    inline def setActionsUndefined: Self = StObject.set(x, "Actions", js.undefined)
    
    inline def setActionsVarargs(value: ReceiptAction*): Self = StObject.set(x, "Actions", js.Array(value*))
    
    inline def setEnabled(value: Enabled): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
    
    inline def setName(value: ReceiptRuleName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setRecipients(value: RecipientsList): Self = StObject.set(x, "Recipients", value.asInstanceOf[js.Any])
    
    inline def setRecipientsUndefined: Self = StObject.set(x, "Recipients", js.undefined)
    
    inline def setRecipientsVarargs(value: Recipient*): Self = StObject.set(x, "Recipients", js.Array(value*))
    
    inline def setScanEnabled(value: Enabled): Self = StObject.set(x, "ScanEnabled", value.asInstanceOf[js.Any])
    
    inline def setScanEnabledUndefined: Self = StObject.set(x, "ScanEnabled", js.undefined)
    
    inline def setTlsPolicy(value: TlsPolicy): Self = StObject.set(x, "TlsPolicy", value.asInstanceOf[js.Any])
    
    inline def setTlsPolicyUndefined: Self = StObject.set(x, "TlsPolicy", js.undefined)
  }
}
