package typings.antvG2plot

import typings.antvEventEmitter.mod.default
import typings.antvG2.libInterfaceMod.SyncViewPaddingFn
import typings.antvG2.paddingCalMod.PaddingCalCtor
import typings.antvG2.viewMod.View
import typings.antvG2plot.adaptorMod.Adaptor
import typings.antvG2plot.annotationMod.Annotation
import typings.antvG2plot.anon.Id
import typings.antvG2plot.antvG2plotStrings.auto
import typings.antvG2plot.antvG2plotStrings.canvas
import typings.antvG2plot.antvG2plotStrings.svg
import typings.antvG2plot.stateMod.StateCondition
import typings.antvG2plot.stateMod.StateName
import typings.antvG2plot.stateMod.StateObject
import typings.std.HTMLElement
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object plotMod {
  
  @JSImport("@antv/g2plot/lib/core/plot", "PLOT_CONTAINER_OPTIONS")
  @js.native
  val PLOT_CONTAINER_OPTIONS: js.Array[String] = js.native
  
  @JSImport("@antv/g2plot/lib/core/plot", "Plot")
  @js.native
  abstract class Plot[O /* <: PickOptions */] protected () extends default {
    def this(container: String, options: O) = this()
    def this(container: HTMLElement, options: O) = this()
    
    /**
      * 增加图表标注。通过 id 标识，如果匹配到，就做更新
      */
    def addAnnotations(annotations: js.Array[Annotation]): Unit = js.native
    def addAnnotations(
      annotations: js.Array[Annotation],
      view: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify View */ Any
    ): Unit = js.native
    
    /**
      * 绑定代理所有 G2 的事件
      */
    /* private */ var bindEvents: Any = js.native
    
    /**
      * 绑定 dom 容器大小变化的事件
      */
    /* private */ var bindSizeSensor: Any = js.native
    
    /**
      * 更新数据
      * @override
      * @param options
      */
    def changeData(data: Any): Unit = js.native
    
    /**
      * 修改画布大小
      * @param width
      * @param height
      */
    def changeSize(width: Double, height: Double): Unit = js.native
    
    /** G2 chart 实例 */
    var chart: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Chart */ Any = js.native
    
    /** plot 绘制的 dom */
    val container: HTMLElement = js.native
    
    /**
      * 创建 G2 实例
      */
    /* private */ var createG2: Any = js.native
    
    /**
      * 销毁
      */
    def destroy(): Unit = js.native
    
    /**
      * 执行 adaptor 操作
      */
    /* protected */ def execAdaptor(): Unit = js.native
    
    /**
      * 计算默认的 chart 大小。逻辑简化：如果存在 width 或 height，则直接使用，否则使用容器大小
      * @param width
      * @param height
      */
    /* private */ var getChartSize: Any = js.native
    
    /**
      * 获取默认的 options 配置项
      * 每个组件都可以复写
      */
    /* protected */ def getDefaultOptions(): Any = js.native
    
    /**
      * 每个组件有自己的 schema adaptor
      */
    /* protected */ def getSchemaAdaptor(): Adaptor[O] = js.native
    
    /**
      * 获取状态
      */
    def getStates(): js.Array[StateObject] = js.native
    
    /** plot 的 schema 配置 */
    var options: O = js.native
    
    /**
      * 删除图表标注。通过 id 标识，如果匹配到，就做删除
      */
    def removeAnnotations(annotations: js.Array[Id & Partial[Annotation]]): Unit = js.native
    
    /**
      * 绘制
      */
    def render(): Unit = js.native
    
    /**
      * 设置状态
      * @param type 状态类型，支持 'active' | 'inactive' | 'selected' 三种
      * @param conditions 条件，支持数组
      * @param status 是否激活，默认 true
      */
    def setState(`type`: StateName, condition: StateCondition): Unit = js.native
    def setState(`type`: StateName, condition: StateCondition, status: Boolean): Unit = js.native
    
    /**
      * 当图表容器大小变化的时候，执行的函数
      */
    /* protected */ def triggerResize(): Unit = js.native
    
    /** plot 类型名称 */
    val `type`: String = js.native
    
    /** resizer unbind  */
    /* private */ var unbind: Any = js.native
    
    /**
      * 取消绑定
      */
    /* private */ var unbindSizeSensor: Any = js.native
    
    /**
      * 更新: 更新配置且重新渲染
      * @param options
      */
    def update(options: Partial[O]): Unit = js.native
    
    /**
      * 更新配置
      * @param options
      */
    /* protected */ def updateOption(options: Partial[O]): Unit = js.native
  }
  /* static members */
  object Plot {
    
    @JSImport("@antv/g2plot/lib/core/plot", "Plot")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * 获取默认的 options 配置项
      * 每个组件都可以复写
      */
    inline def getDefaultOptions(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOptions")().asInstanceOf[Any]
  }
  
  /* Inlined std.Pick<@antv/g2plot.@antv/g2plot/lib/types.Options, 'width' | 'height' | 'padding' | 'appendPadding' | 'renderer' | 'pixelRatio' | 'autoFit' | 'syncViewPadding' | 'supportCSSTransform' | 'limitInPlot' | 'locale' | 'defaultInteractions'> */
  trait PickOptions extends StObject {
    
    var appendPadding: js.UndefOr[js.Array[Double] | Double] = js.undefined
    
    var autoFit: js.UndefOr[Boolean] = js.undefined
    
    var defaultInteractions: js.UndefOr[js.Array[String]] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var limitInPlot: js.UndefOr[Boolean] = js.undefined
    
    var locale: js.UndefOr[String] = js.undefined
    
    var padding: js.UndefOr[js.Array[Double] | Double | auto] = js.undefined
    
    var pixelRatio: js.UndefOr[Double] = js.undefined
    
    var renderer: js.UndefOr[svg | canvas] = js.undefined
    
    var supportCSSTransform: js.UndefOr[Boolean] = js.undefined
    
    var syncViewPadding: js.UndefOr[Boolean | SyncViewPaddingFn] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object PickOptions {
    
    inline def apply(): PickOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PickOptions]
    }
    
    extension [Self <: PickOptions](x: Self) {
      
      inline def setAppendPadding(value: js.Array[Double] | Double): Self = StObject.set(x, "appendPadding", value.asInstanceOf[js.Any])
      
      inline def setAppendPaddingUndefined: Self = StObject.set(x, "appendPadding", js.undefined)
      
      inline def setAppendPaddingVarargs(value: Double*): Self = StObject.set(x, "appendPadding", js.Array(value*))
      
      inline def setAutoFit(value: Boolean): Self = StObject.set(x, "autoFit", value.asInstanceOf[js.Any])
      
      inline def setAutoFitUndefined: Self = StObject.set(x, "autoFit", js.undefined)
      
      inline def setDefaultInteractions(value: js.Array[String]): Self = StObject.set(x, "defaultInteractions", value.asInstanceOf[js.Any])
      
      inline def setDefaultInteractionsUndefined: Self = StObject.set(x, "defaultInteractions", js.undefined)
      
      inline def setDefaultInteractionsVarargs(value: String*): Self = StObject.set(x, "defaultInteractions", js.Array(value*))
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setLimitInPlot(value: Boolean): Self = StObject.set(x, "limitInPlot", value.asInstanceOf[js.Any])
      
      inline def setLimitInPlotUndefined: Self = StObject.set(x, "limitInPlot", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setPadding(value: js.Array[Double] | Double | auto): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setPaddingVarargs(value: Double*): Self = StObject.set(x, "padding", js.Array(value*))
      
      inline def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
      
      inline def setPixelRatioUndefined: Self = StObject.set(x, "pixelRatio", js.undefined)
      
      inline def setRenderer(value: svg | canvas): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
      
      inline def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
      
      inline def setSupportCSSTransform(value: Boolean): Self = StObject.set(x, "supportCSSTransform", value.asInstanceOf[js.Any])
      
      inline def setSupportCSSTransformUndefined: Self = StObject.set(x, "supportCSSTransform", js.undefined)
      
      inline def setSyncViewPadding(value: Boolean | SyncViewPaddingFn): Self = StObject.set(x, "syncViewPadding", value.asInstanceOf[js.Any])
      
      inline def setSyncViewPaddingFunction3(value: (/* chart */ View, /* views */ js.Array[View], /* PC */ PaddingCalCtor) => Unit): Self = StObject.set(x, "syncViewPadding", js.Any.fromFunction3(value))
      
      inline def setSyncViewPaddingUndefined: Self = StObject.set(x, "syncViewPadding", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
