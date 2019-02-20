package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.mozillaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is the interface to run Mozilla XPCOM code to run Mozilla XPCOM code in OOo,you should first implement this interface, then pass this object to
  * xProxyRunner->Run
  * @see XProxyRunner
  * @see XMozillaBootstrap
  */
trait XCodeProxy
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** which Mozilla product this code is write for */
  val ProductType: MozillaProductType
  /** which Mozilla profile this code will use */
  val ProfileName: java.lang.String
  /** which Mozilla product this code is write for */
  def getProductType(): MozillaProductType
  /** which Mozilla profile this code will use */
  def getProfileName(): java.lang.String
  /** all Mozilla XPCOM code must be called in {@link run()} or functions called by {@link run()} */
  def run(): scala.Double
}

