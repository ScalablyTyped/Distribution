package typings
package angularfireLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AngularFireSimpleObject
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  @JSName("$id")
  var $id: java.lang.String
  @JSName("$priority")
  var $priority: scala.Double
  @JSName("$value")
  var $value: js.Any
}

object AngularFireSimpleObject {
  @scala.inline
  def apply(
    $id: java.lang.String,
    $priority: scala.Double,
    $value: js.Any,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): AngularFireSimpleObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("$id")($id)
    __obj.updateDynamic("$priority")($priority)
    __obj.updateDynamic("$value")($value)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AngularFireSimpleObject]
  }
}

