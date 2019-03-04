package typings
package aqbLib.aqbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpsertRetInsertRetUpdateRet extends js.Object {
  var in: js.Function1[/* inCollection */ js.Any, UpsertExpression]
  var in_ : js.Function1[/* inCollection */ js.Any, UpsertExpression]
  def into(inCollection: js.Any): UpsertExpression
}

object UpsertRetInsertRetUpdateRet {
  @scala.inline
  def apply(
    in: js.Function1[/* inCollection */ js.Any, UpsertExpression],
    in_ : js.Function1[/* inCollection */ js.Any, UpsertExpression],
    into: js.Function1[js.Any, UpsertExpression]
  ): UpsertRetInsertRetUpdateRet = {
    val __obj = js.Dynamic.literal(in = in, in_ = in_, into = into)
  
    __obj.asInstanceOf[UpsertRetInsertRetUpdateRet]
  }
}

