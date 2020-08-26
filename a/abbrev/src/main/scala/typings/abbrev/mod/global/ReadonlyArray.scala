package typings.abbrev.mod.global

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReadonlyArray[T] extends js.Object {
  def abbrev(): StringDictionary[String] = js.native
}

object ReadonlyArray {
  @scala.inline
  def apply[T](abbrev: () => StringDictionary[String]): ReadonlyArray[T] = {
    val __obj = js.Dynamic.literal(abbrev = js.Any.fromFunction0(abbrev))
    __obj.asInstanceOf[ReadonlyArray[T]]
  }
  @scala.inline
  implicit class ReadonlyArrayOps[Self <: ReadonlyArray[_], T] (val x: Self with ReadonlyArray[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAbbrev(value: () => StringDictionary[String]): Self = this.set("abbrev", js.Any.fromFunction0(value))
  }
  
}

