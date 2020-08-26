package typings.argv.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait args extends js.Object {
  var options: StringDictionary[js.Any] = js.native
  var targets: js.Array[String] = js.native
}

object args {
  @scala.inline
  def apply(options: StringDictionary[js.Any], targets: js.Array[String]): args = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], targets = targets.asInstanceOf[js.Any])
    __obj.asInstanceOf[args]
  }
  @scala.inline
  implicit class argsOps[Self <: args] (val x: Self) extends AnyVal {
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
    def setOptions(value: StringDictionary[js.Any]): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetsVarargs(value: String*): Self = this.set("targets", js.Array(value :_*))
    @scala.inline
    def setTargets(value: js.Array[String]): Self = this.set("targets", value.asInstanceOf[js.Any])
  }
  
}

