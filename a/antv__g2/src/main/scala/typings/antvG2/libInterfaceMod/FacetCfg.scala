package typings.antvG2.libInterfaceMod

import typings.antvG2.libChartViewMod.View
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FacetCfg[D] extends StObject {
  
  /**
    * @title view 创建回调。
    */
  def eachView(innerView: View): Any = js.native
  def eachView(innerView: View, facet: D): Any = js.native
  
  /**
    * @title facet 数据划分维度。
    */
  val fields: js.Array[String] = js.native
  
  /**
    * @title facet view padding。
    */
  val padding: js.UndefOr[ViewPadding] = js.native
  
  /**
    * @title 是否显示标题。
    */
  val showTitle: js.UndefOr[Boolean] = js.native
  
  /**
    * @title 分面 view 之间的间隔， 百分比或像素值
    */
  val spacing: js.UndefOr[js.Tuple2[Double | String, Double | String]] = js.native
  
  /**
    * @title 布局类型。
    */
  val `type`: js.UndefOr[String] = js.native
}
