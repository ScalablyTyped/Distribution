package typings.angularCore.anon

import org.scalablytyped.runtime.StringDictionary
import typings.angularCore.mod.ViewEncapsulation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends js.Object {
  var data: StringDictionary[js.Array[_]]
  var encapsulation: ViewEncapsulation
  var styles: js.Array[String | js.Array[_]]
}

object Data {
  @scala.inline
  def apply(
    data: StringDictionary[js.Array[_]],
    encapsulation: ViewEncapsulation,
    styles: js.Array[String | js.Array[_]]
  ): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], encapsulation = encapsulation.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
}

