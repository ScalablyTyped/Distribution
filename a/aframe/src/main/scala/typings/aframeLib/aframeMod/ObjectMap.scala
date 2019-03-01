package typings
package aframeLib.aframeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectMap[T]
  extends /* key */ org.scalablytyped.runtime.StringDictionary[T]

object ObjectMap {
  @scala.inline
  def apply[T](StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[T] = null): ObjectMap[T] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ObjectMap[T]]
  }
}

