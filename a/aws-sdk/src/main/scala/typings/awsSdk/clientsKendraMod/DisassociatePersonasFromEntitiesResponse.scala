package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociatePersonasFromEntitiesResponse extends StObject {
  
  /**
    * Lists the users or groups in your IAM Identity Center identity source that failed to properly remove access to your Amazon Kendra experience.
    */
  var FailedEntityList: js.UndefOr[typings.awsSdk.clientsKendraMod.FailedEntityList] = js.undefined
}
object DisassociatePersonasFromEntitiesResponse {
  
  inline def apply(): DisassociatePersonasFromEntitiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisassociatePersonasFromEntitiesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisassociatePersonasFromEntitiesResponse] (val x: Self) extends AnyVal {
    
    inline def setFailedEntityList(value: FailedEntityList): Self = StObject.set(x, "FailedEntityList", value.asInstanceOf[js.Any])
    
    inline def setFailedEntityListUndefined: Self = StObject.set(x, "FailedEntityList", js.undefined)
    
    inline def setFailedEntityListVarargs(value: FailedEntity*): Self = StObject.set(x, "FailedEntityList", js.Array(value*))
  }
}
