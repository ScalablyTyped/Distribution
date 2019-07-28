package typings.activexDashLibreoffice.comNs.sunNs.starNs.mozillaNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is the interface to run Mozilla XPCOM code to run Mozilla XPCOM code in OOo,you should first implement this interface, then pass this object to
  * xProxyRunner->Run
  * @see XProxyRunner
  * @see XMozillaBootstrap
  */
trait XCodeProxy extends XInterface {
  /** which Mozilla product this code is write for */
  val ProductType: MozillaProductType
  /** which Mozilla profile this code will use */
  val ProfileName: String
  /** which Mozilla product this code is write for */
  def getProductType(): MozillaProductType
  /** which Mozilla profile this code will use */
  def getProfileName(): String
  /** all Mozilla XPCOM code must be called in {@link run()} or functions called by {@link run()} */
  def run(): Double
}

object XCodeProxy {
  @scala.inline
  def apply(
    ProductType: MozillaProductType,
    ProfileName: String,
    acquire: () => Unit,
    getProductType: () => MozillaProductType,
    getProfileName: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    run: () => Double
  ): XCodeProxy = {
    val __obj = js.Dynamic.literal(ProductType = ProductType, ProfileName = ProfileName, acquire = js.Any.fromFunction0(acquire), getProductType = js.Any.fromFunction0(getProductType), getProfileName = js.Any.fromFunction0(getProfileName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), run = js.Any.fromFunction0(run))
  
    __obj.asInstanceOf[XCodeProxy]
  }
}

