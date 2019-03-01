package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.reflectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Reflects a typedef or sequence type. The type class of this description is TypeClass_TYPEDEF or TypeClass_SEQUENCE. */
trait XIndirectTypeDescription extends XTypeDescription {
  /**
    * Returns the typedefed type, if the type is a typedef, or the element type, if the type is a sequence.
    * @returns referenced type
    */
  val ReferencedType: XTypeDescription
  /**
    * Returns the typedefed type, if the type is a typedef, or the element type, if the type is a sequence.
    * @returns referenced type
    */
  def getReferencedType(): XTypeDescription
}

object XIndirectTypeDescription {
  @scala.inline
  def apply(
    Name: java.lang.String,
    ReferencedType: XTypeDescription,
    TypeClass: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.TypeClass,
    acquire: js.Function0[scala.Unit],
    getName: js.Function0[java.lang.String],
    getReferencedType: js.Function0[XTypeDescription],
    getTypeClass: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.TypeClass],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XIndirectTypeDescription = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("ReferencedType")(ReferencedType)
    __obj.updateDynamic("TypeClass")(TypeClass)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getName")(getName)
    __obj.updateDynamic("getReferencedType")(getReferencedType)
    __obj.updateDynamic("getTypeClass")(getTypeClass)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XIndirectTypeDescription]
  }
}

