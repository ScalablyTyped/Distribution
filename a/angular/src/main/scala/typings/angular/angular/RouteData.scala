package typings.angular.angular

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * RouteData is an immutable map of additional data you can configure in your Route.
  * You can inject RouteData into the constructor of a component to use it.
  */
trait RouteData extends js.Object {
  var data: StringDictionary[js.Any]
  def get(key: String): js.Any
}

object RouteData {
  @scala.inline
  def apply(data: StringDictionary[js.Any], get: String => js.Any): RouteData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], get = js.Any.fromFunction1(get))
  
    __obj.asInstanceOf[RouteData]
  }
}

