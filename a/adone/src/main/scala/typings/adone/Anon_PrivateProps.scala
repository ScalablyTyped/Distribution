package typings.adone

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PrivateProps extends js.Object {
  var privateProps: js.UndefOr[Boolean] = js.undefined
}

object Anon_PrivateProps {
  @scala.inline
  def apply(privateProps: js.UndefOr[Boolean] = js.undefined): Anon_PrivateProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(privateProps)) __obj.updateDynamic("privateProps")(privateProps)
    __obj.asInstanceOf[Anon_PrivateProps]
  }
}

