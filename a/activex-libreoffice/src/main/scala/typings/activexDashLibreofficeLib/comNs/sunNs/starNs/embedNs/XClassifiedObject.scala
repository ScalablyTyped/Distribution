package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** represents common functionality for embedded objects */
trait XClassifiedObject
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * retrieves class ID of the object.
    * @returns unique class ID of the object
    */
  val ClassID: stdLib.SafeArray[scala.Double]
  /**
    * retrieves symbolic name for the object type to be used in UI.
    * @returns the symbolic name for the object
    */
  val ClassName: java.lang.String
  /**
    * retrieves class ID of the object.
    * @returns unique class ID of the object
    */
  def getClassID(): stdLib.SafeArray[scala.Double]
  /**
    * retrieves symbolic name for the object type to be used in UI.
    * @returns the symbolic name for the object
    */
  def getClassName(): java.lang.String
  /**
    * sets the class ID and symbolic name to an object.
    * @param aClassID the new class ID
    * @param sClassName the new symbolic name
    * @throws com::sun::star::lang::NoSupportException in case changing of class information is not allowed
    */
  def setClassInfo(
    aClassID: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double],
    sClassName: java.lang.String
  ): scala.Unit
}

object XClassifiedObject {
  @scala.inline
  def apply(
    ClassID: stdLib.SafeArray[scala.Double],
    ClassName: java.lang.String,
    acquire: () => scala.Unit,
    getClassID: () => stdLib.SafeArray[scala.Double],
    getClassName: () => java.lang.String,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setClassInfo: (activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double], java.lang.String) => scala.Unit
  ): XClassifiedObject = {
    val __obj = js.Dynamic.literal(ClassID = ClassID, ClassName = ClassName, acquire = js.Any.fromFunction0(acquire), getClassID = js.Any.fromFunction0(getClassID), getClassName = js.Any.fromFunction0(getClassName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setClassInfo = js.Any.fromFunction2(setClassInfo))
  
    __obj.asInstanceOf[XClassifiedObject]
  }
}

