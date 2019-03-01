package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.reflectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Base interface for XIdlField2s and XIdlMethods. */
trait XIdlMember
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Returns the declaring type of this field, i.e. the type having the member declared (interface, enum, struct, exception).
    * @returns declaring type
    */
  val DeclaringClass: XIdlClass[_]
  /**
    * Returns the fully-qualified name of the member.
    * @returns fully-qualified name of the member
    */
  val Name: java.lang.String
  /**
    * Returns the declaring type of this field, i.e. the type having the member declared (interface, enum, struct, exception).
    * @returns declaring type
    */
  def getDeclaringClass(): XIdlClass[_]
  /**
    * Returns the fully-qualified name of the member.
    * @returns fully-qualified name of the member
    */
  def getName(): java.lang.String
}

object XIdlMember {
  @scala.inline
  def apply(
    DeclaringClass: XIdlClass[_],
    Name: java.lang.String,
    acquire: js.Function0[scala.Unit],
    getDeclaringClass: js.Function0[XIdlClass[_]],
    getName: js.Function0[java.lang.String],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XIdlMember = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("DeclaringClass")(DeclaringClass)
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getDeclaringClass")(getDeclaringClass)
    __obj.updateDynamic("getName")(getName)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XIdlMember]
  }
}

