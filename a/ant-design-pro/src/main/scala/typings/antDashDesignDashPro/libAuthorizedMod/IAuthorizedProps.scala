package typings.antDashDesignDashPro.libAuthorizedMod

import typings.antDashDesignDashPro.libAuthorizedAuthorizedRouteMod.authority
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAuthorizedProps extends js.Object {
  var authority: typings.antDashDesignDashPro.libAuthorizedAuthorizedRouteMod.authority
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

