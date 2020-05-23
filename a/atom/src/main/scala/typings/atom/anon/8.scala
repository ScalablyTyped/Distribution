package typings.atom.anon

import typings.atom.atomStrings.`tab alwaysComma enter when suggestion explicitly selected`
import typings.atom.atomStrings.`tab and enter`
import typings.atom.atomStrings.enter
import typings.atom.atomStrings.tab
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `8` extends js.Object {
  var newValue: tab | enter | (`tab and enter`) | (`tab alwaysComma enter when suggestion explicitly selected`)
  var oldValue: js.UndefOr[
    tab | enter | (`tab and enter`) | (`tab alwaysComma enter when suggestion explicitly selected`)
  ] = js.undefined
}

object `8` {
  @scala.inline
  def apply(
    newValue: tab | enter | (`tab and enter`) | (`tab alwaysComma enter when suggestion explicitly selected`),
    oldValue: tab | enter | (`tab and enter`) | (`tab alwaysComma enter when suggestion explicitly selected`) = null
  ): `8` = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
    if (oldValue != null) __obj.updateDynamic("oldValue")(oldValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[`8`]
  }
}

