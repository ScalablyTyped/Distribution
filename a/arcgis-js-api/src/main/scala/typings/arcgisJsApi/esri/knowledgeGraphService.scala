package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A knowledge graph service is associated with several resources.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraphService.html)
  */
@js.native
trait knowledgeGraphService extends StObject {
  
  /**
    * Add, delete, or update [entities](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-Entity.html) and [relationships](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-Relationship.html) in a [knowledge graph service's](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraphService.html) [graph](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-KnowledgeGraph.html) resource.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraphService.html#executeApplyEdits)
    */
  def executeApplyEdits(graph: KnowledgeGraph, edits: GraphApplyEdits): js.Promise[GraphApplyEditsResult] = js.native
  def executeApplyEdits(graph: KnowledgeGraph, edits: GraphApplyEdits, requestOptions: RequestOptions): js.Promise[GraphApplyEditsResult] = js.native
  
  /**
    * Executes a query on [knowledge graph service's](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraphService.html) [graph](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-KnowledgeGraph.html) resource using the Esri implementation of [openCypher](https://opencypher.org/) and returns the results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraphService.html#executeQuery)
    */
  def executeQuery(graph: KnowledgeGraph, queryArguments: GraphQuery): js.Promise[GraphQueryResult] = js.native
  def executeQuery(graph: KnowledgeGraph, queryArguments: GraphQuery, requestOptions: RequestOptions): js.Promise[GraphQueryResult] = js.native
  
  /**
    * Execute a streaming query on a [knowledge graph service's](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraphService.html) [graph](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-KnowledgeGraph.html) resource.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraphService.html#executeQueryStreaming)
    */
  def executeQueryStreaming(graph: KnowledgeGraph, queryArguments: GraphQueryStreaming): js.Promise[GraphQueryStreamingResult] = js.native
  def executeQueryStreaming(graph: KnowledgeGraph, queryArguments: GraphQueryStreaming, requestOptions: RequestOptions): js.Promise[GraphQueryStreamingResult] = js.native
  
  /**
    * Search the knowledge graph using a full-text index that is automatically built on the property values in the graph and returns the result.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraphService.html#executeSearch)
    */
  def executeSearch(graph: KnowledgeGraph, searchArguments: GraphSearch): js.Promise[GraphQueryResult] = js.native
  def executeSearch(graph: KnowledgeGraph, searchArguments: GraphSearch, requestOptions: RequestOptions): js.Promise[GraphQueryResult] = js.native
  
  /**
    * Execute a streaming search on a [knowledge graph service's](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraphService.html) [graph](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-KnowledgeGraph.html) resource.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraphService.html#executeSearchStreaming)
    */
  def executeSearchStreaming(graph: KnowledgeGraph, searchArguments: GraphSearchStreaming): js.Promise[GraphQueryStreamingResult] = js.native
  def executeSearchStreaming(graph: KnowledgeGraph, searchArguments: GraphSearchStreaming, requestOptions: Any): js.Promise[GraphQueryStreamingResult] = js.native
  
  /**
    * Retrieves the knowledge graph service based on the URL provided.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraphService.html#fetchKnowledgeGraph)
    */
  def fetchKnowledgeGraph(url: String): js.Promise[KnowledgeGraph] = js.native
  
  /**
    * Refreshes the [data model](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-DataModel.html) of the [knowledge graph](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-KnowledgeGraph.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraphService.html#refreshDataModel)
    */
  def refreshDataModel(graph: KnowledgeGraph): scala.Unit = js.native
}
