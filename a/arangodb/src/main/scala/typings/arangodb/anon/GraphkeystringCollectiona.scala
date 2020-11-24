package typings.arangodb.anon

import org.scalablytyped.runtime.StringDictionary
import typings.arangodb.ArangoDB.Collection
import typings.arangodb.ArangoDB.Document
import typings.arangodb.ArangoDB.Edge
import typings.arangodb.arangodbGeneralGraphMod.Betweenness
import typings.arangodb.arangodbGeneralGraphMod.BetweennessOptions
import typings.arangodb.arangodbGeneralGraphMod.Closeness
import typings.arangodb.arangodbGeneralGraphMod.ClosenessOptions
import typings.arangodb.arangodbGeneralGraphMod.CommonNeighbors
import typings.arangodb.arangodbGeneralGraphMod.CommonProperties
import typings.arangodb.arangodbGeneralGraphMod.CommonPropertiesOptions
import typings.arangodb.arangodbGeneralGraphMod.ConnectingEdgesOptions
import typings.arangodb.arangodbGeneralGraphMod.CountCommonNeighbors
import typings.arangodb.arangodbGeneralGraphMod.CountCommonProperties
import typings.arangodb.arangodbGeneralGraphMod.DiameterOptions
import typings.arangodb.arangodbGeneralGraphMod.Distance
import typings.arangodb.arangodbGeneralGraphMod.Eccentricity
import typings.arangodb.arangodbGeneralGraphMod.EccentricityOptions
import typings.arangodb.arangodbGeneralGraphMod.EdgeDefinition
import typings.arangodb.arangodbGeneralGraphMod.Example
import typings.arangodb.arangodbGeneralGraphMod.NeighborsOptions
import typings.arangodb.arangodbGeneralGraphMod.Path
import typings.arangodb.arangodbGeneralGraphMod.PathsOptions
import typings.arangodb.arangodbGeneralGraphMod.RadiusOptions
import typings.arangodb.arangodbGeneralGraphMod.ShortestPath
import typings.arangodb.arangodbGeneralGraphMod.ShortestPathOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined arangodb.@arangodb/general-graph.Graph & {[key: string] : arangodb.ArangoDB.Collection<any> | undefined} */
@js.native
trait GraphkeystringCollectiona
  extends /* key */ StringDictionary[js.UndefOr[Collection[_]]] {
  
  def _absoluteBetweenness(vertexExample: Example): Betweenness = js.native
  def _absoluteBetweenness(vertexExample: Example, options: BetweennessOptions): Betweenness = js.native
  
  def _absoluteCloseness(vertexExample: Example): Closeness = js.native
  def _absoluteCloseness(vertexExample: Example, options: ClosenessOptions): Closeness = js.native
  
  def _absoluteEccentricity(vertexExample: Example): Eccentricity = js.native
  def _absoluteEccentricity(vertexExample: Example, options: EccentricityOptions): Eccentricity = js.native
  
  def _addVertexCollection(orphanCollectionName: String): Unit = js.native
  def _addVertexCollection(orphanCollectionName: String, createCollection: Boolean): Unit = js.native
  
  def _betweenness(vertexExample: Example): Betweenness = js.native
  def _betweenness(vertexExample: Example, options: BetweennessOptions): Betweenness = js.native
  
  def _closeness(vertexExample: Example): Closeness = js.native
  def _closeness(vertexExample: Example, options: ClosenessOptions): Closeness = js.native
  
  def _commonNeighbors(vertex1Example: Example, vertex2Example: Example): js.Array[CommonNeighbors] = js.native
  def _commonNeighbors(
    vertex1Example: Example,
    vertex2Example: Example,
    vertex1Options: js.UndefOr[scala.Nothing],
    vertex2Options: NeighborsOptions
  ): js.Array[CommonNeighbors] = js.native
  def _commonNeighbors(vertex1Example: Example, vertex2Example: Example, vertex1Options: NeighborsOptions): js.Array[CommonNeighbors] = js.native
  def _commonNeighbors(
    vertex1Example: Example,
    vertex2Example: Example,
    vertex1Options: NeighborsOptions,
    vertex2Options: NeighborsOptions
  ): js.Array[CommonNeighbors] = js.native
  
  def _commonProperties(vertexExample1: Example, vertex2Example: Example): js.Array[CommonProperties] = js.native
  def _commonProperties(vertexExample1: Example, vertex2Example: Example, options: CommonPropertiesOptions): js.Array[CommonProperties] = js.native
  
  def _countCommonNeighbors(vertex1Example: Example, vertex2Example: Example): js.Array[CountCommonNeighbors] = js.native
  def _countCommonNeighbors(
    vertex1Example: Example,
    vertex2Example: Example,
    vertex1Options: js.UndefOr[scala.Nothing],
    vertex2Options: NeighborsOptions
  ): js.Array[CountCommonNeighbors] = js.native
  def _countCommonNeighbors(vertex1Example: Example, vertex2Example: Example, vertex1Options: NeighborsOptions): js.Array[CountCommonNeighbors] = js.native
  def _countCommonNeighbors(
    vertex1Example: Example,
    vertex2Example: Example,
    vertex1Options: NeighborsOptions,
    vertex2Options: NeighborsOptions
  ): js.Array[CountCommonNeighbors] = js.native
  
  def _countCommonProperties(vertex1Example: Example, vertex2Example: Example): js.Array[CountCommonProperties] = js.native
  def _countCommonProperties(vertex1Example: Example, vertex2Example: Example, options: CommonPropertiesOptions): js.Array[CountCommonProperties] = js.native
  
  def _deleteEdgeDefinition(edgeCollectionName: String): Unit = js.native
  def _deleteEdgeDefinition(edgeCollectionName: String, dropCollection: Boolean): Unit = js.native
  
  def _diameter(vertexExample: Example): Double = js.native
  def _diameter(vertexExample: Example, options: DiameterOptions): Double = js.native
  
  def _distanceTo(startVertexExample: Example, endVertexExample: Example): js.Array[Distance] = js.native
  def _distanceTo(startVertexExample: Example, endVertexExample: Example, options: ShortestPathOptions): js.Array[Distance] = js.native
  
  def _eccentricity(vertexExample: Example): Eccentricity = js.native
  def _eccentricity(vertexExample: Example, options: EccentricityOptions): Eccentricity = js.native
  
  def _editEdgeDefinitions(edgeDefinition: EdgeDefinition): Unit = js.native
  
  def _extendEdgeDefinitions(edgeDefinition: EdgeDefinition): Unit = js.native
  
  def _fromVertex(edgeId: String): Document[_] = js.native
  
  def _getConnectingEdges(vertexExample1: Example, vertexExample2: Example, options: ConnectingEdgesOptions): Edge[_] = js.native
  
  def _neighbors(vertexExample: Example): js.Array[String] = js.native
  def _neighbors(vertexExample: Example, options: NeighborsOptions): js.Array[String] = js.native
  
  def _orphanCollections(): js.Array[String] = js.native
  
  def _paths(): js.Array[Path[_, _, _, scala.Nothing]] = js.native
  def _paths(options: PathsOptions): js.Array[Path[_, _, _, scala.Nothing]] = js.native
  
  def _radius(vertexExample: Example): Double = js.native
  def _radius(vertexExample: Example, options: RadiusOptions): Double = js.native
  
  def _removeVertexCollection(orphanCollectionName: String): Unit = js.native
  def _removeVertexCollection(orphanCollectionName: String, dropCollection: Boolean): Unit = js.native
  
  def _shortestPath(startVertexExample: Example, endVertexExample: Example): js.Array[ShortestPath[_]] = js.native
  def _shortestPath(startVertexExample: Example, endVertexExample: Example, options: ShortestPathOptions): js.Array[ShortestPath[_]] = js.native
  
  def _toVertex(edgeId: String): Document[_] = js.native
}
