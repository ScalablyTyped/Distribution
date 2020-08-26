package typings.apolloEngineReporting.anon

import typings.apolloEngineReporting.agentMod.SendValuesBaseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExceptNames extends SendValuesBaseOptions {
  var exceptNames: js.Array[String] = js.native
}

object ExceptNames {
  @scala.inline
  def apply(exceptNames: js.Array[String]): ExceptNames = {
    val __obj = js.Dynamic.literal(exceptNames = exceptNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExceptNames]
  }
  @scala.inline
  implicit class ExceptNamesOps[Self <: ExceptNames] (val x: Self) extends AnyVal {
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
    def setExceptNamesVarargs(value: String*): Self = this.set("exceptNames", js.Array(value :_*))
    @scala.inline
    def setExceptNames(value: js.Array[String]): Self = this.set("exceptNames", value.asInstanceOf[js.Any])
  }
  
}

