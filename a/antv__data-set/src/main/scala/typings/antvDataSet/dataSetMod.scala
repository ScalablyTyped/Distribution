package typings.antvDataSet

import typings.antvDataSet.anon.GEO
import typings.antvDataSet.anon.TypeofDataSet
import typings.antvDataSet.anon.TypeofView
import typings.antvDataSet.viewMod.View
import typings.antvDataSet.viewMod.ViewOptions
import typings.std.Record
import typings.wolfy87Eventemitter.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataSetMod {
  
  @JSImport("@antv/data-set/lib/data-set", "DataSet")
  @js.native
  /**
    * @param initialProps - 初始状态
    */
  class DataSet () extends ^ {
    def this(initialProps: DataSetOptions) = this()
    
    var _getUniqueViewName: js.Any = js.native
    
    var _onChangeTimer: js.Any = js.native
    
    def createView(): View = js.native
    def createView(name: String): View = js.native
    def createView(name: String, options: ViewOptions): View = js.native
    def createView(name: Unit, options: ViewOptions): View = js.native
    /**
      * 创建并返回一个数据视图实例
      * @param name - 数据视图名称
      * @param options - 视图配置
      */
    def createView(name: ViewOptions): View = js.native
    
    /**
      * 返回 name 对应的数据视图实例
      * @param name - name
      */
    def getView(name: String): View = js.native
    
    /**
      * 否是 DataSet
      */
    var isDataSet: Boolean = js.native
    
    /**
      * 设置状态量 name 的值为 value
      * @param name - 状态名
      * @param value - 值
      */
    def setState(name: String, value: js.Any): Unit = js.native
    
    /**
      * 设置 name 对应的数据视图实例为 dv
      * @param name - 名称
      * @param view - data view
      */
    def setView(name: String, view: View): Unit = js.native
    
    /**
      * 存储数据集上的状态量（key-value 对）
      */
    var state: Record[String, js.Any] = js.native
    
    /**
      * 所有挂在数据集上的数据视图（key-value 对）
      */
    var views: Record[String, View] = js.native
  }
  /* static members */
  object DataSet {
    
    @JSImport("@antv/data-set/lib/data-set", "DataSet")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * 常量，譬如 DataSet.CONSTANTS.HIERARCHY 是树形结构的名称
      */
    @JSImport("@antv/data-set/lib/data-set", "DataSet.CONSTANTS")
    @js.native
    def CONSTANTS: GEO = js.native
    @scala.inline
    def CONSTANTS_=(x: GEO): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONSTANTS")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/data-set/lib/data-set", "DataSet.DataSet")
    @js.native
    def DataSet: TypeofDataSet = js.native
    @scala.inline
    def DataSet_=(x: TypeofDataSet): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DataSet")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/data-set/lib/data-set", "DataSet.DataView")
    @js.native
    def DataView: TypeofView = js.native
    @scala.inline
    def DataView_=(x: TypeofView): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DataView")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/data-set/lib/data-set", "DataSet.View")
    @js.native
    def View: TypeofView = js.native
    @scala.inline
    def View_=(x: TypeofView): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("View")(x.asInstanceOf[js.Any])
    
    /**
      * 注册的 Connector（key-value 对）
      */
    @JSImport("@antv/data-set/lib/data-set", "DataSet.connectors")
    @js.native
    def connectors: Record[String, js.Any] = js.native
    @scala.inline
    def connectors_=(x: Record[String, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("connectors")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def getConnector(name: String): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("getConnector")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function]
    
    @scala.inline
    def getTransform(): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("getTransform")().asInstanceOf[js.Function]
    @scala.inline
    def getTransform(name: String): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("getTransform")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function]
    
    /**
      * 注册一个数据连接函数，注册后所有数据视图都可以使用 name 来引用这个数据连接函数，从而接入某种数据源。
      * @param name - 类型
      * @param connector - 解析逻辑
      */
    @scala.inline
    def registerConnector(
      name: String,
      connector: js.Function3[/* data */ js.Any, /* options */ js.Any, /* view */ View, js.Any]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerConnector")(name.asInstanceOf[js.Any], connector.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * 注册一个数据处理函数，注册后所有数据视图都可以使用 name 来引用这个数据处理函数，从而进行某种数据处理
      * @param name - transform 类型
      * @param transform - transform逻辑
      */
    @scala.inline
    def registerTransform(name: String, transform: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerTransform")(name.asInstanceOf[js.Any], transform.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * 已注册的 Transform（key-value 对）
      */
    @JSImport("@antv/data-set/lib/data-set", "DataSet.transforms")
    @js.native
    def transforms: Record[String, js.Any] = js.native
    @scala.inline
    def transforms_=(x: Record[String, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("transforms")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/data-set/lib/data-set", "DataSet.version")
    @js.native
    def version: String = js.native
    @scala.inline
    def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
  }
  
  trait DataSetOptions extends StObject {
    
    var state: Record[String, js.Any]
  }
  object DataSetOptions {
    
    @scala.inline
    def apply(state: Record[String, js.Any]): DataSetOptions = {
      val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataSetOptions]
    }
    
    @scala.inline
    implicit class DataSetOptionsMutableBuilder[Self <: DataSetOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setState(value: Record[String, js.Any]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
}
