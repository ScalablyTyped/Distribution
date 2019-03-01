package typings
package aqbLib.aqbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveRet extends js.Object {
  var in: js.Function1[/* collection */ js.Any, RemoveExpression]
  var `in_`: js.Function1[/* collection */ js.Any, RemoveExpression]
  def into(collection: js.Any): RemoveExpression
}

object RemoveRet {
  @scala.inline
  def apply(
    in: js.Function1[/* collection */ js.Any, RemoveExpression],
    `in_`: js.Function1[/* collection */ js.Any, RemoveExpression],
    into: js.Function1[js.Any, RemoveExpression]
  ): RemoveRet = {
    val __obj = js.Dynamic.literal(`in_` = `in_`)
    __obj.updateDynamic("in")(in)
    __obj.updateDynamic("into")(into)
    __obj.asInstanceOf[RemoveRet]
  }
}

