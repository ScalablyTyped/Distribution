package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FindingHistoryUpdateSource extends StObject {
  
  /**
    *  The identity of the source that initiated the finding change event. For example, the Amazon Resource Name (ARN) of a partner that calls BatchImportFindings or of a customer that calls BatchUpdateFindings. 
    */
  var Identity: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  Describes the type of finding change event, such as a call to  BatchImportFindings  (by an integrated Amazon Web Service or third party partner integration) or  BatchUpdateFindings  (by a Security Hub customer). 
    */
  var Type: js.UndefOr[FindingHistoryUpdateSourceType] = js.undefined
}
object FindingHistoryUpdateSource {
  
  inline def apply(): FindingHistoryUpdateSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindingHistoryUpdateSource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FindingHistoryUpdateSource] (val x: Self) extends AnyVal {
    
    inline def setIdentity(value: NonEmptyString): Self = StObject.set(x, "Identity", value.asInstanceOf[js.Any])
    
    inline def setIdentityUndefined: Self = StObject.set(x, "Identity", js.undefined)
    
    inline def setType(value: FindingHistoryUpdateSourceType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
