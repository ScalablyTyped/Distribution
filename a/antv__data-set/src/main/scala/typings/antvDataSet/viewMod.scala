package typings.antvDataSet

import typings.antvDataSet.anon.Edges
import typings.antvDataSet.anon.Type
import typings.antvDataSet.anon.TypeT
import typings.antvDataSet.anon.TypeofDataSetInstantiable
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
import typings.antvDataSet.dataSetMod.DataSet
import typings.antvDataSet.geoMod.GeoApi
import typings.antvDataSet.hierarchyMod.HierarchyApi
import typings.antvDataSet.partitionMod.PartitionApi
import typings.antvDataSet.statisticsMod.StatisticsApi
import typings.wolfy87Eventemitter.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object viewMod {
  
  @JSImport("@antv/data-set/lib/view", "View")
  @js.native
  class View ()
    extends ^
       with StatisticsApi
       with PartitionApi
       with HierarchyApi
       with GeoApi {
    def this(dataSet: DataSet) = this()
    def this(options: ViewOptions) = this()
    def this(dataSet: Unit, options: ViewOptions) = this()
    def this(dataSet: DataSet, options: ViewOptions) = this()
    
    var _GridHexJSON: js.Any = js.native
    
    var _HexJSON: js.Any = js.native
    
    /* private */ var _executeTransform: js.Any = js.native
    
    var _gridRows: js.Any = js.native
    
    /* private */ var _parseStateExpression: js.Any = js.native
    
    /* private */ var _prepareSource: js.Any = js.native
    
    /* private */ var _preparseOptions: js.Any = js.native
    
    var _projectedAs: js.Array[String] = js.native
    
    /* private */ var _reExecute: js.Any = js.native
    
    /* private */ var _reExecuteTransforms: js.Any = js.native
    
    var _source: CustomSource = js.native
    
    var _tagCloud: js.Any = js.native
    
    def addRow(row: js.Any): Unit = js.native
    
    /* CompleteClass */
    override def average(column: String): Double = js.native
    
    /**
      * 关联的数据集
      */
    var dataSet: DataSet | Null = js.native
    
    /**
      * 数据视图类型
      */
    var dataType: String = js.native
    
    var edges: js.Array[js.Any] = js.native
    
    /* CompleteClass */
    override def extent(column: String): Double = js.native
    
    def findRow(query: js.Any): js.Any = js.native
    
    def findRows(query: js.Any): js.Array[js.Any] = js.native
    
    /* CompleteClass */
    override def getAllEdges(): js.Array[js.Any] = js.native
    
    /* CompleteClass */
    override def getAllLinks(): js.Array[js.Any] = js.native
    
    /* CompleteClass */
    override def getAllNodes(): js.Array[js.Any] = js.native
    
    def getColumn(columnName: String): js.Array[js.Any] = js.native
    
    def getColumnData(columnName: String): js.Array[js.Any] = js.native
    
    def getColumnIndex(columnName: String): Double = js.native
    
    def getColumnName(index: Double): String = js.native
    
    def getColumnNames(): js.Array[String] = js.native
    
    def getSubset(startRowIndex: Double, endRowIndex: Double, columnNames: js.Array[String]): js.Array[js.Any] = js.native
    
    var graph: Edges = js.native
    
    /**
      * 是否是View
      */
    var isDataView: Boolean = js.native
    
    /**
      * 是否是View
      */
    var isView: Boolean = js.native
    
    /**
      * 是否关联了数据集
      */
    var loose: Boolean = js.native
    
    /* CompleteClass */
    override def max(column: String): Double = js.native
    
    /* CompleteClass */
    override def mean(column: String): Double = js.native
    
    /* CompleteClass */
    override def median(column: String): Double = js.native
    
    /* CompleteClass */
    override def min(column: String): Double = js.native
    
    /* CompleteClass */
    override def mode(column: String): Double = js.native
    
    var nodes: js.Array[js.Any] = js.native
    
    /**
      * 原始数据
      */
    var origin: js.Array[js.Any] = js.native
    
    /* CompleteClass */
    override def product(column: String): Double = js.native
    
    /* CompleteClass */
    override def quantile(column: String, percent: Double): Double = js.native
    
    /* CompleteClass */
    override def quantiles(column: String, percents: js.Array[Double]): js.Array[Double] = js.native
    
    /* CompleteClass */
    override def quantilesByFraction(column: String, fraction: Double): Double = js.native
    
    /* CompleteClass */
    override def range(column: String): js.Tuple2[Double, Double] = js.native
    
    def removeRow(index: Double): Unit = js.native
    
    /**
      * 存储处理后的数据
      */
    var rows: js.Array[js.Any] = js.native
    
    /**
      * 载入数据
      *
      * @remarks
      * data 是原始数据，可能是字符串，也可能是数组、对象，或者另一个数据视图实例。options 里指定了载入数据使用的 connector 和载入时使用的配置项。
      *
      * @param source - 数据
      * @param options- 数据解析配置
      */
    def source(source: String): View = js.native
    def source(
      source: /* import warning: importer.ImportType#apply Failed type conversion: [string, {}][0] */ /* import warning: importer.ImportType#apply Failed type conversion: [string, @antv/data-set.@antv/data-set/lib/connector/dsv.Options][0] */ /* import warning: importer.ImportType#apply Failed type conversion: [any, @antv/data-set.@antv/data-set/lib/connector/graph.Options][0] */ /* import warning: importer.ImportType#apply Failed type conversion: [std.Array<any>, @antv/data-set.@antv/data-set/lib/connector/hexjson.Options][0] */ /* import warning: importer.ImportType#apply Failed type conversion: [any, {}][0] */ /* import warning: importer.ImportType#apply Failed type conversion: [any, @antv/data-set.@antv/data-set/lib/connector/hierarchy.Options][0] */ /* import warning: importer.ImportType#apply Failed type conversion: [any, @antv/data-set.@antv/data-set/lib/connector/topojson.Options][0] */ js.Any,
      options: ConnectorOptions[
          GeoJSON | HexJSON | TopoJSON | csv | diagram | dsv | geo | geojson_ | graph | hex | `hex-json` | hexjson_ | hierarchy | topojson_ | tree | tsv
        ]
    ): View = js.native
    def source(source: js.Array[js.Any]): View = js.native
    def source(source: View): View = js.native
    
    /* CompleteClass */
    override def standardDeviation(column: String): Double = js.native
    
    /* CompleteClass */
    override def sum(column: String): Double = js.native
    
    /* CompleteClass */
    override def sumSimple(column: String): Double = js.native
    
    def toString(prettyPrint: Boolean): String = js.native
    
    /**
      *  执行数据处理数据。执行完这个函数后，transform 会被存储
      * @param options - 某种类型的transform
      */
    def transform(): View = js.native
    @JSName("transform")
    def transform_adjacency(options: TransformOptions[adjacency]): View = js.native
    @JSName("transform")
    def transform_aggregate(options: TransformOptions[aggregate]): View = js.native
    @JSName("transform")
    def transform_arc(options: TransformOptions[arc]): View = js.native
    @JSName("transform")
    def transform_bindot(options: TransformOptions[binDotdot]): View = js.native
    @JSName("transform")
    def transform_binhex(options: TransformOptions[binDothex]): View = js.native
    @JSName("transform")
    def transform_binhexagon(options: TransformOptions[binDothexagon]): View = js.native
    @JSName("transform")
    def transform_binhistogram(options: TransformOptions[binDothistogram]): View = js.native
    @JSName("transform")
    def transform_binquantile(options: TransformOptions[binDotquantile]): View = js.native
    @JSName("transform")
    def transform_binrect(options: TransformOptions[binDotrect]): View = js.native
    @JSName("transform")
    def transform_binrectangle(options: TransformOptions[binDotrectangle]): View = js.native
    @JSName("transform")
    def transform_default(options: TransformOptions[default]): View = js.native
    @JSName("transform")
    def transform_diagramarc(options: TransformOptions[diagramDotarc]): View = js.native
    @JSName("transform")
    def transform_diagramsankey(options: TransformOptions[diagramDotsankey]): View = js.native
    @JSName("transform")
    def transform_diagramvoronoi(options: TransformOptions[diagramDotvoronoi]): View = js.native
    @JSName("transform")
    def transform_fillRows(options: TransformOptions[fillRows]): View = js.native
    @JSName("transform")
    def transform_fillrows(options: TransformOptions[`fill-rows`]): View = js.native
    @JSName("transform")
    def transform_filter(options: TransformOptions[filter]): View = js.native
    @JSName("transform")
    def transform_fold(options: TransformOptions[fold]): View = js.native
    @JSName("transform")
    def transform_geocentroid(options: TransformOptions[geoDotcentroid]): View = js.native
    @JSName("transform")
    def transform_geoprojection(options: TransformOptions[geoDotprojection]): View = js.native
    @JSName("transform")
    def transform_georegion(options: TransformOptions[geoDotregion]): View = js.native
    @JSName("transform")
    def transform_group(options: TransformOptions[group]): View = js.native
    @JSName("transform")
    def transform_groups(options: TransformOptions[groups]): View = js.native
    @JSName("transform")
    def transform_hexbin(options: TransformOptions[hexbin]): View = js.native
    @JSName("transform")
    def transform_hierarchypartition(options: TransformOptions[hierarchyDotpartition]): View = js.native
    @JSName("transform")
    def transform_hierarchytreemap(options: TransformOptions[hierarchyDottreemap]): View = js.native
    @JSName("transform")
    def transform_impute(options: TransformOptions[impute]): View = js.native
    @JSName("transform")
    def transform_kerneldensity(options: TransformOptions[kernelDotdensity]): View = js.native
    @JSName("transform")
    def transform_kernelregression(options: TransformOptions[kernelDotregression]): View = js.native
    @JSName("transform")
    def transform_kernelsmoothdensity(options: TransformOptions[`kernel-smoothDotdensity`]): View = js.native
    @JSName("transform")
    def transform_kernelsmoothregression(options: TransformOptions[`kernel-smoothDotregression`]): View = js.native
    @JSName("transform")
    def transform_map(options: TransformOptions[map]): View = js.native
    @JSName("transform")
    def transform_partition(options: TransformOptions[partition]): View = js.native
    @JSName("transform")
    def transform_percent(options: TransformOptions[percent]): View = js.native
    @JSName("transform")
    def transform_pick(options: TransformOptions[pick]): View = js.native
    @JSName("transform")
    def transform_proportion(options: TransformOptions[proportion]): View = js.native
    @JSName("transform")
    def transform_regression(options: TransformOptions[regression]): View = js.native
    @JSName("transform")
    def transform_rename(options: TransformOptions[rename]): View = js.native
    @JSName("transform")
    def transform_renamefields(options: TransformOptions[`rename-fields`]): View = js.native
    @JSName("transform")
    def transform_reverse(options: TransformOptions[reverse]): View = js.native
    @JSName("transform")
    def transform_sankey(options: TransformOptions[sankey]): View = js.native
    @JSName("transform")
    def transform_sort(options: TransformOptions[sort]): View = js.native
    @JSName("transform")
    def transform_sortBy(options: TransformOptions[sortBy]): View = js.native
    @JSName("transform")
    def transform_sortby(options: TransformOptions[`sort-by`]): View = js.native
    @JSName("transform")
    def transform_subset(options: TransformOptions[subset]): View = js.native
    @JSName("transform")
    def transform_summary(options: TransformOptions[summary]): View = js.native
    @JSName("transform")
    def transform_tagcloud(options: TransformOptions[`tag-cloud`]): View = js.native
    @JSName("transform")
    def transform_treemap(options: TransformOptions[treemap]): View = js.native
    @JSName("transform")
    def transform_voronoi(options: TransformOptions[voronoi]): View = js.native
    @JSName("transform")
    def transform_wordcloud(options: TransformOptions[`word-cloud`]): View = js.native
    
    /**
      * 已应用的 transform
      */
    var transforms: js.Array[TransformOptions[js.Any]] = js.native
    
    def updateRow(index: Double, newRow: js.Any): Unit = js.native
    
    /* CompleteClass */
    override def variance(column: String): Double = js.native
    
    /**
      *
      */
    /* private */ var watchingStates: js.Any = js.native
  }
  /* static members */
  object View {
    
    @JSImport("@antv/data-set/lib/view", "View")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@antv/data-set/lib/view", "View.DataSet")
    @js.native
    def DataSet: TypeofDataSetInstantiable = js.native
    inline def DataSet_=(x: TypeofDataSetInstantiable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DataSet")(x.asInstanceOf[js.Any])
  }
  
  type ConnectorOptions[T /* <: csv | tsv | dsv | graph | diagram | hex | hexjson_ | `hex-json` | HexJSON | geo | geojson_ | GeoJSON | hierarchy | tree | topojson_ | TopoJSON */] = TypeT[T] & (/* import warning: importer.ImportType#apply Failed type conversion: @antv/data-set.@antv/data-set/lib/connector-params.ConnectorParams[T][1] */ js.Any)
  
  trait CustomSource extends StObject {
    
    var options: js.Any
    
    var source: js.Any
  }
  object CustomSource {
    
    inline def apply(options: js.Any, source: js.Any): CustomSource = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomSource]
    }
    
    extension [Self <: CustomSource](x: Self) {
      
      inline def setOptions(value: js.Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setSource(value: js.Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  type TransformOptions[T /* <: filter | map | pick | rename | `rename-fields` | reverse | default | sort | sortBy | `sort-by` | subset | partition | group | groups | fold | `fill-rows` | fillRows | impute | aggregate | summary | percent | proportion | regression | kernelDotdensity | `kernel-smoothDotdensity` | kernelDotregression | `kernel-smoothDotregression` | binDothistogram | binDotdot | binDothexagon | binDothex | hexbin | binDotquantile | binDotrectangle | binDotrect | treemap | hierarchyDottreemap | adjacency | hierarchyDotpartition | voronoi | diagramDotvoronoi | diagramDotsankey | sankey | diagramDotarc | arc | geoDotregion | geoDotprojection | geoDotcentroid | `tag-cloud` | `word-cloud` */] = Type[T] & (/* import warning: importer.ImportType#apply Failed type conversion: @antv/data-set.@antv/data-set/lib/transform-params.TransformsParams[T] */ js.Any)
  
  trait ViewOptions extends StObject {
    
    var watchingStates: js.UndefOr[js.Array[String]] = js.undefined
  }
  object ViewOptions {
    
    inline def apply(): ViewOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ViewOptions]
    }
    
    extension [Self <: ViewOptions](x: Self) {
      
      inline def setWatchingStates(value: js.Array[String]): Self = StObject.set(x, "watchingStates", value.asInstanceOf[js.Any])
      
      inline def setWatchingStatesUndefined: Self = StObject.set(x, "watchingStates", js.undefined)
      
      inline def setWatchingStatesVarargs(value: String*): Self = StObject.set(x, "watchingStates", js.Array(value :_*))
    }
  }
}
