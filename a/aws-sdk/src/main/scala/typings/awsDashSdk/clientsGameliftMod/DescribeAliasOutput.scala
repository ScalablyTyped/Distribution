package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAliasOutput extends js.Object {
  /**
    * The requested alias resource.
    */
  var Alias: js.UndefOr[typings.awsDashSdk.clientsGameliftMod.Alias] = js.native
}

object DescribeAliasOutput {
  @scala.inline
  def apply(Alias: Alias = null): DescribeAliasOutput = {
    val __obj = js.Dynamic.literal()
    if (Alias != null) __obj.updateDynamic("Alias")(Alias.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAliasOutput]
  }
}

