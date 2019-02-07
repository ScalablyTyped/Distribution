package typings
package astDashTypesLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Field[T] extends js.Object {
  val defaultFn: js.UndefOr[js.Function] = js.undefined
  val hidden: scala.Boolean
  val name: java.lang.String
  val `type`: Type[T]
  def getValue(obj: org.scalablytyped.runtime.StringDictionary[js.Any]): js.Any
}

