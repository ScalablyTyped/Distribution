package typings.aceBuilds.mod.Ace

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkerLike extends js.Object {
  var clazz: String
  var id: Double
  var inFront: Boolean
  var range: Range
  var renderer: js.UndefOr[MarkerRenderer] = js.undefined
  var `type`: String
  var update: js.UndefOr[
    js.Function4[
      /* html */ js.Array[String], 
      /* marker */ js.Any, 
      /* session */ EditSession, 
      /* config */ js.Any, 
      Unit
    ]
  ] = js.undefined
}

object MarkerLike {
  @scala.inline
  def apply(
    clazz: String,
    id: Double,
    inFront: Boolean,
    range: Range,
    `type`: String,
    renderer: (/* html */ js.Array[String], /* range */ Range, /* left */ Double, /* top */ Double, /* config */ js.Any) => Unit = null,
    update: (/* html */ js.Array[String], /* marker */ js.Any, /* session */ EditSession, /* config */ js.Any) => Unit = null
  ): MarkerLike = {
    val __obj = js.Dynamic.literal(clazz = clazz.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inFront = inFront.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (renderer != null) __obj.updateDynamic("renderer")(js.Any.fromFunction5(renderer))
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction4(update))
    __obj.asInstanceOf[MarkerLike]
  }
}

