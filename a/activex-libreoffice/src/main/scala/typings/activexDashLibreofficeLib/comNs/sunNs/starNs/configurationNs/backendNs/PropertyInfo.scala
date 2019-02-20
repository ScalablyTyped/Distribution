package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This structure contains all the information related to a property
  * @see XLayerContentDescriber
  */
trait PropertyInfo extends js.Object {
  /** The full name of the Property for eg. org.openoffice.Inet/Settings/ooInetHTTPProxyName */
  var Name: java.lang.String
  /** Is the property protected, if true the property can not be over written in later layer. */
  var Protected: scala.Boolean
  /** The type of the Property */
  var Type: java.lang.String
  /** The value of the property */
  var Value: js.Any
}

