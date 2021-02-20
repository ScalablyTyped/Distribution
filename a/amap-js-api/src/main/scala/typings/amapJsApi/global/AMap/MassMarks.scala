package typings.amapJsApi.global.AMap

import typings.amapJsApi.AMap.MassMarks.Data
import typings.amapJsApi.AMap.MassMarks.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("AMap.MassMarks")
@js.native
class MassMarks[D /* <: Data */] protected ()
  extends typings.amapJsApi.AMap.MassMarks[D] {
  def this(data: String, opts: Options) = this()
  /**
    * 海量点类，利用该类可同时在地图上展示万级别的点
    * @param data 点对象数组或url
    * @param opts 选项
    */
  def this(data: js.Array[D], opts: Options) = this()
}
