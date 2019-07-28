package typings.activexDashLibreoffice.comNs.sunNs.starNs.embedNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** represents common functionality for embedded objects */
trait XClassifiedObject extends XInterface {
  /**
    * retrieves class ID of the object.
    * @returns unique class ID of the object
    */
  val ClassID: SafeArray[Double]
  /**
    * retrieves symbolic name for the object type to be used in UI.
    * @returns the symbolic name for the object
    */
  val ClassName: String
  /**
    * retrieves class ID of the object.
    * @returns unique class ID of the object
    */
  def getClassID(): SafeArray[Double]
  /**
    * retrieves symbolic name for the object type to be used in UI.
    * @returns the symbolic name for the object
    */
  def getClassName(): String
  /**
    * sets the class ID and symbolic name to an object.
    * @param aClassID the new class ID
    * @param sClassName the new symbolic name
    * @throws com::sun::star::lang::NoSupportException in case changing of class information is not allowed
    */
  def setClassInfo(aClassID: SeqEquiv[Double], sClassName: String): Unit
}

object XClassifiedObject {
  @scala.inline
  def apply(
    ClassID: SafeArray[Double],
    ClassName: String,
    acquire: () => Unit,
    getClassID: () => SafeArray[Double],
    getClassName: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setClassInfo: (SeqEquiv[Double], String) => Unit
  ): XClassifiedObject = {
    val __obj = js.Dynamic.literal(ClassID = ClassID, ClassName = ClassName, acquire = js.Any.fromFunction0(acquire), getClassID = js.Any.fromFunction0(getClassID), getClassName = js.Any.fromFunction0(getClassName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setClassInfo = js.Any.fromFunction2(setClassInfo))
  
    __obj.asInstanceOf[XClassifiedObject]
  }
}

