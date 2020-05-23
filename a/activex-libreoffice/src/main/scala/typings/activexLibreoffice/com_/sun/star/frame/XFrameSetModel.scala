package typings.activexLibreoffice.com_.sun.star.frame

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * use {@link XModel} instead of this
  * @deprecated Deprecated
  */
trait XFrameSetModel extends XInterface {
  var Source: String
  def getSource(): String
  def setSource(Source: String): Unit
}

object XFrameSetModel {
  @scala.inline
  def apply(
    Source: String,
    acquire: () => Unit,
    getSource: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setSource: String => Unit
  ): XFrameSetModel = {
    val __obj = js.Dynamic.literal(Source = Source.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getSource = js.Any.fromFunction0(getSource), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setSource = js.Any.fromFunction1(setSource))
    __obj.asInstanceOf[XFrameSetModel]
  }
}

