package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * use {@link XModel} instead of this
  * @deprecated Deprecated
  */
trait XFrameSetModel
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  var Source: java.lang.String
  def getSource(): java.lang.String
  def setSource(Source: java.lang.String): scala.Unit
}

object XFrameSetModel {
  @scala.inline
  def apply(
    Source: java.lang.String,
    acquire: () => scala.Unit,
    getSource: () => java.lang.String,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setSource: java.lang.String => scala.Unit
  ): XFrameSetModel = {
    val __obj = js.Dynamic.literal(Source = Source, acquire = js.Any.fromFunction0(acquire), getSource = js.Any.fromFunction0(getSource), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setSource = js.Any.fromFunction1(setSource))
  
    __obj.asInstanceOf[XFrameSetModel]
  }
}

