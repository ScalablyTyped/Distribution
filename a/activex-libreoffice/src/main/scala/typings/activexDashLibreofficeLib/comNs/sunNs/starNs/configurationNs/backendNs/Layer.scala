package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides read-only access to a configuration data layer.
  *
  * A layer contains the configuration setting changes to be performed on a default settings tree to obtain the values of those settings for a given
  * entity and component.
  * @see com.sun.star.configuration.backend.Schema Service providing access to schema data for a configuration component.
  * @see com.sun.star.configuration.backend.UpdatableLayer Service providing write access to a configuration data layer.
  * @since OOo 1.1.2
  */
trait Layer
  extends XCompositeLayer
     with activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XTimeStamped {
  /**
    * The URL of the layer data.
    * @since OOo 2.0
    */
  var URL: java.lang.String
}

object Layer {
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
    release: js.Function0[scala.Unit]
  ): Layer = {
    val __obj = js.Dynamic.literal(Timestamp = Timestamp, URL = URL, acquire = acquire, getTimestamp = getTimestamp, listSubLayerIds = listSubLayerIds, queryInterface = queryInterface, readData = readData, readSubLayerData = readSubLayerData, release = release)
  
    __obj.asInstanceOf[Layer]
  }
}

