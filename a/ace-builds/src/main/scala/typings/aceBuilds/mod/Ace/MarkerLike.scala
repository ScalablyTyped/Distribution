package typings.aceBuilds.mod.Ace

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MarkerLike extends js.Object {
  var clazz: String = js.native
  var id: Double = js.native
  var inFront: Boolean = js.native
  var range: Range = js.native
  var renderer: js.UndefOr[MarkerRenderer] = js.native
  var `type`: String = js.native
  var update: js.UndefOr[
    js.Function4[
      /* html */ js.Array[String], 
      /* marker */ js.Any, 
      /* session */ EditSession, 
      /* config */ js.Any, 
      Unit
    ]
  ] = js.native
}

object MarkerLike {
  @scala.inline
  def apply(clazz: String, id: Double, inFront: Boolean, range: Range, `type`: String): MarkerLike = {
    val __obj = js.Dynamic.literal(clazz = clazz.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inFront = inFront.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkerLike]
  }
  @scala.inline
  implicit class MarkerLikeOps[Self <: MarkerLike] (val x: Self) extends AnyVal {
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
    def setClazz(value: String): Self = this.set("clazz", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setInFront(value: Boolean): Self = this.set("inFront", value.asInstanceOf[js.Any])
    @scala.inline
    def setRange(value: Range): Self = this.set("range", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setRenderer(
      value: (/* html */ js.Array[String], /* range */ Range, /* left */ Double, /* top */ Double, /* config */ js.Any) => Unit
    ): Self = this.set("renderer", js.Any.fromFunction5(value))
    @scala.inline
    def deleteRenderer: Self = this.set("renderer", js.undefined)
    @scala.inline
    def setUpdate(
      value: (/* html */ js.Array[String], /* marker */ js.Any, /* session */ EditSession, /* config */ js.Any) => Unit
    ): Self = this.set("update", js.Any.fromFunction4(value))
    @scala.inline
    def deleteUpdate: Self = this.set("update", js.undefined)
  }
  
}

