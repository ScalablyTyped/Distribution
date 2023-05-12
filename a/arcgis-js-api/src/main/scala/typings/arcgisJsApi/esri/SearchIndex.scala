package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.Both
import typings.arcgisJsApi.arcgisJsApiStrings.Relationship
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchIndex
  extends StObject
     with Accessor {
  
  /**
    * Additional analyzers for string processing during search such as support for languages.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-SearchIndex.html#analyzers)
    */
  val analyzers: js.Array[SearchIndexAnalyzers] = js.native
  
  /**
    * The name of the search index.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-SearchIndex.html#name)
    */
  val name: String = js.native
  
  /**
    * A map of the named types and their properties that are included in the search index.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-SearchIndex.html#searchProperties)
    */
  val searchProperties: js.Array[SearchIndexSearchProperties] = js.native
  
  /**
    * Specifies if the index supports searching entities, relationships or both.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-SearchIndex.html#supportedCategory)
    */
  val supportedCategory: typings.arcgisJsApi.arcgisJsApiStrings.Entity | Relationship | Both = js.native
}
