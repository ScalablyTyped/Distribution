package typings.angularFeatureFlags.mod.featureflags

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlagData extends js.Object {
  /**
    * Boolean value for enabling/disabling the feature
    */
  var active: Boolean = js.native
  /**
    * A long description of the flag to further explain the feature being toggled
    * (only visible in the list of flags)
    */
  var description: String = js.native
  /**
    * Unique key that is used from the markup to resolve whether a flag is active or not.
    */
  var key: String = js.native
  /**
    * A short name of the flag (only visible in the list of flags)
    */
  var name: String = js.native
}

object FlagData {
  @scala.inline
  def apply(active: Boolean, description: String, key: String, name: String): FlagData = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlagData]
  }
  @scala.inline
  implicit class FlagDataOps[Self <: FlagData] (val x: Self) extends AnyVal {
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

