package typings.algoliaClientSearch.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HasPendingMappingsResponse extends js.Object {
  /**
    * Describe cluster pending (migrating, creating, deleting) mapping state.
    */
  var clusters: js.UndefOr[StringDictionary[js.Array[String]]] = js.native
  /**
    * If there is any clusters with pending mapping state.
    */
  var pending: Boolean = js.native
}

object HasPendingMappingsResponse {
  @scala.inline
  def apply(pending: Boolean): HasPendingMappingsResponse = {
    val __obj = js.Dynamic.literal(pending = pending.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasPendingMappingsResponse]
  }
  @scala.inline
  implicit class HasPendingMappingsResponseOps[Self <: HasPendingMappingsResponse] (val x: Self) extends AnyVal {
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
    def setPending(value: Boolean): Self = this.set("pending", value.asInstanceOf[js.Any])
    @scala.inline
    def setClusters(value: StringDictionary[js.Array[String]]): Self = this.set("clusters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClusters: Self = this.set("clusters", js.undefined)
  }
  
}

