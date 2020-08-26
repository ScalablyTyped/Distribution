package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FetchResourcesResult extends Object {
  /**
    * The next entry index if the current result set doesn't contain all results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#FetchResourcesResult)
    */
  var nextStart: Double = js.native
  /**
    * The fetched resources.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#FetchResourcesResult)
    */
  var resources: js.Array[FetchResource] = js.native
  /**
    * The total number of results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#FetchResourcesResult)
    */
  var total: Double = js.native
}

object FetchResourcesResult {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    nextStart: Double,
    propertyIsEnumerable: PropertyKey => Boolean,
    resources: js.Array[FetchResource],
    total: Double
  ): FetchResourcesResult = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), nextStart = nextStart.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), resources = resources.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchResourcesResult]
  }
  @scala.inline
  implicit class FetchResourcesResultOps[Self <: FetchResourcesResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNextStart(value: Double): Self = this.set("nextStart", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourcesVarargs(value: FetchResource*): Self = this.set("resources", js.Array(value :_*))
    @scala.inline
    def setResources(value: js.Array[FetchResource]): Self = this.set("resources", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotal(value: Double): Self = this.set("total", value.asInstanceOf[js.Any])
  }
  
}

