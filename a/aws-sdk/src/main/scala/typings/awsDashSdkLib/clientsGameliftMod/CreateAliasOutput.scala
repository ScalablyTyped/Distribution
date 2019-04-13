package typings
package awsDashSdkLib.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateAliasOutput extends js.Object {
  /**
    * Object that describes the newly created alias record.
    */
  var Alias: js.UndefOr[Alias] = js.undefined
}

object CreateAliasOutput {
  @scala.inline
  def apply(Alias: Alias = null): CreateAliasOutput = {
    val __obj = js.Dynamic.literal()
    if (Alias != null) __obj.updateDynamic("Alias")(Alias)
    __obj.asInstanceOf[CreateAliasOutput]
  }
}

