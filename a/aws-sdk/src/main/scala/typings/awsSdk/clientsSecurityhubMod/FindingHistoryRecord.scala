package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FindingHistoryRecord extends StObject {
  
  /**
    *  Identifies whether the event marks the creation of a new finding. A value of True means that the finding is newly created. A value of False means that the finding isn’t newly created. 
    */
  var FindingCreated: js.UndefOr[Boolean] = js.undefined
  
  var FindingIdentifier: js.UndefOr[AwsSecurityFindingIdentifier] = js.undefined
  
  /**
    *  A token for pagination purposes. Provide this token in the subsequent request to  GetFindingsHistory  to get up to an additional 100 results of history for the same finding that you specified in your initial request. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSecurityhubMod.NextToken] = js.undefined
  
  /**
    *  Identifies the source of the event that changed the finding. For example, an integrated Amazon Web Service or third-party partner integration may call  BatchImportFindings , or an Security Hub customer may call  BatchUpdateFindings . 
    */
  var UpdateSource: js.UndefOr[FindingHistoryUpdateSource] = js.undefined
  
  /**
    *  An ISO 8601-formatted timestamp that indicates when the security findings provider last updated the finding record. A correctly formatted example is 2020-05-21T20:16:34.724Z. The value cannot contain spaces, and date and time should be separated by T. For more information, see RFC 3339 section 5.6, Internet Date/Time Format. 
    */
  var UpdateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  An array of objects that provides details about the finding change event, including the Amazon Web Services Security Finding Format (ASFF) field that changed, the value of the field before the change, and the value of the field after the change. 
    */
  var Updates: js.UndefOr[FindingHistoryUpdatesList] = js.undefined
}
object FindingHistoryRecord {
  
  inline def apply(): FindingHistoryRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindingHistoryRecord]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FindingHistoryRecord] (val x: Self) extends AnyVal {
    
    inline def setFindingCreated(value: Boolean): Self = StObject.set(x, "FindingCreated", value.asInstanceOf[js.Any])
    
    inline def setFindingCreatedUndefined: Self = StObject.set(x, "FindingCreated", js.undefined)
    
    inline def setFindingIdentifier(value: AwsSecurityFindingIdentifier): Self = StObject.set(x, "FindingIdentifier", value.asInstanceOf[js.Any])
    
    inline def setFindingIdentifierUndefined: Self = StObject.set(x, "FindingIdentifier", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setUpdateSource(value: FindingHistoryUpdateSource): Self = StObject.set(x, "UpdateSource", value.asInstanceOf[js.Any])
    
    inline def setUpdateSourceUndefined: Self = StObject.set(x, "UpdateSource", js.undefined)
    
    inline def setUpdateTime(value: js.Date): Self = StObject.set(x, "UpdateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "UpdateTime", js.undefined)
    
    inline def setUpdates(value: FindingHistoryUpdatesList): Self = StObject.set(x, "Updates", value.asInstanceOf[js.Any])
    
    inline def setUpdatesUndefined: Self = StObject.set(x, "Updates", js.undefined)
    
    inline def setUpdatesVarargs(value: FindingHistoryUpdate*): Self = StObject.set(x, "Updates", js.Array(value*))
  }
}
