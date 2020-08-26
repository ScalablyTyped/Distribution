package typings.angular.angular

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * RouteData is an immutable map of additional data you can configure in your Route.
  * You can inject RouteData into the constructor of a component to use it.
  */
@js.native
trait RouteData extends js.Object {
  var data: StringDictionary[js.Any] = js.native
  def get(key: String): js.Any = js.native
}

object RouteData {
  @scala.inline
  def apply(data: StringDictionary[js.Any], get: String => js.Any): RouteData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[RouteData]
  }
  @scala.inline
  implicit class RouteDataOps[Self <: RouteData] (val x: Self) extends AnyVal {
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
    def setData(value: StringDictionary[js.Any]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setGet(value: String => js.Any): Self = this.set("get", js.Any.fromFunction1(value))
  }
  
}

