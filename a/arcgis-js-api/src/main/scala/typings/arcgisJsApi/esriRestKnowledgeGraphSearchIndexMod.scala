package typings.arcgisJsApi

import typings.arcgisJsApi.esri.SearchIndex
import typings.arcgisJsApi.esri.SearchIndexProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriRestKnowledgeGraphSearchIndexMod {
  
  @JSImport("esri/rest/knowledgeGraph/SearchIndex", JSImport.Namespace)
  @js.native
  /**
    * Defines a search index for a [KnowledgeGraph](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-KnowledgeGraph.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-SearchIndex.html)
    */
  open class ^ ()
    extends StObject
       with SearchIndex {
    def this(properties: SearchIndexProperties) = this()
  }
}
