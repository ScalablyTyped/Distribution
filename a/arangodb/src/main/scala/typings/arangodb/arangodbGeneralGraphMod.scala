package typings.arangodb

import org.scalablytyped.runtime.StringDictionary
import typings.arangodb.ArangoDB.Document
import typings.arangodb.ArangoDB.Edge
import typings.arangodb.ArangoDB.EdgeDirection
import typings.arangodb.anon.Dictkey
import typings.arangodb.anon.GraphkeystringCollectiona
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arangodbGeneralGraphMod {
  
  @JSImport("@arangodb/general-graph", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def _graph(name: String): GraphkeystringCollectiona = ^.asInstanceOf[js.Dynamic].applyDynamic("_graph")(name.asInstanceOf[js.Any]).asInstanceOf[GraphkeystringCollectiona]
  
  inline def create(name: String): GraphkeystringCollectiona = ^.asInstanceOf[js.Dynamic].applyDynamic("_create")(name.asInstanceOf[js.Any]).asInstanceOf[GraphkeystringCollectiona]
  inline def create(name: String, edgeDefinitions: js.Array[EdgeDefinition]): GraphkeystringCollectiona = (^.asInstanceOf[js.Dynamic].applyDynamic("_create")(name.asInstanceOf[js.Any], edgeDefinitions.asInstanceOf[js.Any])).asInstanceOf[GraphkeystringCollectiona]
  inline def create(name: String, edgeDefinitions: js.Array[EdgeDefinition], orphanCollections: js.Array[String]): GraphkeystringCollectiona = (^.asInstanceOf[js.Dynamic].applyDynamic("_create")(name.asInstanceOf[js.Any], edgeDefinitions.asInstanceOf[js.Any], orphanCollections.asInstanceOf[js.Any])).asInstanceOf[GraphkeystringCollectiona]
  inline def create(name: String, edgeDefinitions: Unit, orphanCollections: js.Array[String]): GraphkeystringCollectiona = (^.asInstanceOf[js.Dynamic].applyDynamic("_create")(name.asInstanceOf[js.Any], edgeDefinitions.asInstanceOf[js.Any], orphanCollections.asInstanceOf[js.Any])).asInstanceOf[GraphkeystringCollectiona]
  
  inline def drop(name: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_drop")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def drop(name: String, dropCollections: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("_drop")(name.asInstanceOf[js.Any], dropCollections.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def edgeDefinitions(relations: EdgeDefinition*): js.Array[EdgeDefinition] = ^.asInstanceOf[js.Dynamic].applyDynamic("_edgeDefinitions")(relations.asInstanceOf[js.Any]).asInstanceOf[js.Array[EdgeDefinition]]
  
  inline def extendEdgeDefinitions(edgeDefinitions: js.Array[EdgeDefinition], relations: EdgeDefinition*): js.Array[EdgeDefinition] = (^.asInstanceOf[js.Dynamic].applyDynamic("_extendEdgeDefinitions")(edgeDefinitions.asInstanceOf[js.Any], relations.asInstanceOf[js.Any])).asInstanceOf[js.Array[EdgeDefinition]]
  
  inline def list(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("_list")().asInstanceOf[js.Array[String]]
  
  inline def relation(name: String, fromVertexCollections: String, toVertexCollections: String): EdgeDefinition = (^.asInstanceOf[js.Dynamic].applyDynamic("_relation")(name.asInstanceOf[js.Any], fromVertexCollections.asInstanceOf[js.Any], toVertexCollections.asInstanceOf[js.Any])).asInstanceOf[EdgeDefinition]
  inline def relation(name: String, fromVertexCollections: String, toVertexCollections: js.Array[String]): EdgeDefinition = (^.asInstanceOf[js.Dynamic].applyDynamic("_relation")(name.asInstanceOf[js.Any], fromVertexCollections.asInstanceOf[js.Any], toVertexCollections.asInstanceOf[js.Any])).asInstanceOf[EdgeDefinition]
  inline def relation(name: String, fromVertexCollections: js.Array[String], toVertexCollections: String): EdgeDefinition = (^.asInstanceOf[js.Dynamic].applyDynamic("_relation")(name.asInstanceOf[js.Any], fromVertexCollections.asInstanceOf[js.Any], toVertexCollections.asInstanceOf[js.Any])).asInstanceOf[EdgeDefinition]
  inline def relation(name: String, fromVertexCollections: js.Array[String], toVertexCollections: js.Array[String]): EdgeDefinition = (^.asInstanceOf[js.Dynamic].applyDynamic("_relation")(name.asInstanceOf[js.Any], fromVertexCollections.asInstanceOf[js.Any], toVertexCollections.asInstanceOf[js.Any])).asInstanceOf[EdgeDefinition]
  
  type Betweenness = Eccentricity
  
  trait BetweennessOptions extends StObject {
    
    var defaultWeight: js.UndefOr[Double] = js.undefined
    
    var direction: js.UndefOr[EdgeDirection] = js.undefined
    
    var weight: js.UndefOr[String] = js.undefined
  }
  object BetweennessOptions {
    
    inline def apply(): BetweennessOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BetweennessOptions]
    }
    
    extension [Self <: BetweennessOptions](x: Self) {
      
      inline def setDefaultWeight(value: Double): Self = StObject.set(x, "defaultWeight", value.asInstanceOf[js.Any])
      
      inline def setDefaultWeightUndefined: Self = StObject.set(x, "defaultWeight", js.undefined)
      
      inline def setDirection(value: EdgeDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setWeight(value: String): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
      
      inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
    }
  }
  
  type Closeness = Eccentricity
  
  type ClosenessOptions = ShortestPathOptions
  
  trait CommonNeighbors extends StObject {
    
    var left: String
    
    var neighbors: js.Array[String]
    
    var right: String
  }
  object CommonNeighbors {
    
    inline def apply(left: String, neighbors: js.Array[String], right: String): CommonNeighbors = {
      val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], neighbors = neighbors.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommonNeighbors]
    }
    
    extension [Self <: CommonNeighbors](x: Self) {
      
      inline def setLeft(value: String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setNeighbors(value: js.Array[String]): Self = StObject.set(x, "neighbors", value.asInstanceOf[js.Any])
      
      inline def setNeighborsVarargs(value: String*): Self = StObject.set(x, "neighbors", js.Array(value :_*))
      
      inline def setRight(value: String): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    }
  }
  
  type CommonProperties = StringDictionary[js.UndefOr[js.Array[Dictkey]]]
  
  trait CommonPropertiesOptions extends StObject {
    
    var ignoredProperties: js.UndefOr[js.Array[String] | String] = js.undefined
    
    var vertex1CollectionRestriction: js.UndefOr[js.Array[String] | String] = js.undefined
    
    var vertex2CollectionRestriction: js.UndefOr[js.Array[String] | String] = js.undefined
  }
  object CommonPropertiesOptions {
    
    inline def apply(): CommonPropertiesOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonPropertiesOptions]
    }
    
    extension [Self <: CommonPropertiesOptions](x: Self) {
      
      inline def setIgnoredProperties(value: js.Array[String] | String): Self = StObject.set(x, "ignoredProperties", value.asInstanceOf[js.Any])
      
      inline def setIgnoredPropertiesUndefined: Self = StObject.set(x, "ignoredProperties", js.undefined)
      
      inline def setIgnoredPropertiesVarargs(value: String*): Self = StObject.set(x, "ignoredProperties", js.Array(value :_*))
      
      inline def setVertex1CollectionRestriction(value: js.Array[String] | String): Self = StObject.set(x, "vertex1CollectionRestriction", value.asInstanceOf[js.Any])
      
      inline def setVertex1CollectionRestrictionUndefined: Self = StObject.set(x, "vertex1CollectionRestriction", js.undefined)
      
      inline def setVertex1CollectionRestrictionVarargs(value: String*): Self = StObject.set(x, "vertex1CollectionRestriction", js.Array(value :_*))
      
      inline def setVertex2CollectionRestriction(value: js.Array[String] | String): Self = StObject.set(x, "vertex2CollectionRestriction", value.asInstanceOf[js.Any])
      
      inline def setVertex2CollectionRestrictionUndefined: Self = StObject.set(x, "vertex2CollectionRestriction", js.undefined)
      
      inline def setVertex2CollectionRestrictionVarargs(value: String*): Self = StObject.set(x, "vertex2CollectionRestriction", js.Array(value :_*))
    }
  }
  
  trait ConnectingEdgesOptions extends StObject {
    
    var edgeCollectionRestriction: js.UndefOr[js.Array[String] | String] = js.undefined
    
    var edgeExamples: js.UndefOr[Example] = js.undefined
    
    var vertex1CollectionRestriction: js.UndefOr[js.Array[String] | String] = js.undefined
    
    var vertex2CollectionRestriction: js.UndefOr[js.Array[String] | String] = js.undefined
  }
  object ConnectingEdgesOptions {
    
    inline def apply(): ConnectingEdgesOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectingEdgesOptions]
    }
    
    extension [Self <: ConnectingEdgesOptions](x: Self) {
      
      inline def setEdgeCollectionRestriction(value: js.Array[String] | String): Self = StObject.set(x, "edgeCollectionRestriction", value.asInstanceOf[js.Any])
      
      inline def setEdgeCollectionRestrictionUndefined: Self = StObject.set(x, "edgeCollectionRestriction", js.undefined)
      
      inline def setEdgeCollectionRestrictionVarargs(value: String*): Self = StObject.set(x, "edgeCollectionRestriction", js.Array(value :_*))
      
      inline def setEdgeExamples(value: Example): Self = StObject.set(x, "edgeExamples", value.asInstanceOf[js.Any])
      
      inline def setEdgeExamplesNull: Self = StObject.set(x, "edgeExamples", null)
      
      inline def setEdgeExamplesUndefined: Self = StObject.set(x, "edgeExamples", js.undefined)
      
      inline def setEdgeExamplesVarargs(value: (js.Object | String)*): Self = StObject.set(x, "edgeExamples", js.Array(value :_*))
      
      inline def setVertex1CollectionRestriction(value: js.Array[String] | String): Self = StObject.set(x, "vertex1CollectionRestriction", value.asInstanceOf[js.Any])
      
      inline def setVertex1CollectionRestrictionUndefined: Self = StObject.set(x, "vertex1CollectionRestriction", js.undefined)
      
      inline def setVertex1CollectionRestrictionVarargs(value: String*): Self = StObject.set(x, "vertex1CollectionRestriction", js.Array(value :_*))
      
      inline def setVertex2CollectionRestriction(value: js.Array[String] | String): Self = StObject.set(x, "vertex2CollectionRestriction", value.asInstanceOf[js.Any])
      
      inline def setVertex2CollectionRestrictionUndefined: Self = StObject.set(x, "vertex2CollectionRestriction", js.undefined)
      
      inline def setVertex2CollectionRestrictionVarargs(value: String*): Self = StObject.set(x, "vertex2CollectionRestriction", js.Array(value :_*))
    }
  }
  
  type CountCommonNeighbors = StringDictionary[js.UndefOr[js.Array[StringDictionary[js.UndefOr[Double]]]]]
  
  type CountCommonProperties = StringDictionary[js.UndefOr[Double]]
  
  type DiameterOptions = BetweennessOptions
  
  trait Distance extends StObject {
    
    var distance: Double
    
    var startVertex: String
    
    var vertex: String
  }
  object Distance {
    
    inline def apply(distance: Double, startVertex: String, vertex: String): Distance = {
      val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], startVertex = startVertex.asInstanceOf[js.Any], vertex = vertex.asInstanceOf[js.Any])
      __obj.asInstanceOf[Distance]
    }
    
    extension [Self <: Distance](x: Self) {
      
      inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      inline def setStartVertex(value: String): Self = StObject.set(x, "startVertex", value.asInstanceOf[js.Any])
      
      inline def setVertex(value: String): Self = StObject.set(x, "vertex", value.asInstanceOf[js.Any])
    }
  }
  
  type Eccentricity = StringDictionary[js.UndefOr[Double]]
  
  type EccentricityOptions = ShortestPathOptions
  
  trait EdgeDefinition extends StObject {
    
    var collection: String
    
    var from: js.Array[String]
    
    var to: js.Array[String]
  }
  object EdgeDefinition {
    
    inline def apply(collection: String, from: js.Array[String], to: js.Array[String]): EdgeDefinition = {
      val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[EdgeDefinition]
    }
    
    extension [Self <: EdgeDefinition](x: Self) {
      
      inline def setCollection(value: String): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
      
      inline def setFrom(value: js.Array[String]): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromVarargs(value: String*): Self = StObject.set(x, "from", js.Array(value :_*))
      
      inline def setTo(value: js.Array[String]): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToVarargs(value: String*): Self = StObject.set(x, "to", js.Array(value :_*))
    }
  }
  
  type Example = (js.Array[js.Object | String]) | js.Object | String | Null
  
  @js.native
  trait Graph extends StObject {
    
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
      vertex1Options: Unit,
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
      vertex1Options: Unit,
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
    
    def _fromVertex(edgeId: String): Document[js.Any] = js.native
    
    def _getConnectingEdges(vertexExample1: Example, vertexExample2: Example, options: ConnectingEdgesOptions): Edge[js.Any] = js.native
    
    def _neighbors(vertexExample: Example): js.Array[String] = js.native
    def _neighbors(vertexExample: Example, options: NeighborsOptions): js.Array[String] = js.native
    
    def _orphanCollections(): js.Array[String] = js.native
    
    def _paths(): js.Array[Path[js.Any, js.Any, js.Any, scala.Nothing]] = js.native
    def _paths(options: PathsOptions): js.Array[Path[js.Any, js.Any, js.Any, scala.Nothing]] = js.native
    
    def _radius(vertexExample: Example): Double = js.native
    def _radius(vertexExample: Example, options: RadiusOptions): Double = js.native
    
    def _removeVertexCollection(orphanCollectionName: String): Unit = js.native
    def _removeVertexCollection(orphanCollectionName: String, dropCollection: Boolean): Unit = js.native
    
    def _shortestPath(startVertexExample: Example, endVertexExample: Example): js.Array[ShortestPath[js.Any]] = js.native
    def _shortestPath(startVertexExample: Example, endVertexExample: Example, options: ShortestPathOptions): js.Array[ShortestPath[js.Any]] = js.native
    
    def _toVertex(edgeId: String): Document[js.Any] = js.native
  }
  
  trait NeighborsOptions extends StObject {
    
    var direction: js.UndefOr[EdgeDirection] = js.undefined
    
    var edgeCollectionRestriction: js.UndefOr[js.Array[String] | String] = js.undefined
    
    var edgeExamples: js.UndefOr[Example] = js.undefined
    
    var maxDepth: js.UndefOr[Double] = js.undefined
    
    var minDepth: js.UndefOr[Double] = js.undefined
    
    var neighborExamples: js.UndefOr[Example] = js.undefined
    
    var vertexCollectionRestriction: js.UndefOr[js.Array[String] | String] = js.undefined
  }
  object NeighborsOptions {
    
    inline def apply(): NeighborsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NeighborsOptions]
    }
    
    extension [Self <: NeighborsOptions](x: Self) {
      
      inline def setDirection(value: EdgeDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setEdgeCollectionRestriction(value: js.Array[String] | String): Self = StObject.set(x, "edgeCollectionRestriction", value.asInstanceOf[js.Any])
      
      inline def setEdgeCollectionRestrictionUndefined: Self = StObject.set(x, "edgeCollectionRestriction", js.undefined)
      
      inline def setEdgeCollectionRestrictionVarargs(value: String*): Self = StObject.set(x, "edgeCollectionRestriction", js.Array(value :_*))
      
      inline def setEdgeExamples(value: Example): Self = StObject.set(x, "edgeExamples", value.asInstanceOf[js.Any])
      
      inline def setEdgeExamplesNull: Self = StObject.set(x, "edgeExamples", null)
      
      inline def setEdgeExamplesUndefined: Self = StObject.set(x, "edgeExamples", js.undefined)
      
      inline def setEdgeExamplesVarargs(value: (js.Object | String)*): Self = StObject.set(x, "edgeExamples", js.Array(value :_*))
      
      inline def setMaxDepth(value: Double): Self = StObject.set(x, "maxDepth", value.asInstanceOf[js.Any])
      
      inline def setMaxDepthUndefined: Self = StObject.set(x, "maxDepth", js.undefined)
      
      inline def setMinDepth(value: Double): Self = StObject.set(x, "minDepth", value.asInstanceOf[js.Any])
      
      inline def setMinDepthUndefined: Self = StObject.set(x, "minDepth", js.undefined)
      
      inline def setNeighborExamples(value: Example): Self = StObject.set(x, "neighborExamples", value.asInstanceOf[js.Any])
      
      inline def setNeighborExamplesNull: Self = StObject.set(x, "neighborExamples", null)
      
      inline def setNeighborExamplesUndefined: Self = StObject.set(x, "neighborExamples", js.undefined)
      
      inline def setNeighborExamplesVarargs(value: (js.Object | String)*): Self = StObject.set(x, "neighborExamples", js.Array(value :_*))
      
      inline def setVertexCollectionRestriction(value: js.Array[String] | String): Self = StObject.set(x, "vertexCollectionRestriction", value.asInstanceOf[js.Any])
      
      inline def setVertexCollectionRestrictionUndefined: Self = StObject.set(x, "vertexCollectionRestriction", js.undefined)
      
      inline def setVertexCollectionRestrictionVarargs(value: String*): Self = StObject.set(x, "vertexCollectionRestriction", js.Array(value :_*))
    }
  }
  
  trait Path[A /* <: js.Object */, B /* <: js.Object */, E /* <: js.Object */, V /* <: js.Object */] extends StObject {
    
    var destination: Document[B]
    
    var edges: js.Array[Edge[E]]
    
    var source: Document[A]
    
    var vertice: js.Array[Document[A | B | V]]
  }
  object Path {
    
    inline def apply[A /* <: js.Object */, B /* <: js.Object */, E /* <: js.Object */, V /* <: js.Object */](
      destination: Document[B],
      edges: js.Array[Edge[E]],
      source: Document[A],
      vertice: js.Array[Document[A | B | V]]
    ): Path[A, B, E, V] = {
      val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], edges = edges.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], vertice = vertice.asInstanceOf[js.Any])
      __obj.asInstanceOf[Path[A, B, E, V]]
    }
    
    extension [Self <: Path[?, ?, ?, ?], A /* <: js.Object */, B /* <: js.Object */, E /* <: js.Object */, V /* <: js.Object */](x: Self & (Path[A, B, E, V])) {
      
      inline def setDestination(value: Document[B]): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
      
      inline def setEdges(value: js.Array[Edge[E]]): Self = StObject.set(x, "edges", value.asInstanceOf[js.Any])
      
      inline def setEdgesVarargs(value: Edge[E]*): Self = StObject.set(x, "edges", js.Array(value :_*))
      
      inline def setSource(value: Document[A]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setVertice(value: js.Array[Document[A | B | V]]): Self = StObject.set(x, "vertice", value.asInstanceOf[js.Any])
      
      inline def setVerticeVarargs(value: (Document[A | B | V])*): Self = StObject.set(x, "vertice", js.Array(value :_*))
    }
  }
  
  trait PathsOptions extends StObject {
    
    var direction: js.UndefOr[EdgeDirection] = js.undefined
    
    var followCycles: js.UndefOr[Boolean] = js.undefined
    
    var maxLength: js.UndefOr[Double] = js.undefined
    
    var minLength: js.UndefOr[Double] = js.undefined
  }
  object PathsOptions {
    
    inline def apply(): PathsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PathsOptions]
    }
    
    extension [Self <: PathsOptions](x: Self) {
      
      inline def setDirection(value: EdgeDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setFollowCycles(value: Boolean): Self = StObject.set(x, "followCycles", value.asInstanceOf[js.Any])
      
      inline def setFollowCyclesUndefined: Self = StObject.set(x, "followCycles", js.undefined)
      
      inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      inline def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
      
      inline def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
    }
  }
  
  type RadiusOptions = BetweennessOptions
  
  trait ShortestPath[T /* <: js.Object */] extends StObject {
    
    var distance: Double
    
    var edges: js.Array[Edge[T]]
    
    var vertices: js.Array[String]
  }
  object ShortestPath {
    
    inline def apply[T /* <: js.Object */](distance: Double, edges: js.Array[Edge[T]], vertices: js.Array[String]): ShortestPath[T] = {
      val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], edges = edges.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShortestPath[T]]
    }
    
    extension [Self <: ShortestPath[?], T /* <: js.Object */](x: Self & ShortestPath[T]) {
      
      inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      inline def setEdges(value: js.Array[Edge[T]]): Self = StObject.set(x, "edges", value.asInstanceOf[js.Any])
      
      inline def setEdgesVarargs(value: Edge[T]*): Self = StObject.set(x, "edges", js.Array(value :_*))
      
      inline def setVertices(value: js.Array[String]): Self = StObject.set(x, "vertices", value.asInstanceOf[js.Any])
      
      inline def setVerticesVarargs(value: String*): Self = StObject.set(x, "vertices", js.Array(value :_*))
    }
  }
  
  trait ShortestPathOptions extends StObject {
    
    var defaultWeight: js.UndefOr[Double] = js.undefined
    
    var direction: js.UndefOr[EdgeDirection] = js.undefined
    
    var edgeCollectionRestriction: js.UndefOr[js.Array[String] | String] = js.undefined
    
    var endVertexCollectionRestriction: js.UndefOr[js.Array[String] | String] = js.undefined
    
    var startVertexCollectionRestriction: js.UndefOr[js.Array[String] | String] = js.undefined
    
    var weight: js.UndefOr[String] = js.undefined
  }
  object ShortestPathOptions {
    
    inline def apply(): ShortestPathOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShortestPathOptions]
    }
    
    extension [Self <: ShortestPathOptions](x: Self) {
      
      inline def setDefaultWeight(value: Double): Self = StObject.set(x, "defaultWeight", value.asInstanceOf[js.Any])
      
      inline def setDefaultWeightUndefined: Self = StObject.set(x, "defaultWeight", js.undefined)
      
      inline def setDirection(value: EdgeDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setEdgeCollectionRestriction(value: js.Array[String] | String): Self = StObject.set(x, "edgeCollectionRestriction", value.asInstanceOf[js.Any])
      
      inline def setEdgeCollectionRestrictionUndefined: Self = StObject.set(x, "edgeCollectionRestriction", js.undefined)
      
      inline def setEdgeCollectionRestrictionVarargs(value: String*): Self = StObject.set(x, "edgeCollectionRestriction", js.Array(value :_*))
      
      inline def setEndVertexCollectionRestriction(value: js.Array[String] | String): Self = StObject.set(x, "endVertexCollectionRestriction", value.asInstanceOf[js.Any])
      
      inline def setEndVertexCollectionRestrictionUndefined: Self = StObject.set(x, "endVertexCollectionRestriction", js.undefined)
      
      inline def setEndVertexCollectionRestrictionVarargs(value: String*): Self = StObject.set(x, "endVertexCollectionRestriction", js.Array(value :_*))
      
      inline def setStartVertexCollectionRestriction(value: js.Array[String] | String): Self = StObject.set(x, "startVertexCollectionRestriction", value.asInstanceOf[js.Any])
      
      inline def setStartVertexCollectionRestrictionUndefined: Self = StObject.set(x, "startVertexCollectionRestriction", js.undefined)
      
      inline def setStartVertexCollectionRestrictionVarargs(value: String*): Self = StObject.set(x, "startVertexCollectionRestriction", js.Array(value :_*))
      
      inline def setWeight(value: String): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
      
      inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
    }
  }
}
