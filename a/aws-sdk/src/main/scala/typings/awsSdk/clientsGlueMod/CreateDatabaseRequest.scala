package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDatabaseRequest extends StObject {
  
  /**
    * The ID of the Data Catalog in which to create the database. If none is provided, the Amazon Web Services account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
  
  /**
    * The metadata for the database.
    */
  var DatabaseInput: typings.awsSdk.clientsGlueMod.DatabaseInput
  
  /**
    * The tags you assign to the database.
    */
  var Tags: js.UndefOr[TagsMap] = js.undefined
}
object CreateDatabaseRequest {
  
  inline def apply(DatabaseInput: DatabaseInput): CreateDatabaseRequest = {
    val __obj = js.Dynamic.literal(DatabaseInput = DatabaseInput.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDatabaseRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateDatabaseRequest] (val x: Self) extends AnyVal {
    
    inline def setCatalogId(value: CatalogIdString): Self = StObject.set(x, "CatalogId", value.asInstanceOf[js.Any])
    
    inline def setCatalogIdUndefined: Self = StObject.set(x, "CatalogId", js.undefined)
    
    inline def setDatabaseInput(value: DatabaseInput): Self = StObject.set(x, "DatabaseInput", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagsMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
