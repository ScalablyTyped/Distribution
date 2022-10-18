package typings.antvDataSet

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.antvDataSet.antvDataSetStrings.GeoJSON
import typings.antvDataSet.antvDataSetStrings.HexJSON
import typings.antvDataSet.antvDataSetStrings.TopoJSON
import typings.antvDataSet.antvDataSetStrings.`fill-rows`
import typings.antvDataSet.antvDataSetStrings.`hex-json`
import typings.antvDataSet.antvDataSetStrings.`kernel-smoothDotdensity`
import typings.antvDataSet.antvDataSetStrings.`kernel-smoothDotregression`
import typings.antvDataSet.antvDataSetStrings.`rename-fields`
import typings.antvDataSet.antvDataSetStrings.`sort-by`
import typings.antvDataSet.antvDataSetStrings.`tag-cloud`
import typings.antvDataSet.antvDataSetStrings.`word-cloud`
import typings.antvDataSet.antvDataSetStrings.adjacency
import typings.antvDataSet.antvDataSetStrings.aggregate
import typings.antvDataSet.antvDataSetStrings.arc
import typings.antvDataSet.antvDataSetStrings.binDotdot
import typings.antvDataSet.antvDataSetStrings.binDothex
import typings.antvDataSet.antvDataSetStrings.binDothexagon
import typings.antvDataSet.antvDataSetStrings.binDothistogram
import typings.antvDataSet.antvDataSetStrings.binDotquantile
import typings.antvDataSet.antvDataSetStrings.binDotrect
import typings.antvDataSet.antvDataSetStrings.binDotrectangle
import typings.antvDataSet.antvDataSetStrings.csv
import typings.antvDataSet.antvDataSetStrings.default
import typings.antvDataSet.antvDataSetStrings.diagram
import typings.antvDataSet.antvDataSetStrings.diagramDotarc
import typings.antvDataSet.antvDataSetStrings.diagramDotsankey
import typings.antvDataSet.antvDataSetStrings.diagramDotvoronoi
import typings.antvDataSet.antvDataSetStrings.dsv
import typings.antvDataSet.antvDataSetStrings.fillRows
import typings.antvDataSet.antvDataSetStrings.filter
import typings.antvDataSet.antvDataSetStrings.fold
import typings.antvDataSet.antvDataSetStrings.geo
import typings.antvDataSet.antvDataSetStrings.geoDotcentroid
import typings.antvDataSet.antvDataSetStrings.geoDotprojection
import typings.antvDataSet.antvDataSetStrings.geoDotregion
import typings.antvDataSet.antvDataSetStrings.geojson_
import typings.antvDataSet.antvDataSetStrings.graph
import typings.antvDataSet.antvDataSetStrings.group
import typings.antvDataSet.antvDataSetStrings.groups
import typings.antvDataSet.antvDataSetStrings.hex
import typings.antvDataSet.antvDataSetStrings.hexbin
import typings.antvDataSet.antvDataSetStrings.hexjson_
import typings.antvDataSet.antvDataSetStrings.hierarchy
import typings.antvDataSet.antvDataSetStrings.hierarchyDotpartition
import typings.antvDataSet.antvDataSetStrings.hierarchyDottreemap
import typings.antvDataSet.antvDataSetStrings.impute
import typings.antvDataSet.antvDataSetStrings.kernelDotdensity
import typings.antvDataSet.antvDataSetStrings.kernelDotregression
import typings.antvDataSet.antvDataSetStrings.map
import typings.antvDataSet.antvDataSetStrings.partition
import typings.antvDataSet.antvDataSetStrings.percent
import typings.antvDataSet.antvDataSetStrings.pick
import typings.antvDataSet.antvDataSetStrings.proportion
import typings.antvDataSet.antvDataSetStrings.regression
import typings.antvDataSet.antvDataSetStrings.rename
import typings.antvDataSet.antvDataSetStrings.reverse
import typings.antvDataSet.antvDataSetStrings.sankey
import typings.antvDataSet.antvDataSetStrings.sort
import typings.antvDataSet.antvDataSetStrings.sortBy
import typings.antvDataSet.antvDataSetStrings.subset
import typings.antvDataSet.antvDataSetStrings.summary
import typings.antvDataSet.antvDataSetStrings.topojson_
import typings.antvDataSet.antvDataSetStrings.tree
import typings.antvDataSet.antvDataSetStrings.treemap
import typings.antvDataSet.antvDataSetStrings.tsv
import typings.antvDataSet.antvDataSetStrings.voronoi
import typings.antvDataSet.libDataSetMod.DataSet
import typings.antvDataSet.libDataSetMod.DataSetOptions
import typings.antvDataSet.libViewMod.View
import typings.antvDataSet.libViewMod.ViewOptions
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Edges extends StObject {
    
    var edges: js.Array[Any]
    
    var nodes: js.Array[Any]
  }
  object Edges {
    
    inline def apply(edges: js.Array[Any], nodes: js.Array[Any]): Edges = {
      val __obj = js.Dynamic.literal(edges = edges.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
      __obj.asInstanceOf[Edges]
    }
    
    extension [Self <: Edges](x: Self) {
      
      inline def setEdges(value: js.Array[Any]): Self = StObject.set(x, "edges", value.asInstanceOf[js.Any])
      
      inline def setEdgesVarargs(value: Any*): Self = StObject.set(x, "edges", js.Array(value*))
      
      inline def setNodes(value: js.Array[Any]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      inline def setNodesVarargs(value: Any*): Self = StObject.set(x, "nodes", js.Array(value*))
    }
  }
  
  trait GEO extends StObject {
    
    var GEO: String
    
    var GEO_GRATICULE: String
    
    var GRAPH: String
    
    var HEX: String
    
    var HIERARCHY: String
    
    var STATISTICS_METHODS: js.Array[String]
    
    var TABLE: String
  }
  object GEO {
    
    inline def apply(
      GEO: String,
      GEO_GRATICULE: String,
      GRAPH: String,
      HEX: String,
      HIERARCHY: String,
      STATISTICS_METHODS: js.Array[String],
      TABLE: String
    ): GEO = {
      val __obj = js.Dynamic.literal(GEO = GEO.asInstanceOf[js.Any], GEO_GRATICULE = GEO_GRATICULE.asInstanceOf[js.Any], GRAPH = GRAPH.asInstanceOf[js.Any], HEX = HEX.asInstanceOf[js.Any], HIERARCHY = HIERARCHY.asInstanceOf[js.Any], STATISTICS_METHODS = STATISTICS_METHODS.asInstanceOf[js.Any], TABLE = TABLE.asInstanceOf[js.Any])
      __obj.asInstanceOf[GEO]
    }
    
    extension [Self <: GEO](x: Self) {
      
      inline def setGEO(value: String): Self = StObject.set(x, "GEO", value.asInstanceOf[js.Any])
      
      inline def setGEO_GRATICULE(value: String): Self = StObject.set(x, "GEO_GRATICULE", value.asInstanceOf[js.Any])
      
      inline def setGRAPH(value: String): Self = StObject.set(x, "GRAPH", value.asInstanceOf[js.Any])
      
      inline def setHEX(value: String): Self = StObject.set(x, "HEX", value.asInstanceOf[js.Any])
      
      inline def setHIERARCHY(value: String): Self = StObject.set(x, "HIERARCHY", value.asInstanceOf[js.Any])
      
      inline def setSTATISTICS_METHODS(value: js.Array[String]): Self = StObject.set(x, "STATISTICS_METHODS", value.asInstanceOf[js.Any])
      
      inline def setSTATISTICS_METHODSVarargs(value: String*): Self = StObject.set(x, "STATISTICS_METHODS", js.Array(value*))
      
      inline def setTABLE(value: String): Self = StObject.set(x, "TABLE", value.asInstanceOf[js.Any])
    }
  }
  
  trait SankeyCenter extends StObject
  
  trait Type[T /* <: csv | tsv | dsv | graph | diagram | hex | hexjson_ | `hex-json` | HexJSON | geo | geojson_ | GeoJSON | hierarchy | tree | topojson_ | TopoJSON */] extends StObject {
    
    var `type`: T
  }
  object Type {
    
    inline def apply[T /* <: csv | tsv | dsv | graph | diagram | hex | hexjson_ | `hex-json` | HexJSON | geo | geojson_ | GeoJSON | hierarchy | tree | topojson_ | TopoJSON */](`type`: T): Type[T] = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type[T]]
    }
    
    extension [Self <: Type[?], T /* <: csv | tsv | dsv | graph | diagram | hex | hexjson_ | `hex-json` | HexJSON | geo | geojson_ | GeoJSON | hierarchy | tree | topojson_ | TopoJSON */](x: Self & Type[T]) {
      
      inline def setType(value: T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait TypeT[T /* <: filter | map | pick | rename | `rename-fields` | reverse | default | sort | sortBy | `sort-by` | subset | partition | group | groups | fold | `fill-rows` | fillRows | impute | aggregate | summary | percent | proportion | regression | kernelDotdensity | `kernel-smoothDotdensity` | kernelDotregression | `kernel-smoothDotregression` | binDothistogram | binDotdot | binDothexagon | binDothex | hexbin | binDotquantile | binDotrectangle | binDotrect | treemap | hierarchyDottreemap | adjacency | hierarchyDotpartition | voronoi | diagramDotvoronoi | diagramDotsankey | sankey | diagramDotarc | arc | geoDotregion | geoDotprojection | geoDotcentroid | `tag-cloud` | `word-cloud` */] extends StObject {
    
    var `type`: T
  }
  object TypeT {
    
    inline def apply[T /* <: filter | map | pick | rename | `rename-fields` | reverse | default | sort | sortBy | `sort-by` | subset | partition | group | groups | fold | `fill-rows` | fillRows | impute | aggregate | summary | percent | proportion | regression | kernelDotdensity | `kernel-smoothDotdensity` | kernelDotregression | `kernel-smoothDotregression` | binDothistogram | binDotdot | binDothexagon | binDothex | hexbin | binDotquantile | binDotrectangle | binDotrect | treemap | hierarchyDottreemap | adjacency | hierarchyDotpartition | voronoi | diagramDotvoronoi | diagramDotsankey | sankey | diagramDotarc | arc | geoDotregion | geoDotprojection | geoDotcentroid | `tag-cloud` | `word-cloud` */](`type`: T): TypeT[T] = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeT[T]]
    }
    
    extension [Self <: TypeT[?], T /* <: filter | map | pick | rename | `rename-fields` | reverse | default | sort | sortBy | `sort-by` | subset | partition | group | groups | fold | `fill-rows` | fillRows | impute | aggregate | summary | percent | proportion | regression | kernelDotdensity | `kernel-smoothDotdensity` | kernelDotregression | `kernel-smoothDotregression` | binDothistogram | binDotdot | binDothexagon | binDothex | hexbin | binDotquantile | binDotrectangle | binDotrect | treemap | hierarchyDottreemap | adjacency | hierarchyDotpartition | voronoi | diagramDotvoronoi | diagramDotsankey | sankey | diagramDotarc | arc | geoDotregion | geoDotprojection | geoDotcentroid | `tag-cloud` | `word-cloud` */](x: Self & TypeT[T]) {
      
      inline def setType(value: T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeofDataSet
    extends StObject
       with Instantiable0[DataSet]
       with Instantiable1[/* initialProps */ DataSetOptions, DataSet] {
    
    /**
      * 常量，譬如 DataSet.CONSTANTS.HIERARCHY 是树形结构的名称
      */
    var CONSTANTS: GEO = js.native
    
    /**
      * 注册的 Connector（key-value 对）
      */
    var connectors: Record[String, Any] = js.native
    
    def getConnector(name: String): js.Function = js.native
    
    def getTransform(): js.Function = js.native
    def getTransform(name: String): js.Function = js.native
    
    /**
      * 注册一个数据连接函数，注册后所有数据视图都可以使用 name 来引用这个数据连接函数，从而接入某种数据源。
      * @param name - 类型
      * @param connector - 解析逻辑
      */
    def registerConnector(name: String, connector: js.Function3[/* data */ Any, /* options */ Any, /* view */ View, Any]): Unit = js.native
    
    /**
      * 注册一个数据处理函数，注册后所有数据视图都可以使用 name 来引用这个数据处理函数，从而进行某种数据处理
      * @param name - transform 类型
      * @param transform - transform逻辑
      */
    def registerTransform(name: String, transform: Any): Unit = js.native
    
    /**
      * 已注册的 Transform（key-value 对）
      */
    var transforms: Record[String, Any] = js.native
    
    var version: String = js.native
  }
  
  @js.native
  trait TypeofDataSetInstantiable
    extends StObject
       with Instantiable0[DataSet]
       with Instantiable1[/* initialProps */ DataSetOptions, DataSet] {
    
    /**
      * 常量，譬如 DataSet.CONSTANTS.HIERARCHY 是树形结构的名称
      */
    var CONSTANTS: GEO = js.native
    
    /**
      * 注册的 Connector（key-value 对）
      */
    var connectors: Record[String, Any] = js.native
    
    def getConnector(name: String): js.Function = js.native
    
    def getTransform(): js.Function = js.native
    def getTransform(name: String): js.Function = js.native
    
    /**
      * 注册一个数据连接函数，注册后所有数据视图都可以使用 name 来引用这个数据连接函数，从而接入某种数据源。
      * @param name - 类型
      * @param connector - 解析逻辑
      */
    def registerConnector(
      name: String,
      connector: js.Function3[/* data */ Any, /* options */ Any, /* view */ this.type, Any]
    ): Unit = js.native
    
    /**
      * 注册一个数据处理函数，注册后所有数据视图都可以使用 name 来引用这个数据处理函数，从而进行某种数据处理
      * @param name - transform 类型
      * @param transform - transform逻辑
      */
    def registerTransform(name: String, transform: Any): Unit = js.native
    
    /**
      * 已注册的 Transform（key-value 对）
      */
    var transforms: Record[String, Any] = js.native
    
    var version: String = js.native
  }
  
  @js.native
  trait TypeofView
    extends StObject
       with Instantiable0[View]
       with Instantiable1[/* options */ ViewOptions, View]
}
