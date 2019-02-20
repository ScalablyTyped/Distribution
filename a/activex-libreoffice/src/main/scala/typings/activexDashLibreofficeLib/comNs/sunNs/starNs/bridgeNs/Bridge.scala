package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.bridgeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This meta service allows the bridgefactory service to instantiate an interprocess bridge using a certain transfer protocol.
  *
  * Components, that support a certain protocol, must have at least two service names:
  *
  * {@link com.sun.star.bridge.Bridge}arbitrary-module-path.ProtocolnameBridge
  *
  * The protocol name should be written as common servicenames, first letter is a capital letter, the rest in small letters postfixed by {@link Bridge}
  * (e.g.: `com.sun.star.bridge.UrpBridge` would be correct servicename for the "urp" protocol). However, the protocol names are compared case
  * insensitive. If there exist two services supporting the same protocol, it is arbitrary which one is chosen, so this should be omitted.
  */
trait Bridge
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XInitialization
     with XBridge
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent

