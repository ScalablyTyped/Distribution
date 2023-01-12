package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListExperienceEntitiesRequest extends StObject {
  
  /**
    * The identifier of your Amazon Kendra experience.
    */
  var Id: ExperienceId
  
  /**
    * The identifier of the index for your Amazon Kendra experience.
    */
  var IndexId: typings.awsSdk.clientsKendraMod.IndexId
  
  /**
    * If the previous response was incomplete (because there is more data to retrieve), Amazon Kendra returns a pagination token in the response. You can use this pagination token to retrieve the next set of users or groups.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsKendraMod.NextToken] = js.undefined
}
object ListExperienceEntitiesRequest {
  
  inline def apply(Id: ExperienceId, IndexId: IndexId): ListExperienceEntitiesRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], IndexId = IndexId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListExperienceEntitiesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListExperienceEntitiesRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: ExperienceId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIndexId(value: IndexId): Self = StObject.set(x, "IndexId", value.asInstanceOf[js.Any])
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
