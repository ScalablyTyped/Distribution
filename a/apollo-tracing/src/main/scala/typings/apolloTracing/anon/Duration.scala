package typings.apolloTracing.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Duration extends js.Object {
  var duration: Double = js.native
  var fieldName: String = js.native
  var parentType: String = js.native
  var path: js.Array[String | Double] = js.native
  var returnType: String = js.native
  var startOffset: Double = js.native
}

object Duration {
  @scala.inline
  def apply(
    duration: Double,
    fieldName: String,
    parentType: String,
    path: js.Array[String | Double],
    returnType: String,
    startOffset: Double
  ): Duration = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], fieldName = fieldName.asInstanceOf[js.Any], parentType = parentType.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any], startOffset = startOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Duration]
  }
  @scala.inline
  implicit class DurationOps[Self <: Duration] (val x: Self) extends AnyVal {
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
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def setFieldName(value: String): Self = this.set("fieldName", value.asInstanceOf[js.Any])
    @scala.inline
    def setParentType(value: String): Self = this.set("parentType", value.asInstanceOf[js.Any])
    @scala.inline
    def setPathVarargs(value: (String | Double)*): Self = this.set("path", js.Array(value :_*))
    @scala.inline
    def setPath(value: js.Array[String | Double]): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturnType(value: String): Self = this.set("returnType", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartOffset(value: Double): Self = this.set("startOffset", value.asInstanceOf[js.Any])
  }
  
}

