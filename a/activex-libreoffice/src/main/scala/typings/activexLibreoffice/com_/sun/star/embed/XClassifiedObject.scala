package typings.activexLibreoffice.com_.sun.star.embed

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** represents common functionality for embedded objects */
@js.native
trait XClassifiedObject extends XInterface {
  /**
    * retrieves class ID of the object.
    * @returns unique class ID of the object
    */
  val ClassID: SafeArray[Double] = js.native
  /**
    * retrieves symbolic name for the object type to be used in UI.
    * @returns the symbolic name for the object
    */
  val ClassName: String = js.native
  /**
    * retrieves class ID of the object.
    * @returns unique class ID of the object
    */
  def getClassID(): SafeArray[Double] = js.native
  /**
    * retrieves symbolic name for the object type to be used in UI.
    * @returns the symbolic name for the object
    */
  def getClassName(): String = js.native
  /**
    * sets the class ID and symbolic name to an object.
    * @param aClassID the new class ID
    * @param sClassName the new symbolic name
    * @throws com::sun::star::lang::NoSupportException in case changing of class information is not allowed
    */
  def setClassInfo(aClassID: SeqEquiv[Double], sClassName: String): Unit = js.native
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
    val __obj = js.Dynamic.literal(ClassID = ClassID.asInstanceOf[js.Any], ClassName = ClassName.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getClassID = js.Any.fromFunction0(getClassID), getClassName = js.Any.fromFunction0(getClassName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setClassInfo = js.Any.fromFunction2(setClassInfo))
    __obj.asInstanceOf[XClassifiedObject]
  }
  @scala.inline
  implicit class XClassifiedObjectOps[Self <: XClassifiedObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClassID(value: SafeArray[Double]): Self = this.set("ClassID", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassName(value: String): Self = this.set("ClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetClassID(value: () => SafeArray[Double]): Self = this.set("getClassID", js.Any.fromFunction0(value))
    @scala.inline
    def setGetClassName(value: () => String): Self = this.set("getClassName", js.Any.fromFunction0(value))
    @scala.inline
    def setSetClassInfo(value: (SeqEquiv[Double], String) => Unit): Self = this.set("setClassInfo", js.Any.fromFunction2(value))
  }
  
}

