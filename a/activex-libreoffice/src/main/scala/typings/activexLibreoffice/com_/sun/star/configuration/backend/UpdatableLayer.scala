package typings.activexLibreoffice.com_.sun.star.configuration.backend

import typings.activexLibreoffice.`type`
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  extends StObject
     with Layer
     with XUpdatableLayer
object UpdatableLayer {
  
  inline def apply(
    Timestamp: String,
    URL: String,
    acquire: () => Unit,
    getTimestamp: () => String,
    listSubLayerIds: () => SafeArray[String],
    queryInterface: `type` => js.Any,
    readData: XLayerHandler => Unit,
    readSubLayerData: (XLayerHandler, String) => Unit,
    release: () => Unit,
    replaceWith: XLayer => Unit
  ): UpdatableLayer = {
    val __obj = js.Dynamic.literal(Timestamp = Timestamp.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getTimestamp = js.Any.fromFunction0(getTimestamp), listSubLayerIds = js.Any.fromFunction0(listSubLayerIds), queryInterface = js.Any.fromFunction1(queryInterface), readData = js.Any.fromFunction1(readData), readSubLayerData = js.Any.fromFunction2(readSubLayerData), release = js.Any.fromFunction0(release), replaceWith = js.Any.fromFunction1(replaceWith))
    __obj.asInstanceOf[UpdatableLayer]
  }
}
