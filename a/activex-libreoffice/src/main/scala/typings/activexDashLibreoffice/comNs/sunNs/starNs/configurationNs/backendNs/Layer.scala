package typings.activexDashLibreoffice.comNs.sunNs.starNs.configurationNs.backendNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.XTimeStamped
import typings.std.SafeArray
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
     with XTimeStamped {
  /**
    * The URL of the layer data.
    * @since OOo 2.0
    */
  var URL: String
}

object Layer {
  @scala.inline
  def apply(
    Timestamp: String,
    URL: String,
    acquire: () => Unit,
    getTimestamp: () => String,
    listSubLayerIds: () => SafeArray[String],
    queryInterface: `type` => js.Any,
    readData: XLayerHandler => Unit,
    readSubLayerData: (XLayerHandler, String) => Unit,
    release: () => Unit
  ): Layer = {
    val __obj = js.Dynamic.literal(Timestamp = Timestamp, URL = URL, acquire = js.Any.fromFunction0(acquire), getTimestamp = js.Any.fromFunction0(getTimestamp), listSubLayerIds = js.Any.fromFunction0(listSubLayerIds), queryInterface = js.Any.fromFunction1(queryInterface), readData = js.Any.fromFunction1(readData), readSubLayerData = js.Any.fromFunction2(readSubLayerData), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[Layer]
  }
}

