package typings
package awsDashSdkLib.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeAliasOutput extends js.Object {
  /**
    * Object that contains the requested alias.
    */
  var Alias: js.UndefOr[Alias] = js.undefined
}

object DescribeAliasOutput {
  @scala.inline
  def apply(Alias: Alias = null): DescribeAliasOutput = {
    val __obj = js.Dynamic.literal()
    if (Alias != null) __obj.updateDynamic("Alias")(Alias)
    __obj.asInstanceOf[DescribeAliasOutput]
  }
}

