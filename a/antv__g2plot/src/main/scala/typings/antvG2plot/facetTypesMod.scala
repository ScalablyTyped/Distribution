package typings.antvG2plot

import typings.antvG2.libInterfaceMod.AdjustOption
import typings.antvG2.libInterfaceMod.CircleCfg
import typings.antvG2.libInterfaceMod.CircleData
import typings.antvG2.libInterfaceMod.CoordinateOption
import typings.antvG2.libInterfaceMod.FacetTitle
import typings.antvG2.libInterfaceMod.ListCfg
import typings.antvG2.libInterfaceMod.ListData
import typings.antvG2.libInterfaceMod.MatrixCfg
import typings.antvG2.libInterfaceMod.MatrixData
import typings.antvG2.libInterfaceMod.MirrorCfg
import typings.antvG2.libInterfaceMod.MirrorData
import typings.antvG2.libInterfaceMod.RectCfg
import typings.antvG2.libInterfaceMod.RectData
import typings.antvG2.libInterfaceMod.TreeCfg
import typings.antvG2.libInterfaceMod.TreeData
import typings.antvG2.libInterfaceMod.ViewPadding
import typings.antvG2.viewMod.View
import typings.antvG2plot.animationMod.Animation
import typings.antvG2plot.annotationMod.Annotation
import typings.antvG2plot.antvG2plotBooleans.`false`
import typings.antvG2plot.antvG2plotStrings.auto
import typings.antvG2plot.antvG2plotStrings.circle
import typings.antvG2plot.antvG2plotStrings.list
import typings.antvG2plot.antvG2plotStrings.matrix
import typings.antvG2plot.antvG2plotStrings.mirror
import typings.antvG2plot.antvG2plotStrings.rect
import typings.antvG2plot.antvG2plotStrings.tree
import typings.antvG2plot.axisMod.Axis
import typings.antvG2plot.baseMod.Geometry_
import typings.antvG2plot.interactionMod.Interaction
import typings.antvG2plot.mixUtilsMod.IPlotTypes
import typings.antvG2plot.tooltipMod.Tooltip
import typings.antvG2plot.typesCommonMod.Data
import typings.antvG2plot.typesCommonMod.Datum
import typings.antvG2plot.typesCommonMod.Options
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object facetTypesMod {
  
  @js.native
  trait FacetCfg
    extends StObject
       with MirrorCfg
       with RectCfg
       with TreeCfg
       with ListCfg
       with CircleCfg
       with MatrixCfg {
    
    /**
      * @title 列标题的样式
      */
    /* InferMemberOverrides */
    override val columnTitle: js.UndefOr[FacetTitle] = js.native
    
    /**
      * @title view 创建回调。
      */
    /* InferMemberOverrides */
    override def eachView(innerView: View): Any = js.native
    /* InferMemberOverrides */
    override def eachView(innerView: View, facet: MirrorData): Any = js.native
    
    /**
      * @title facet 数据划分维度。
      */
    /* InferMemberOverrides */
    override val fields: js.Array[String] = js.native
    
    /**
      * @title facet view padding。
      */
    /* InferMemberOverrides */
    override val padding: js.UndefOr[ViewPadding] = js.native
    
    /**
      * @title 列标题的样式
      */
    /* InferMemberOverrides */
    override val rowTitle: js.UndefOr[FacetTitle] = js.native
    
    /**
      * @title 是否显示标题。
      */
    /* InferMemberOverrides */
    override val showTitle: js.UndefOr[Boolean] = js.native
    
    /**
      * @title 分面 view 之间的间隔， 百分比或像素值
      */
    /* InferMemberOverrides */
    override val spacing: js.UndefOr[js.Tuple2[Double | String, Double | String]] = js.native
    
    /**
      * @title 分面标题配置。
      */
    /* InferMemberOverrides */
    override val title: js.UndefOr[FacetTitle] = js.native
    
    /**
      * @title 布局类型。
      */
    /* InferMemberOverrides */
    override val `type`: js.UndefOr[String] = js.native
  }
  
  /**
    * @title facetData map
    */
  trait FacetDataMap extends StObject {
    
    /**
      * @title circle 类型分面配置
      */
    val circle: CircleData
    
    /**
      * @title list 类型分面配置
      */
    val list: ListData
    
    /**
      * @title matrix 类型分面配置
      */
    val matrix: MatrixData
    
    /**
      * @title mirror 类型分面配置
      */
    val mirror: MirrorData
    
    /**
      * @title rect 类型分面配置
      */
    val rect: RectData
    
    /**
      * @title tree 类型分面配置
      */
    val tree: TreeData
  }
  object FacetDataMap {
    
    inline def apply(
      circle: CircleData,
      list: ListData,
      matrix: MatrixData,
      mirror: MirrorData,
      rect: RectData,
      tree: TreeData
    ): FacetDataMap = {
      val __obj = js.Dynamic.literal(circle = circle.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], matrix = matrix.asInstanceOf[js.Any], mirror = mirror.asInstanceOf[js.Any], rect = rect.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any])
      __obj.asInstanceOf[FacetDataMap]
    }
    
    extension [Self <: FacetDataMap](x: Self) {
      
      inline def setCircle(value: CircleData): Self = StObject.set(x, "circle", value.asInstanceOf[js.Any])
      
      inline def setList(value: ListData): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
      
      inline def setMatrix(value: MatrixData): Self = StObject.set(x, "matrix", value.asInstanceOf[js.Any])
      
      inline def setMirror(value: MirrorData): Self = StObject.set(x, "mirror", value.asInstanceOf[js.Any])
      
      inline def setRect(value: RectData): Self = StObject.set(x, "rect", value.asInstanceOf[js.Any])
      
      inline def setTree(value: TreeData): Self = StObject.set(x, "tree", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FacetOptions[T /* <: /* keyof @antv/g2.@antv/g2/lib/interface.FacetCfgMap */ rect | mirror | list | matrix | circle | tree */]
    extends StObject
       with Options
       with FacetCfg {
    
    /**
      * @title 轴配置
      */
    val axes: js.UndefOr[`false` | (Record[String, Axis])] = js.native
    
    /**
      * @title 坐标系的配置
      * @description 每一个 view 具有相同的坐标系
      */
    val coordinate: js.UndefOr[CoordinateOption] = js.native
    
    /**
      * @title 分面数据
      */
    @JSName("data")
    val data_FacetOptions: Data = js.native
    
    /**
      * @title 绘图
      * @description 每个分面 view 中的具体绘图表现 回调的方式
      */
    def eachView(
      innerView: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify View */ Any
    ): IView | IPlot = js.native
    def eachView(
      innerView: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify View */ Any,
      facet: /* import warning: importer.ImportType#apply Failed type conversion: @antv/g2plot.@antv/g2plot/lib/plots/facet/types.FacetDataMap[T] */ js.Any
    ): IView | IPlot = js.native
    /**
      * @title view 创建回调。
      */
    /* InferMemberOverrides */
    override def eachView(innerView: View): Any = js.native
    /* InferMemberOverrides */
    override def eachView(innerView: View, facet: MirrorData): Any = js.native
    
    /**
      * @title facet view padding。
      */
    /* InferMemberOverrides */
    override val padding: js.UndefOr[ViewPadding] & (js.UndefOr[js.Array[Double] | Double | auto]) = js.native
    
    /**
      * @title 分面类型
      * @description G2 内置了六种分面: rect、list、circle、tree、mirror 和 matrix
      */
    @JSName("type")
    val type_FacetOptions: T = js.native
  }
  
  trait IGeometry
    extends StObject
       with Geometry_ {
    
    var adjust: js.UndefOr[AdjustOption] = js.undefined
  }
  object IGeometry {
    
    inline def apply(): IGeometry = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IGeometry]
    }
    
    extension [Self <: IGeometry](x: Self) {
      
      inline def setAdjust(value: AdjustOption): Self = StObject.set(x, "adjust", value.asInstanceOf[js.Any])
      
      inline def setAdjustUndefined: Self = StObject.set(x, "adjust", js.undefined)
    }
  }
  
  type IPlot = IPlotTypes
  
  trait IView extends StObject {
    
    /**
      * @title animation 配置
      */
    val animation: js.UndefOr[Animation] = js.undefined
    
    /**
      * @title annotation 配置
      */
    val annotations: js.UndefOr[js.Array[Annotation]] = js.undefined
    
    /**
      * @title 坐标轴配置
      */
    val axes: js.UndefOr[`false` | (Record[String, Axis])] = js.undefined
    
    /**
      * @title 坐标系的配置
      * @description 每一个 view 具有相同的坐标系
      */
    val coordinate: js.UndefOr[CoordinateOption] = js.undefined
    
    /**
      * @title 数据
      * @description optional，view 中的数据
      */
    val data: js.UndefOr[Data] = js.undefined
    
    /**
      * @title 图形
      * @description geometry 及映射配置
      */
    val geometries: js.Array[IGeometry]
    
    /**
      * @title interactions 配置
      */
    val interactions: js.UndefOr[js.Array[Interaction]] = js.undefined
    
    /**
      * @title meta
      */
    val meta: js.UndefOr[Record[String, Axis]] = js.undefined
    
    /**
      * @title tooltip 配置
      */
    val tooltip: js.UndefOr[Tooltip] = js.undefined
  }
  object IView {
    
    inline def apply(geometries: js.Array[IGeometry]): IView = {
      val __obj = js.Dynamic.literal(geometries = geometries.asInstanceOf[js.Any])
      __obj.asInstanceOf[IView]
    }
    
    extension [Self <: IView](x: Self) {
      
      inline def setAnimation(value: Animation): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      inline def setAnnotations(value: js.Array[Annotation]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
      
      inline def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
      
      inline def setAnnotationsVarargs(value: Annotation*): Self = StObject.set(x, "annotations", js.Array(value*))
      
      inline def setAxes(value: `false` | (Record[String, Axis])): Self = StObject.set(x, "axes", value.asInstanceOf[js.Any])
      
      inline def setAxesUndefined: Self = StObject.set(x, "axes", js.undefined)
      
      inline def setCoordinate(value: CoordinateOption): Self = StObject.set(x, "coordinate", value.asInstanceOf[js.Any])
      
      inline def setCoordinateUndefined: Self = StObject.set(x, "coordinate", js.undefined)
      
      inline def setData(value: Data): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDataVarargs(value: Datum*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setGeometries(value: js.Array[IGeometry]): Self = StObject.set(x, "geometries", value.asInstanceOf[js.Any])
      
      inline def setGeometriesVarargs(value: IGeometry*): Self = StObject.set(x, "geometries", js.Array(value*))
      
      inline def setInteractions(value: js.Array[Interaction]): Self = StObject.set(x, "interactions", value.asInstanceOf[js.Any])
      
      inline def setInteractionsUndefined: Self = StObject.set(x, "interactions", js.undefined)
      
      inline def setInteractionsVarargs(value: Interaction*): Self = StObject.set(x, "interactions", js.Array(value*))
      
      inline def setMeta(value: Record[String, Axis]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      inline def setTooltip(value: Tooltip): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    }
  }
}
