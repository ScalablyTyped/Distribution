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
  val ClassID: activexDashInteropLib.SafeArray[scala.Double]
  /**
    * retrieves symbolic name for the object type to be used in UI.
    * @returns the symbolic name for the object
    */
  val ClassName: java.lang.String
  /**
    * retrieves class ID of the object.
    * @returns unique class ID of the object
    */
  def getClassID(): activexDashInteropLib.SafeArray[scala.Double]
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
    ClassID: activexDashInteropLib.SafeArray[scala.Double],
    ClassName: java.lang.String,
    acquire: js.Function0[scala.Unit],
    getClassID: js.Function0[activexDashInteropLib.SafeArray[scala.Double]],
    getClassName: js.Function0[java.lang.String],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setClassInfo: js.Function2[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double], 
      java.lang.String, 
      scala.Unit
    ]
  ): XClassifiedObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ClassID")(ClassID)
    __obj.updateDynamic("ClassName")(ClassName)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getClassID")(getClassID)
    __obj.updateDynamic("getClassName")(getClassName)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("setClassInfo")(setClassInfo)
    __obj.asInstanceOf[XClassifiedObject]
  }
}

