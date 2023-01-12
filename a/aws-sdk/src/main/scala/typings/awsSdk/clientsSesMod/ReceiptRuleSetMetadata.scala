package typings.awsSdk.clientsSesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReceiptRuleSetMetadata extends StObject {
  
  /**
    * The date and time the receipt rule set was created.
    */
  var CreatedTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the receipt rule set. The name must:   This value can only contain ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-).   Start and end with a letter or number.   Contain less than 64 characters.  
    */
  var Name: js.UndefOr[ReceiptRuleSetName] = js.undefined
}
object ReceiptRuleSetMetadata {
  
  inline def apply(): ReceiptRuleSetMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReceiptRuleSetMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReceiptRuleSetMetadata] (val x: Self) extends AnyVal {
    
    inline def setCreatedTimestamp(value: js.Date): Self = StObject.set(x, "CreatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimestampUndefined: Self = StObject.set(x, "CreatedTimestamp", js.undefined)
    
    inline def setName(value: ReceiptRuleSetName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
