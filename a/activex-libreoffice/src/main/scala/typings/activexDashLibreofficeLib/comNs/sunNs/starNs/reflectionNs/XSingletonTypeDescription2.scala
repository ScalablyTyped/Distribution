package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.reflectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Reflects a singleton, supporting interface-based singletons.
  *
  * This type supersedes {@link XSingletonTypeDescription} , which only supports obsolete, service-based singletons.
  * @since OOo 2.0
  */
trait XSingletonTypeDescription2 extends XSingletonTypeDescription {
  /**
    * Returns the interface type associated with the singleton.
    * @returns the reflection of the interface type associated with the singleton (of type {@link com.sun.star.reflection.XInterfaceTypeDescription} or, in case
    */
  val Interface: XTypeDescription
  /**
    * Returns the interface type associated with the singleton.
    * @returns the reflection of the interface type associated with the singleton (of type {@link com.sun.star.reflection.XInterfaceTypeDescription} or, in case
    */
  def getInterface(): XTypeDescription
  /**
    * Returns whether this object reflects an interface-based singleton.
    * @returns `TRUE` if this object reflects an interface-based singleton, and `FALSE` if this object reflects an obsolete, service-based singleton
    */
  def isInterfaceBased(): scala.Boolean
}

object XSingletonTypeDescription2 {
  @scala.inline
  def apply(
    Interface: XTypeDescription,
    Name: java.lang.String,
    Service: XServiceTypeDescription,
    TypeClass: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.TypeClass,
    acquire: js.Function0[scala.Unit],
    getInterface: js.Function0[XTypeDescription],
    getName: js.Function0[java.lang.String],
    getService: js.Function0[XServiceTypeDescription],
    getTypeClass: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.TypeClass],
    isInterfaceBased: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XSingletonTypeDescription2 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Interface")(Interface)
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("Service")(Service)
    __obj.updateDynamic("TypeClass")(TypeClass)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getInterface")(getInterface)
    __obj.updateDynamic("getName")(getName)
    __obj.updateDynamic("getService")(getService)
    __obj.updateDynamic("getTypeClass")(getTypeClass)
    __obj.updateDynamic("isInterfaceBased")(isInterfaceBased)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XSingletonTypeDescription2]
  }
}

