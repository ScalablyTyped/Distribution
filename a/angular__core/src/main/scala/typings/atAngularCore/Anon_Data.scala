package typings.atAngularCore

import org.scalablytyped.runtime.StringDictionary
import typings.atAngularCore.atAngularCoreMod.ViewEncapsulation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  var data: StringDictionary[js.Array[_]]
  var encapsulation: ViewEncapsulation
  var styles: js.Array[String | js.Array[_]]
}

object Anon_Data {
  @scala.inline
  def apply(
    data: StringDictionary[js.Array[_]],
    encapsulation: ViewEncapsulation,
    styles: js.Array[String | js.Array[_]]
  ): Anon_Data = {
    val __obj = js.Dynamic.literal(data = data, encapsulation = encapsulation, styles = styles)
  
    __obj.asInstanceOf[Anon_Data]
  }
}

