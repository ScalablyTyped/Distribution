package typings.awsDashSdk.clientsPollyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListLexiconsInput extends js.Object {
  /**
    * An opaque pagination token returned from previous ListLexicons operation. If present, indicates where to continue the list of lexicons.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsPollyMod.NextToken] = js.native
}

object ListLexiconsInput {
  @scala.inline
  def apply(NextToken: NextToken = null): ListLexiconsInput = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListLexiconsInput]
  }
}

