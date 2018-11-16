package typings
package aframeLib.aframeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Component[T /* <: js.Object */, S /* <: System[_] */] extends js.Object {
  var attrName: js.UndefOr[java.lang.String] = js.native
  var data: T = js.native
  var dependencies: js.UndefOr[js.Array[java.lang.String]] = js.native
  var el: Entity[ObjectMap[Component[_, System[_]]]] = js.native
  var id: java.lang.String = js.native
  var multiple: js.UndefOr[scala.Boolean] = js.native
  var name: java.lang.String = js.native
  var schema: Schema[T] = js.native
  var system: js.UndefOr[S] = js.native
  var tick: js.UndefOr[js.Function2[/* time */ scala.Double, /* timeDelta */ scala.Double, scala.Unit]] = js.native
  var updateSchema: js.UndefOr[js.Function0[scala.Unit]] = js.native
  def extendSchema(update: Schema[js.Object]): scala.Unit = js.native
  def flushToDOM(): scala.Unit = js.native
  def init(): scala.Unit = js.native
  def init(data: T): scala.Unit = js.native
  def pause(): scala.Unit = js.native
  def play(): scala.Unit = js.native
  def remove(): scala.Unit = js.native
  def update(oldData: T): scala.Unit = js.native
}

