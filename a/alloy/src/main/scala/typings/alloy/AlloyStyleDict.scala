package typings.alloy

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Properties and TSS classes to apply to a Titanium UI element.
  */
@js.native
trait AlloyStyleDict
  extends /* key */ StringDictionary[js.Any] {
  /**
    * Array of TSS classes to apply to the Titanium UI object.
    */
  var classes: js.UndefOr[js.Array[String] | String] = js.native
  /**
    * TSS ID style to apply to the Titanium UI object.
    */
  var id: js.UndefOr[String] = js.native
}

object AlloyStyleDict {
  @scala.inline
  def apply(): AlloyStyleDict = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlloyStyleDict]
  }
  @scala.inline
  implicit class AlloyStyleDictOps[Self <: AlloyStyleDict] (val x: Self) extends AnyVal {
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
    def setClassesVarargs(value: String*): Self = this.set("classes", js.Array(value :_*))
    @scala.inline
    def setClasses(value: js.Array[String] | String): Self = this.set("classes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClasses: Self = this.set("classes", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
  }
  
}

