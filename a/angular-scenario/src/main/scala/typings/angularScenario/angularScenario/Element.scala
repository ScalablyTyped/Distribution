package typings.angularScenario.angularScenario

import typings.angular.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Element extends js.Object {
  def attr(key: js.Any): Future = js.native
  def attr(key: js.Any, value: js.Any): Unit = js.native
  def click(): js.Any = js.native
  def count(): Future = js.native
  def css(key: js.Any): Future = js.native
  def css(key: js.Any, value: js.Any): Unit = js.native
  def dblclick(): js.Any = js.native
  def height(): Future = js.native
  def height(value: js.Any): Unit = js.native
  def html(): Future = js.native
  def html(value: js.Any): Unit = js.native
  def innerHeight(): Future = js.native
  def innerHeight(value: js.Any): Unit = js.native
  def innerWidth(): Future = js.native
  def innerWidth(value: js.Any): Unit = js.native
  def mousedown(): js.Any = js.native
  def mouseover(): js.Any = js.native
  def mouseup(): js.Any = js.native
  def offset(): Future = js.native
  def offset(value: js.Any): Unit = js.native
  def outerHeight(): Future = js.native
  def outerHeight(value: js.Any): Unit = js.native
  def outerWidth(): Future = js.native
  def outerWidth(value: js.Any): Unit = js.native
  def position(): Future = js.native
  def position(value: js.Any): Unit = js.native
  def prop(key: js.Any): Future = js.native
  def prop(key: js.Any, value: js.Any): Unit = js.native
  def query(
    callback: js.Function2[
      /* selectedDOMElements */ JQuery, 
      /* callbackWhenDone */ js.Function2[/* objNull */ js.Any, /* futureValue */ js.Any, _], 
      _
    ]
  ): js.Any = js.native
  def scrollLeft(): Future = js.native
  def scrollLeft(value: js.Any): Unit = js.native
  def scrollTop(): Future = js.native
  def scrollTop(value: js.Any): Unit = js.native
  def text(): Future = js.native
  def text(value: js.Any): Unit = js.native
  def `val`(): Future = js.native
  def `val`(value: js.Any): Unit = js.native
  def width(): Future = js.native
  def width(value: js.Any): Unit = js.native
}

