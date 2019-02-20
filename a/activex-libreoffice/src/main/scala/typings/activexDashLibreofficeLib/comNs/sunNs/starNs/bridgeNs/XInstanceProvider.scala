package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.bridgeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allows to export UNO objects to other processes.
  * @see XBridge
  */
trait XInstanceProvider
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * gets called, when an initial object is requested from a remote process. You may either create a new instance or return an existing object.
    * @param sInstanceName The name of the requested object.
    * @returns the object associated with the name. The return value may be null in case there is no object to offer for this string. In this case, {@link XBrid
    * @throws NoSuchElementException You may throw this exception to indicate, that there is no object for this name. Due to a specification bug, this exceptio
    */
  def getInstance(sInstanceName: java.lang.String): activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
}

