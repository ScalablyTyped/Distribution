package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateEntitiesFromExperienceRequest extends StObject {
  
  /**
    * Lists users or groups in your IAM Identity Center identity source.
    */
  var EntityList: DisassociateEntityList
  
  /**
    * The identifier of your Amazon Kendra experience.
    */
  var Id: ExperienceId
  
  /**
    * The identifier of the index for your Amazon Kendra experience.
    */
  var IndexId: typings.awsSdk.clientsKendraMod.IndexId
}
object DisassociateEntitiesFromExperienceRequest {
  
  inline def apply(EntityList: DisassociateEntityList, Id: ExperienceId, IndexId: IndexId): DisassociateEntitiesFromExperienceRequest = {
    val __obj = js.Dynamic.literal(EntityList = EntityList.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], IndexId = IndexId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateEntitiesFromExperienceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisassociateEntitiesFromExperienceRequest] (val x: Self) extends AnyVal {
    
    inline def setEntityList(value: DisassociateEntityList): Self = StObject.set(x, "EntityList", value.asInstanceOf[js.Any])
    
    inline def setEntityListVarargs(value: EntityConfiguration*): Self = StObject.set(x, "EntityList", js.Array(value*))
    
    inline def setId(value: ExperienceId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIndexId(value: IndexId): Self = StObject.set(x, "IndexId", value.asInstanceOf[js.Any])
  }
}
