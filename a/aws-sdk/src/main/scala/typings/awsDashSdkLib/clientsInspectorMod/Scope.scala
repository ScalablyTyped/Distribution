package typings
package awsDashSdkLib.clientsInspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Scope extends js.Object {
  /**
    * The type of the scope.
    */
  var key: js.UndefOr[ScopeType] = js.undefined
  /**
    * The resource identifier for the specified scope type.
    */
  var value: js.UndefOr[ScopeValue] = js.undefined
}

object Scope {
  @scala.inline
  def apply(key: ScopeType = null, value: ScopeValue = null): Scope = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Scope]
  }
}

