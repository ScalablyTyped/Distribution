package typings
package avaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Args[Args /* <: js.Array[_] */] extends js.Object {
  var title: js.UndefOr[
    js.Function2[/* providedTitle */ js.UndefOr[java.lang.String], /* args */ Args, java.lang.String]
  ] = js.undefined
}

object Anon_Args {
  @scala.inline
  def apply[Args /* <: js.Array[_] */](
    title: (/* providedTitle */ js.UndefOr[java.lang.String], /* args */ Args) => java.lang.String = null
  ): Anon_Args[Args] = {
    val __obj = js.Dynamic.literal()
    if (title != null) __obj.updateDynamic("title")(js.Any.fromFunction2(title))
    __obj.asInstanceOf[Anon_Args[Args]]
  }
}

