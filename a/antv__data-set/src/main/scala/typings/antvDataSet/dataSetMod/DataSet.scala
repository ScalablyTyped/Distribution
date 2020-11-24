package typings.antvDataSet.dataSetMod

import typings.antvDataSet.anon.GEO
import typings.antvDataSet.anon.TypeofDataSet
import typings.antvDataSet.anon.TypeofView
import typings.antvDataSet.viewMod.View
import typings.antvDataSet.viewMod.ViewOptions
import typings.std.Record
import typings.wolfy87Eventemitter.mod.Wolfy87EventEmitter.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/data-set/lib/data-set", "DataSet")
@js.native
/**
  * @param initialProps - 初始状态
  */
class DataSet () extends EventEmitter {
  def this(initialProps: DataSetOptions) = this()
  
  var _getUniqueViewName: js.Any = js.native
  
  var _onChangeTimer: js.Any = js.native
  
  def createView(): View = js.native
  def createView(name: js.UndefOr[scala.Nothing], options: ViewOptions): View = js.native
  def createView(name: String): View = js.native
  def createView(name: String, options: ViewOptions): View = js.native
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
  var state: Record[String, _] = js.native
  
  /**
    * 所有挂在数据集上的数据视图（key-value 对）
    */
  var views: Record[String, View] = js.native
}
/* static members */
@JSImport("@antv/data-set/lib/data-set", "DataSet")
@js.native
object DataSet extends js.Object {
  
  /**
    * 常量，譬如 DataSet.CONSTANTS.HIERARCHY 是树形结构的名称
    */
  var CONSTANTS: GEO = js.native
  
  var DataSet: TypeofDataSet = js.native
  
  var DataView: TypeofView = js.native
  
  var View: TypeofView = js.native
  
  /**
    * 注册的 Connector（key-value 对）
    */
  var connectors: Record[String, _] = js.native
  
  def getConnector(name: String): js.Function = js.native
  
  def getTransform(): js.Function = js.native
  def getTransform(name: String): js.Function = js.native
  
  /**
    * 注册一个数据连接函数，注册后所有数据视图都可以使用 name 来引用这个数据连接函数，从而接入某种数据源。
    * @param name - 类型
    * @param connector - 解析逻辑
    */
  def registerConnector(name: String, connector: js.Function3[/* data */ js.Any, /* options */ js.Any, /* view */ View, _]): Unit = js.native
  
  /**
    * 注册一个数据处理函数，注册后所有数据视图都可以使用 name 来引用这个数据处理函数，从而进行某种数据处理
    * @param name - transform 类型
    * @param transform - transform逻辑
    */
  def registerTransform(name: String, transform: js.Any): Unit = js.native
  
  /**
    * 已注册的 Transform（key-value 对）
    */
  var transforms: Record[String, _] = js.native
  
  var version: String = js.native
}
