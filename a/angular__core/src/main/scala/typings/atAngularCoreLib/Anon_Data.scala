package typings
package atAngularCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  var data: org.scalablytyped.runtime.StringDictionary[js.Array[_]]
  var encapsulation: atAngularCoreLib.srcMetadataViewMod.ViewEncapsulation
  var styles: js.Array[java.lang.String | js.Array[_]]
}

object Anon_Data {
  @scala.inline
  def apply(
    data: org.scalablytyped.runtime.StringDictionary[js.Array[_]],
    encapsulation: atAngularCoreLib.srcMetadataViewMod.ViewEncapsulation,
    styles: js.Array[java.lang.String | js.Array[_]]
  ): Anon_Data = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("encapsulation")(encapsulation)
    __obj.updateDynamic("styles")(styles)
    __obj.asInstanceOf[Anon_Data]
  }
}

