package typings.antvDataSet

import typings.antvDataSet.anon.GEO
import typings.antvDataSet.anon.TypeofDataSet
import typings.antvDataSet.anon.TypeofView
import typings.antvDataSet.dataSetMod.DataSet
import typings.antvDataSet.dataSetMod.DataSetOptions
import typings.antvDataSet.viewMod.View
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object libMod {
  
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
  val ^ : js.Any = js.native
  
  /**
    * 常量，譬如 DataSet.CONSTANTS.HIERARCHY 是树形结构的名称
    */
  @JSImport("@antv/data-set/lib", "CONSTANTS")
  @js.native
  def CONSTANTS: GEO = js.native
  @scala.inline
  def CONSTANTS_=(x: GEO): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONSTANTS")(x.asInstanceOf[js.Any])
  
  @JSImport("@antv/data-set/lib", "DataSet")
  @js.native
  def DataSet: TypeofDataSet = js.native
  @scala.inline
  def DataSet_=(x: TypeofDataSet): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DataSet")(x.asInstanceOf[js.Any])
  
  @JSImport("@antv/data-set/lib", "DataView")
  @js.native
  def DataView: TypeofView = js.native
  @scala.inline
  def DataView_=(x: TypeofView): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DataView")(x.asInstanceOf[js.Any])
  
  @JSImport("@antv/data-set/lib", "View")
  @js.native
  def View: TypeofView = js.native
  @scala.inline
  def View_=(x: TypeofView): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("View")(x.asInstanceOf[js.Any])
  
  /**
    * 注册的 Connector（key-value 对）
    */
  @JSImport("@antv/data-set/lib", "connectors")
  @js.native
  def connectors: Record[String, js.Any] = js.native
  @scala.inline
  def connectors_=(x: Record[String, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("connectors")(x.asInstanceOf[js.Any])
  
  @JSImport("@antv/data-set/lib", "getConnector")
  @js.native
  def getConnector(name: String): js.Function = js.native
  
  @JSImport("@antv/data-set/lib", "getTransform")
  @js.native
  def getTransform(): js.Function = js.native
  @JSImport("@antv/data-set/lib", "getTransform")
  @js.native
  def getTransform(name: String): js.Function = js.native
  
  /**
    * 注册一个数据连接函数，注册后所有数据视图都可以使用 name 来引用这个数据连接函数，从而接入某种数据源。
    * @param name - 类型
    * @param connector - 解析逻辑
    */
  @JSImport("@antv/data-set/lib", "registerConnector")
  @js.native
  def registerConnector(name: String, connector: js.Function3[/* data */ js.Any, /* options */ js.Any, /* view */ View, _]): Unit = js.native
  
  /**
    * 注册一个数据处理函数，注册后所有数据视图都可以使用 name 来引用这个数据处理函数，从而进行某种数据处理
    * @param name - transform 类型
    * @param transform - transform逻辑
    */
  @JSImport("@antv/data-set/lib", "registerTransform")
  @js.native
  def registerTransform(name: String, transform: js.Any): Unit = js.native
  
  /**
    * 已注册的 Transform（key-value 对）
    */
  @JSImport("@antv/data-set/lib", "transforms")
  @js.native
  def transforms: Record[String, js.Any] = js.native
  @scala.inline
  def transforms_=(x: Record[String, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("transforms")(x.asInstanceOf[js.Any])
  
  @JSImport("@antv/data-set/lib", "version")
  @js.native
  def version: String = js.native
  @scala.inline
  def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
}
