package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfluenceSpaceConfiguration extends StObject {
  
  /**
    *  TRUE to index archived spaces.
    */
  var CrawlArchivedSpaces: js.UndefOr[Boolean] = js.undefined
  
  /**
    *  TRUE to index personal spaces. You can add restrictions to items in personal spaces. If personal spaces are indexed, queries without user context information may return restricted items from a personal space in their results. For more information, see Filtering on user context.
    */
  var CrawlPersonalSpaces: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A list of space keys of Confluence spaces. If you include a key, the blogs, documents, and attachments in the space are not indexed. If a space is in both the ExcludeSpaces and the IncludeSpaces list, the space is excluded.
    */
  var ExcludeSpaces: js.UndefOr[ConfluenceSpaceList] = js.undefined
  
  /**
    * A list of space keys for Confluence spaces. If you include a key, the blogs, documents, and attachments in the space are indexed. Spaces that aren't in the list aren't indexed. A space in the list must exist. Otherwise, Amazon Kendra logs an error when the data source is synchronized. If a space is in both the IncludeSpaces and the ExcludeSpaces list, the space is excluded.
    */
  var IncludeSpaces: js.UndefOr[ConfluenceSpaceList] = js.undefined
  
  /**
    * Maps attributes or field names of Confluence spaces to Amazon Kendra index field names. To create custom fields, use the UpdateIndex API before you map to Confluence fields. For more information, see Mapping data source fields. The Confluence data source field names must exist in your Confluence custom metadata. If you specify the SpaceFieldMappings parameter, you must specify at least one field mapping.
    */
  var SpaceFieldMappings: js.UndefOr[ConfluenceSpaceFieldMappingsList] = js.undefined
}
object ConfluenceSpaceConfiguration {
  
  inline def apply(): ConfluenceSpaceConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfluenceSpaceConfiguration]
  }
  
  extension [Self <: ConfluenceSpaceConfiguration](x: Self) {
    
    inline def setCrawlArchivedSpaces(value: Boolean): Self = StObject.set(x, "CrawlArchivedSpaces", value.asInstanceOf[js.Any])
    
    inline def setCrawlArchivedSpacesUndefined: Self = StObject.set(x, "CrawlArchivedSpaces", js.undefined)
    
    inline def setCrawlPersonalSpaces(value: Boolean): Self = StObject.set(x, "CrawlPersonalSpaces", value.asInstanceOf[js.Any])
    
    inline def setCrawlPersonalSpacesUndefined: Self = StObject.set(x, "CrawlPersonalSpaces", js.undefined)
    
    inline def setExcludeSpaces(value: ConfluenceSpaceList): Self = StObject.set(x, "ExcludeSpaces", value.asInstanceOf[js.Any])
    
    inline def setExcludeSpacesUndefined: Self = StObject.set(x, "ExcludeSpaces", js.undefined)
    
    inline def setExcludeSpacesVarargs(value: ConfluenceSpaceIdentifier*): Self = StObject.set(x, "ExcludeSpaces", js.Array(value*))
    
    inline def setIncludeSpaces(value: ConfluenceSpaceList): Self = StObject.set(x, "IncludeSpaces", value.asInstanceOf[js.Any])
    
    inline def setIncludeSpacesUndefined: Self = StObject.set(x, "IncludeSpaces", js.undefined)
    
    inline def setIncludeSpacesVarargs(value: ConfluenceSpaceIdentifier*): Self = StObject.set(x, "IncludeSpaces", js.Array(value*))
    
    inline def setSpaceFieldMappings(value: ConfluenceSpaceFieldMappingsList): Self = StObject.set(x, "SpaceFieldMappings", value.asInstanceOf[js.Any])
    
    inline def setSpaceFieldMappingsUndefined: Self = StObject.set(x, "SpaceFieldMappings", js.undefined)
    
    inline def setSpaceFieldMappingsVarargs(value: ConfluenceSpaceToIndexFieldMapping*): Self = StObject.set(x, "SpaceFieldMappings", js.Array(value*))
  }
}
