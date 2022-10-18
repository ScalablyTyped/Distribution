package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndexConfigurationSummary extends StObject {
  
  /**
    * The Unix timestamp when the index was created.
    */
  var CreatedAt: js.Date
  
  /**
    * Indicates whether the index is a enterprise edition index or a developer edition index. 
    */
  var Edition: js.UndefOr[IndexEdition] = js.undefined
  
  /**
    * A unique identifier for the index. Use this to identify the index when you are using APIs such as Query, DescribeIndex, UpdateIndex, and DeleteIndex.
    */
  var Id: js.UndefOr[IndexId] = js.undefined
  
  /**
    * The identifier of the index.
    */
  var Name: js.UndefOr[IndexName] = js.undefined
  
  /**
    * The current status of the index. When the status is ACTIVE, the index is ready to search.
    */
  var Status: IndexStatus
  
  /**
    * The Unix timestamp when the index was last updated by the UpdateIndex API.
    */
  var UpdatedAt: js.Date
}
object IndexConfigurationSummary {
  
  inline def apply(CreatedAt: js.Date, Status: IndexStatus, UpdatedAt: js.Date): IndexConfigurationSummary = {
    val __obj = js.Dynamic.literal(CreatedAt = CreatedAt.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], UpdatedAt = UpdatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexConfigurationSummary]
  }
  
  extension [Self <: IndexConfigurationSummary](x: Self) {
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setEdition(value: IndexEdition): Self = StObject.set(x, "Edition", value.asInstanceOf[js.Any])
    
    inline def setEditionUndefined: Self = StObject.set(x, "Edition", js.undefined)
    
    inline def setId(value: IndexId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setName(value: IndexName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setStatus(value: IndexStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAt(value: js.Date): Self = StObject.set(x, "UpdatedAt", value.asInstanceOf[js.Any])
  }
}
