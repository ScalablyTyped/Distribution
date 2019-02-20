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

