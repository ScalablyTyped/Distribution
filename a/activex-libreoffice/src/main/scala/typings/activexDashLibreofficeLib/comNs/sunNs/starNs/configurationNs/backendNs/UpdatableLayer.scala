package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides read/write access to a configuration data layer.
  *
  * A layer contains the configuration setting changes to be performed on a default layer (or schema) to obtain the values of those settings for a given
  * entity and component.
  *
  * An updatable layer can be read or replaced with another layer.
  * @since OOo 1.1.2
  */
trait UpdatableLayer
  extends Layer
     with XUpdatableLayer

object UpdatableLayer {
  @scala.inline
  def apply(
    Timestamp: java.lang.String,
    URL: java.lang.String,
    acquire: js.Function0[scala.Unit],
    getTimestamp: js.Function0[java.lang.String],
    listSubLayerIds: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    readData: js.Function1[XLayerHandler, scala.Unit],
    readSubLayerData: js.Function2[XLayerHandler, java.lang.String, scala.Unit],
    release: js.Function0[scala.Unit],
    replaceWith: js.Function1[XLayer, scala.Unit]
  ): UpdatableLayer = {
    val __obj = js.Dynamic.literal(Timestamp = Timestamp, URL = URL, acquire = acquire, getTimestamp = getTimestamp, listSubLayerIds = listSubLayerIds, queryInterface = queryInterface, readData = readData, readSubLayerData = readSubLayerData, release = release, replaceWith = replaceWith)
  
    __obj.asInstanceOf[UpdatableLayer]
  }
}

