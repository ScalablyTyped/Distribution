package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.langNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Executing interface for executable components run by the uno executable loader. This is an application to run components passing the command line
  * arguments.
  */
trait XMain
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * This method is called to run the component.
    * @param aArguments arguments passed to the component, i.e. the command line arguments
    * @returns return value passed to be returned by main()
    */
  def run(aArguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String]): scala.Double
}

object XMain {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    run: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], scala.Double]
  ): XMain = {
    val __obj = js.Dynamic.literal(acquire = acquire, queryInterface = queryInterface, release = release, run = run)
  
    __obj.asInstanceOf[XMain]
  }
}

