package typings.activexShdocvw.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Resizable extends js.Object {
  val Resizable: Boolean = js.native
}

object Resizable {
  @scala.inline
  def apply(Resizable: Boolean): Resizable = {
    val __obj = js.Dynamic.literal(Resizable = Resizable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resizable]
  }
  @scala.inline
  implicit class ResizableOps[Self <: Resizable] (val x: Self) extends AnyVal {
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
    def setResizable(value: Boolean): Self = this.set("Resizable", value.asInstanceOf[js.Any])
  }
  
}

