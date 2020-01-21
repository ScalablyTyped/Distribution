package typings.antDesignPro.authorizedMod

import typings.antDesignPro.authorizedRouteMod.authority
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAuthorizedProps extends js.Object {
  var authority: typings.antDesignPro.authorizedRouteMod.authority
  var noMatch: js.UndefOr[ReactNode] = js.undefined
}

object IAuthorizedProps {
  @scala.inline
  def apply(authority: authority, noMatch: ReactNode = null): IAuthorizedProps = {
    val __obj = js.Dynamic.literal(authority = authority.asInstanceOf[js.Any])
    if (noMatch != null) __obj.updateDynamic("noMatch")(noMatch.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAuthorizedProps]
  }
}

