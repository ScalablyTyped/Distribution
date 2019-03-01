package typings
package aqbLib.aqbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplaceRetWithRet extends js.Object {
  var in: js.Function1[/* collection */ js.Any, ReplaceExpression]
  var `in_`: js.Function1[/* collection */ js.Any, ReplaceExpression]
  def into(collection: js.Any): ReplaceExpression
  def `with`(collection: js.Any): ReplaceRetWithRet
}

object ReplaceRetWithRet {
  @scala.inline
  def apply(
    in: js.Function1[/* collection */ js.Any, ReplaceExpression],
    `in_`: js.Function1[/* collection */ js.Any, ReplaceExpression],
    into: js.Function1[js.Any, ReplaceExpression],
    `with`: js.Function1[js.Any, ReplaceRetWithRet]
  ): ReplaceRetWithRet = {
    val __obj = js.Dynamic.literal(`in_` = `in_`, `with` = `with`)
    __obj.updateDynamic("in")(in)
    __obj.updateDynamic("into")(into)
    __obj.asInstanceOf[ReplaceRetWithRet]
  }
}

