package typings
package apolloDashClientLib.coreTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MutationQueryReducersMap[T]
  extends /* queryName */ org.scalablytyped.runtime.StringDictionary[MutationQueryReducer[T]]

object MutationQueryReducersMap {
  @scala.inline
  def apply[T](
    StringDictionary: /* queryName */ org.scalablytyped.runtime.StringDictionary[MutationQueryReducer[T]] = null
  ): MutationQueryReducersMap[T] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[MutationQueryReducersMap[T]]
  }
}

