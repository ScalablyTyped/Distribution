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
    acquire: () => scala.Unit,
    getTimestamp: () => java.lang.String,
    listSubLayerIds: () => stdLib.SafeArray[java.lang.String],
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    readData: XLayerHandler => scala.Unit,
    readSubLayerData: (XLayerHandler, java.lang.String) => scala.Unit,
    release: () => scala.Unit
  ): Layer = {
    val __obj = js.Dynamic.literal(Timestamp = Timestamp, URL = URL, acquire = js.Any.fromFunction0(acquire), getTimestamp = js.Any.fromFunction0(getTimestamp), listSubLayerIds = js.Any.fromFunction0(listSubLayerIds), queryInterface = js.Any.fromFunction1(queryInterface), readData = js.Any.fromFunction1(readData), readSubLayerData = js.Any.fromFunction2(readSubLayerData), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[Layer]
  }
}

