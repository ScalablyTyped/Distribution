package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** knows all currently used and all free numbers for using with untitled but counted objects. */
trait XUntitledNumbers
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * returns the localized string value to be used for untitled objects in combination with the leased number.
    *
    * Note: Such string already contains leading spaces/tabs etc. ! The only thing which an outside code has todo then ... adding a leased number to the
    * string.
    * @returns the localized string for untitled components.
    */
  val UntitledPrefix: java.lang.String
  /**
    * returns the localized string value to be used for untitled objects in combination with the leased number.
    *
    * Note: Such string already contains leading spaces/tabs etc. ! The only thing which an outside code has todo then ... adding a leased number to the
    * string.
    * @returns the localized string for untitled components.
    */
  def getUntitledPrefix(): java.lang.String
  /**
    * callee has to lease a number before he can use it within in its own title.
    *
    * Such number must be freed after using e.g. while the object was closed or gets another title (e.g. by saving a document to a real location on disc).
    * @param xComponent the component which has to be registered for the leased number.
    * @returns the new number for these object or 0 if no further numbers are available.
    * @throws [IllegalArgumentException] if an invalid object reference was provided to this method.
    */
  def leaseNumber(xComponent: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface): scala.Double
  /**
    * has to be used to mark those number as "free for using".
    *
    * If the registered component does not use such leased number any longer it has to be released so it can be used for new components.
    *
    * Note: calling this method with an unknown (but normally valid number) has to be ignored. No exceptions - no errors.
    * @param nNumber specify number for release.
    * @throws [IllegalArgumentException] if the given number is the special value 0.
    */
  def releaseNumber(nNumber: scala.Double): scala.Unit
  /**
    * does the same then releaseNumber () but it searches the corresponding number for the specified component and deregister it.
    * @param xComponent the component for deregistration.
    * @throws [IllegalArgumentException] if an invalid object reference was provided to this method.
    */
  def releaseNumberForComponent(xComponent: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface): scala.Unit
}

object XUntitledNumbers {
  @scala.inline
  def apply(
    UntitledPrefix: java.lang.String,
    acquire: js.Function0[scala.Unit],
    getUntitledPrefix: js.Function0[java.lang.String],
    leaseNumber: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface, scala.Double],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    releaseNumber: js.Function1[scala.Double, scala.Unit],
    releaseNumberForComponent: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface, scala.Unit]
  ): XUntitledNumbers = {
    val __obj = js.Dynamic.literal(UntitledPrefix = UntitledPrefix, acquire = acquire, getUntitledPrefix = getUntitledPrefix, leaseNumber = leaseNumber, queryInterface = queryInterface, release = release, releaseNumber = releaseNumber, releaseNumberForComponent = releaseNumberForComponent)
  
    __obj.asInstanceOf[XUntitledNumbers]
  }
}

