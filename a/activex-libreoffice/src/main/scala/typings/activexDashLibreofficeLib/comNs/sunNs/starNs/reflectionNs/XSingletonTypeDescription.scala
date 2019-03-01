package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.reflectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Reflects a singleton.
  *
  * This type is superseded by {@link XSingletonTypeDescription2} , which supports interface-based singletons, in addition to the obsolete, service-based
  * singletons.
  *
  * The type class of this type is com::sun::star::uno::TypeClass::SINGLETON.
  * @since OOo 1.1.2
  */
trait XSingletonTypeDescription extends XTypeDescription {
  /**
    * Returns the service associated with the singleton.
    * @returns the reflection of the service associated with the singleton, for an obsolete, service-based singleton; for an interface-based singleton, `NULL` i
    */
  val Service: XServiceTypeDescription
  /**
    * Returns the service associated with the singleton.
    * @returns the reflection of the service associated with the singleton, for an obsolete, service-based singleton; for an interface-based singleton, `NULL` i
    */
  def getService(): XServiceTypeDescription
}

object XSingletonTypeDescription {
  @scala.inline
  def apply(
    Name: java.lang.String,
    Service: XServiceTypeDescription,
    TypeClass: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.TypeClass,
    acquire: js.Function0[scala.Unit],
    getName: js.Function0[java.lang.String],
    getService: js.Function0[XServiceTypeDescription],
    getTypeClass: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.TypeClass],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XSingletonTypeDescription = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("Service")(Service)
    __obj.updateDynamic("TypeClass")(TypeClass)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getName")(getName)
    __obj.updateDynamic("getService")(getService)
    __obj.updateDynamic("getTypeClass")(getTypeClass)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XSingletonTypeDescription]
  }
}

