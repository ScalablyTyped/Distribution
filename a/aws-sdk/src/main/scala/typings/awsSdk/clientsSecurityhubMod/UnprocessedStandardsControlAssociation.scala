package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnprocessedStandardsControlAssociation extends StObject {
  
  /**
    * The error code for the unprocessed standard and control association. 
    */
  var ErrorCode: UnprocessedErrorCode
  
  /**
    * The reason why the standard and control association was unprocessed. 
    */
  var ErrorReason: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  An array with one or more objects that includes a security control (identified with SecurityControlId, SecurityControlArn, or a mix of both parameters) and the Amazon Resource Name (ARN) of a standard. This parameter shows the specific controls for which the enablement status couldn't be retrieved in specified standards when calling BatchUpdateStandardsControlAssociations. 
    */
  var StandardsControlAssociationId: typings.awsSdk.clientsSecurityhubMod.StandardsControlAssociationId
}
object UnprocessedStandardsControlAssociation {
  
  inline def apply(ErrorCode: UnprocessedErrorCode, StandardsControlAssociationId: StandardsControlAssociationId): UnprocessedStandardsControlAssociation = {
    val __obj = js.Dynamic.literal(ErrorCode = ErrorCode.asInstanceOf[js.Any], StandardsControlAssociationId = StandardsControlAssociationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnprocessedStandardsControlAssociation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UnprocessedStandardsControlAssociation] (val x: Self) extends AnyVal {
    
    inline def setErrorCode(value: UnprocessedErrorCode): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorReason(value: NonEmptyString): Self = StObject.set(x, "ErrorReason", value.asInstanceOf[js.Any])
    
    inline def setErrorReasonUndefined: Self = StObject.set(x, "ErrorReason", js.undefined)
    
    inline def setStandardsControlAssociationId(value: StandardsControlAssociationId): Self = StObject.set(x, "StandardsControlAssociationId", value.asInstanceOf[js.Any])
  }
}
