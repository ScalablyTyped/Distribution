package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.langNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Allows creating instances specified by a string name. */
@js.native
trait XMultiServiceFactory
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Provides the available names of the factory to be used to create instances.
    * @returns sequence of all names
    */
  val AvailableServiceNames: stdLib.SafeArray[java.lang.String] = js.native
  /**
    * Creates an instance classified by the specified name.
    * @param aServiceSpecifier classified name of instance
    * @returns instance
    */
  def createInstance(aServiceSpecifier: java.lang.String): activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface = js.native
  def createInstance[K /* <: /* import warning: LimitUnionLength.enterTypeRef Was union type with length 1364 */ js.Any */](aServiceSpecifier: K): /* import warning: ImportType.apply Failed type conversion: activex-libreoffice.LibreOffice.ServicesNameMap[K] */ js.Any = js.native
  /**
    * Creates an instance classified by the specified name and passes the arguments to that instance.
    * @param ServiceSpecifier classified name of instance
    * @param Arguments arguments passed to the instance
    * @returns instance
    */
  def createInstanceWithArguments(ServiceSpecifier: java.lang.String, Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]): activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface = js.native
  def createInstanceWithArguments[K /* <: /* import warning: LimitUnionLength.enterTypeRef Was union type with length 1364 */ js.Any */](ServiceSpecifier: K, Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]): /* import warning: ImportType.apply Failed type conversion: activex-libreoffice.LibreOffice.ServicesNameMap[K] */ js.Any = js.native
  /**
    * Provides the available names of the factory to be used to create instances.
    * @returns sequence of all names
    */
  def getAvailableServiceNames(): stdLib.SafeArray[java.lang.String] = js.native
}

