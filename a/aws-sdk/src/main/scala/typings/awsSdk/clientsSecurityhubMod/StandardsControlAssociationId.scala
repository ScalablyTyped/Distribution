package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StandardsControlAssociationId extends StObject {
  
  /**
    *  The unique identifier (identified with SecurityControlId, SecurityControlArn, or a mix of both parameters) of a security control across standards. 
    */
  var SecurityControlId: NonEmptyString
  
  /**
    *  The ARN of a standard. 
    */
  var StandardsArn: NonEmptyString
}
object StandardsControlAssociationId {
  
  inline def apply(SecurityControlId: NonEmptyString, StandardsArn: NonEmptyString): StandardsControlAssociationId = {
    val __obj = js.Dynamic.literal(SecurityControlId = SecurityControlId.asInstanceOf[js.Any], StandardsArn = StandardsArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StandardsControlAssociationId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StandardsControlAssociationId] (val x: Self) extends AnyVal {
    
    inline def setSecurityControlId(value: NonEmptyString): Self = StObject.set(x, "SecurityControlId", value.asInstanceOf[js.Any])
    
    inline def setStandardsArn(value: NonEmptyString): Self = StObject.set(x, "StandardsArn", value.asInstanceOf[js.Any])
  }
}
