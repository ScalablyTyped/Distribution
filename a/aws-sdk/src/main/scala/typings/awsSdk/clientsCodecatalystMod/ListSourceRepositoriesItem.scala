package typings.awsSdk.clientsCodecatalystMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSourceRepositoriesItem extends StObject {
  
  /**
    * The time the source repository was created, in coordinated universal time (UTC) timestamp format as specified in RFC 3339.
    */
  var createdTime: js.Date
  
  /**
    * The description of the repository, if any.
    */
  var description: js.UndefOr[SourceRepositoryDescriptionString] = js.undefined
  
  /**
    * The system-generated unique ID of the source repository.
    */
  var id: SourceRepositoryIdString
  
  /**
    * The time the source repository was last updated, in coordinated universal time (UTC) timestamp format as specified in RFC 3339.
    */
  var lastUpdatedTime: js.Date
  
  /**
    * The name of the source repository.
    */
  var name: SourceRepositoryNameString
}
object ListSourceRepositoriesItem {
  
  inline def apply(
    createdTime: js.Date,
    id: SourceRepositoryIdString,
    lastUpdatedTime: js.Date,
    name: SourceRepositoryNameString
  ): ListSourceRepositoriesItem = {
    val __obj = js.Dynamic.literal(createdTime = createdTime.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastUpdatedTime = lastUpdatedTime.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSourceRepositoriesItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListSourceRepositoriesItem] (val x: Self) extends AnyVal {
    
    inline def setCreatedTime(value: js.Date): Self = StObject.set(x, "createdTime", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: SourceRepositoryDescriptionString): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setId(value: SourceRepositoryIdString): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTime(value: js.Date): Self = StObject.set(x, "lastUpdatedTime", value.asInstanceOf[js.Any])
    
    inline def setName(value: SourceRepositoryNameString): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
