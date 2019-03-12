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
    acquire: () => scala.Unit,
    getTimestamp: () => java.lang.String,
    listSubLayerIds: () => stdLib.SafeArray[java.lang.String],
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    readData: XLayerHandler => scala.Unit,
    readSubLayerData: (XLayerHandler, java.lang.String) => scala.Unit,
    release: () => scala.Unit,
    replaceWith: XLayer => scala.Unit
  ): UpdatableLayer = {
    val __obj = js.Dynamic.literal(Timestamp = Timestamp, URL = URL, acquire = js.Any.fromFunction0(acquire), getTimestamp = js.Any.fromFunction0(getTimestamp), listSubLayerIds = js.Any.fromFunction0(listSubLayerIds), queryInterface = js.Any.fromFunction1(queryInterface), readData = js.Any.fromFunction1(readData), readSubLayerData = js.Any.fromFunction2(readSubLayerData), release = js.Any.fromFunction0(release), replaceWith = js.Any.fromFunction1(replaceWith))
  
    __obj.asInstanceOf[UpdatableLayer]
  }
}

