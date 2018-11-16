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

