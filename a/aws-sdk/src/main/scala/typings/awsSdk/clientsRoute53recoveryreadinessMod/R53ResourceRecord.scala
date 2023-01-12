package typings.awsSdk.clientsRoute53recoveryreadinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait R53ResourceRecord extends StObject {
  
  /**
    * The DNS target domain name.
    */
  var DomainName: js.UndefOr[string] = js.undefined
  
  /**
    * The Route 53 Resource Record Set ID.
    */
  var RecordSetId: js.UndefOr[string] = js.undefined
}
object R53ResourceRecord {
  
  inline def apply(): R53ResourceRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[R53ResourceRecord]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: R53ResourceRecord] (val x: Self) extends AnyVal {
    
    inline def setDomainName(value: string): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setDomainNameUndefined: Self = StObject.set(x, "DomainName", js.undefined)
    
    inline def setRecordSetId(value: string): Self = StObject.set(x, "RecordSetId", value.asInstanceOf[js.Any])
    
    inline def setRecordSetIdUndefined: Self = StObject.set(x, "RecordSetId", js.undefined)
  }
}
