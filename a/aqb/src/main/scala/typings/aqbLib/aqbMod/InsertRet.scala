package typings
package aqbLib.aqbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsertRet extends js.Object {
  var in: js.Function1[/* collection */ js.Any, InsertExpression]
  var `in_`: js.Function1[/* collection */ js.Any, InsertExpression]
  def into(collection: js.Any): InsertExpression
}

object InsertRet {
  @scala.inline
  def apply(
    in: js.Function1[/* collection */ js.Any, InsertExpression],
    `in_`: js.Function1[/* collection */ js.Any, InsertExpression],
    into: js.Function1[js.Any, InsertExpression]
  ): InsertRet = {
    val __obj = js.Dynamic.literal(`in_` = `in_`)
    __obj.updateDynamic("in")(in)
    __obj.updateDynamic("into")(into)
    __obj.asInstanceOf[InsertRet]
  }
}

