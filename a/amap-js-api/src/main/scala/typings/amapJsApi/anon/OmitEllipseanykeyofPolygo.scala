package typings.amapJsApi.anon

import typings.amapJsApi.AMap.LngLat
import typings.amapJsApi.AMap.LocationValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined amap-js-api.AMap.Omit<amap-js-api.AMap.Ellipse<any>, keyof amap-js-api.AMap.Polygon<any>> */
@js.native
trait OmitEllipseanykeyofPolygo extends js.Object {
  
  def getCenter(): js.UndefOr[LngLat] = js.native
  @JSName("getCenter")
  var getCenter_Original: js.Function0[js.UndefOr[LngLat]] = js.native
  
  def getRadius(): js.Tuple2[Double, Double] = js.native
  @JSName("getRadius")
  var getRadius_Original: js.Function0[js.Tuple2[Double, Double]] = js.native
  
  def setCenter(center: LocationValue): Unit = js.native
  def setCenter(center: LocationValue, preventEvent: Boolean): Unit = js.native
  @JSName("setCenter")
  var setCenter_Original: js.Function2[/* center */ LocationValue, /* preventEvent */ js.UndefOr[Boolean], Unit] = js.native
  
  def setRadius(radius: js.Tuple2[Double, Double]): Unit = js.native
  def setRadius(radius: js.Tuple2[Double, Double], preventEvent: Boolean): Unit = js.native
  @JSName("setRadius")
  var setRadius_Original: js.Function2[/* radius */ js.Tuple2[Double, Double], /* preventEvent */ js.UndefOr[Boolean], Unit] = js.native
}
