package typings.awsSdk.clientsCodeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourcePolicy extends StObject {
  
  /**
    *  The resource policy formatted in JSON. 
    */
  var document: js.UndefOr[PolicyDocument] = js.undefined
  
  /**
    *  The ARN of the resource associated with the resource policy 
    */
  var resourceArn: js.UndefOr[Arn] = js.undefined
  
  /**
    *  The current revision of the resource policy. 
    */
  var revision: js.UndefOr[PolicyRevision] = js.undefined
}
object ResourcePolicy {
  
  inline def apply(): ResourcePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourcePolicy]
  }
  
  extension [Self <: ResourcePolicy](x: Self) {
    
    inline def setDocument(value: PolicyDocument): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
    
    inline def setResourceArn(value: Arn): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
    
    inline def setResourceArnUndefined: Self = StObject.set(x, "resourceArn", js.undefined)
    
    inline def setRevision(value: PolicyRevision): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    
    inline def setRevisionUndefined: Self = StObject.set(x, "revision", js.undefined)
  }
}
