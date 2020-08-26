package typings.activexLibreoffice.com_.sun.star.drawing

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XIndexContainer
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** must be supported to provide access to a container of {@link GluePoint2} . */
@js.native
trait XGluePointsSupplier extends XInterface {
  /** @returns a container of {@link GluePoint2} structs. */
  val GluePoints: XIndexContainer = js.native
  /** @returns a container of {@link GluePoint2} structs. */
  def getGluePoints(): XIndexContainer = js.native
}

object XGluePointsSupplier {
  @scala.inline
  def apply(
    GluePoints: XIndexContainer,
    acquire: () => Unit,
    getGluePoints: () => XIndexContainer,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XGluePointsSupplier = {
    val __obj = js.Dynamic.literal(GluePoints = GluePoints.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getGluePoints = js.Any.fromFunction0(getGluePoints), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XGluePointsSupplier]
  }
  @scala.inline
  implicit class XGluePointsSupplierOps[Self <: XGluePointsSupplier] (val x: Self) extends AnyVal {
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
    def setGluePoints(value: XIndexContainer): Self = this.set("GluePoints", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetGluePoints(value: () => XIndexContainer): Self = this.set("getGluePoints", js.Any.fromFunction0(value))
  }
  
}

