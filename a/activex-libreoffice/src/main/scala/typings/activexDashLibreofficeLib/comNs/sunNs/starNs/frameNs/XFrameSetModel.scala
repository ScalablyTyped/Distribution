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
    acquire: js.Function0[scala.Unit],
    getSource: js.Function0[java.lang.String],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setSource: js.Function1[java.lang.String, scala.Unit]
  ): XFrameSetModel = {
    val __obj = js.Dynamic.literal(Source = Source, acquire = acquire, getSource = getSource, queryInterface = queryInterface, release = release, setSource = setSource)
  
    __obj.asInstanceOf[XFrameSetModel]
  }
}

