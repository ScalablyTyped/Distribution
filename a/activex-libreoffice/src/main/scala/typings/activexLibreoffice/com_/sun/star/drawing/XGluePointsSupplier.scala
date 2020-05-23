package typings.activexLibreoffice.com_.sun.star.drawing

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XIndexContainer
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** must be supported to provide access to a container of {@link GluePoint2} . */
trait XGluePointsSupplier extends XInterface {
  /** @returns a container of {@link GluePoint2} structs. */
  val GluePoints: XIndexContainer
  /** @returns a container of {@link GluePoint2} structs. */
  def getGluePoints(): XIndexContainer
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
}

