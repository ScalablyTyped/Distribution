package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfluenceBlogConfiguration extends StObject {
  
  /**
    * Maps attributes or field names of Confluence blogs to Amazon Kendra index field names. To create custom fields, use the UpdateIndex API before you map to Confluence fields. For more information, see Mapping data source fields. The Confluence data source field names must exist in your Confluence custom metadata. If you specify the BlogFieldMappings parameter, you must specify at least one field mapping.
    */
  var BlogFieldMappings: js.UndefOr[ConfluenceBlogFieldMappingsList] = js.undefined
}
object ConfluenceBlogConfiguration {
  
  inline def apply(): ConfluenceBlogConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfluenceBlogConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConfluenceBlogConfiguration] (val x: Self) extends AnyVal {
    
    inline def setBlogFieldMappings(value: ConfluenceBlogFieldMappingsList): Self = StObject.set(x, "BlogFieldMappings", value.asInstanceOf[js.Any])
    
    inline def setBlogFieldMappingsUndefined: Self = StObject.set(x, "BlogFieldMappings", js.undefined)
    
    inline def setBlogFieldMappingsVarargs(value: ConfluenceBlogToIndexFieldMapping*): Self = StObject.set(x, "BlogFieldMappings", js.Array(value*))
  }
}
