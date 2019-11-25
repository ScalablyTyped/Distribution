package typings.angularfire

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AngularFireSimpleObject
  extends /* key */ StringDictionary[js.Any] {
  @JSName("$id")
  var $id: String
  @JSName("$priority")
  var $priority: Double
  @JSName("$value")
  var $value: js.Any
}

object AngularFireSimpleObject {
  @scala.inline
  def apply(
    $id: String,
    $priority: Double,
    $value: js.Any,
    StringDictionary: /* key */ StringDictionary[js.Any] = null
  ): AngularFireSimpleObject = {
    val __obj = js.Dynamic.literal($id = $id.asInstanceOf[js.Any], $priority = $priority.asInstanceOf[js.Any], $value = $value.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AngularFireSimpleObject]
  }
}

