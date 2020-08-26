package typings.angularCore.anon

import org.scalablytyped.runtime.StringDictionary
import typings.angularCore.mod.ViewEncapsulation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Data extends js.Object {
  var data: StringDictionary[js.Array[_]] = js.native
  var encapsulation: ViewEncapsulation = js.native
  var styles: js.Array[String | js.Array[_]] = js.native
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
  @scala.inline
  implicit class DataOps[Self <: Data] (val x: Self) extends AnyVal {
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
    def setData(value: StringDictionary[js.Array[_]]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setEncapsulation(value: ViewEncapsulation): Self = this.set("encapsulation", value.asInstanceOf[js.Any])
    @scala.inline
    def setStylesVarargs(value: (String | js.Array[js.Any])*): Self = this.set("styles", js.Array(value :_*))
    @scala.inline
    def setStyles(value: js.Array[String | js.Array[_]]): Self = this.set("styles", value.asInstanceOf[js.Any])
  }
  
}

