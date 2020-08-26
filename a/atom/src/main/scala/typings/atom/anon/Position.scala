package typings.atom.anon

import typings.atom.mod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Position extends js.Object {
  /** The path to the file being referenced. */
  var file: String = js.native
  /** The point being referenced in that file. */
  var position: js.UndefOr[Point] = js.native
}

object Position {
  @scala.inline
  def apply(file: String): Position = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
    __obj.asInstanceOf[Position]
  }
  @scala.inline
  implicit class PositionOps[Self <: Position] (val x: Self) extends AnyVal {
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
    def setFile(value: String): Self = this.set("file", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosition(value: Point): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
  }
  
}

