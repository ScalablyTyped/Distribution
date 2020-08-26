package typings.activexLibreoffice.com_.sun.star.drawing

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.Point
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @deprecated Deprecated */
@js.native
trait XConnectableShape extends XInterface {
  def canConnect(nPos: Point, bCreateGluePoint: Boolean, nMaxDist: Double): Boolean = js.native
  def doConnect(nPos: Point, bCreateGluePoint: Boolean, nMaxDist: Double): Boolean = js.native
}

object XConnectableShape {
  @scala.inline
  def apply(
    acquire: () => Unit,
    canConnect: (Point, Boolean, Double) => Boolean,
    doConnect: (Point, Boolean, Double) => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XConnectableShape = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), canConnect = js.Any.fromFunction3(canConnect), doConnect = js.Any.fromFunction3(doConnect), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XConnectableShape]
  }
  @scala.inline
  implicit class XConnectableShapeOps[Self <: XConnectableShape] (val x: Self) extends AnyVal {
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
    def setCanConnect(value: (Point, Boolean, Double) => Boolean): Self = this.set("canConnect", js.Any.fromFunction3(value))
    @scala.inline
    def setDoConnect(value: (Point, Boolean, Double) => Boolean): Self = this.set("doConnect", js.Any.fromFunction3(value))
  }
  
}

