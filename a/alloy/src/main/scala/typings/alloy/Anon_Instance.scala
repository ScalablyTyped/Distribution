package typings.alloy

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Instance
  extends /* k */ StringDictionary[js.Any] {
  def instance(name: String): js.Any
}

object Anon_Instance {
  @scala.inline
  def apply(instance: String => js.Any, StringDictionary: /* k */ StringDictionary[js.Any] = null): Anon_Instance = {
    val __obj = js.Dynamic.literal(instance = js.Any.fromFunction1(instance))
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_Instance]
  }
}

