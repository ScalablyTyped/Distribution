package typings.antvG2plot.mod

import typings.antvG2plot.anon.PartialColumnOptions
import typings.antvG2plot.columnTypesMod.ColumnOptions
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/g2plot", "Column")
@js.native
open class Column protected ()
  extends typings.antvG2plot.columnMod.Column {
  def this(container: String, options: ColumnOptions) = this()
  def this(container: HTMLElement, options: ColumnOptions) = this()
}
/* static members */
object Column {
  
  @JSImport("@antv/g2plot", "Column")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * 获取 柱形图 默认配置项
    * 供外部使用
    */
  inline def getDefaultOptions(): PartialColumnOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOptions")().asInstanceOf[PartialColumnOptions]
}
