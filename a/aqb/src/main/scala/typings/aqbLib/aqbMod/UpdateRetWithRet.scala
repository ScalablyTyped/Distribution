package typings
package aqbLib.aqbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateRetWithRet extends js.Object {
  var in: js.Function1[/* collection */ js.Any, UpdateExpression]
  var in_ : js.Function1[/* collection */ js.Any, UpdateExpression]
  def into(collection: js.Any): UpdateExpression
  def `with`(collection: js.Any): UpdateRetWithRet
}

object UpdateRetWithRet {
  @scala.inline
  def apply(
    in: js.Function1[/* collection */ js.Any, UpdateExpression],
    in_ : js.Function1[/* collection */ js.Any, UpdateExpression],
    into: js.Function1[js.Any, UpdateExpression],
    `with`: js.Function1[js.Any, UpdateRetWithRet]
  ): UpdateRetWithRet = {
    val __obj = js.Dynamic.literal(in = in, in_ = in_, into = into)
    __obj.updateDynamic("with")(`with`)
    __obj.asInstanceOf[UpdateRetWithRet]
  }
}

