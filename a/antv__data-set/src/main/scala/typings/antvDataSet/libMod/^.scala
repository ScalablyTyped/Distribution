package typings.antvDataSet.libMod

import typings.antvDataSet.anon.GEO
import typings.antvDataSet.anon.TypeofDataSet
import typings.antvDataSet.anon.TypeofView
import typings.antvDataSet.dataSetMod.DataSet
import typings.antvDataSet.dataSetMod.DataSetOptions
import typings.antvDataSet.viewMod.View
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/data-set/lib", JSImport.Namespace)
@js.native
/**
  * @param initialProps - 初始状态
  */
class ^ () extends DataSet {
  def this(initialProps: DataSetOptions) = this()
}
@JSImport("@antv/data-set/lib", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
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
