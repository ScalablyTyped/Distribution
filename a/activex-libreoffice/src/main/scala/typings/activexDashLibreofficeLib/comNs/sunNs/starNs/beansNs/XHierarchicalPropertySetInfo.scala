package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies a hierarchy of properties.
  *
  * The specification only describes the properties, it does not contain any values.
  */
trait XHierarchicalPropertySetInfo
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * @param aHierarchicalName specifies the nested name of the property.
    * @returns the property with the specified name from the hierarchy.
    * @throws UnknownPropertyException if the property does not exist.
    * @throws com::sun::star::lang::IllegalArgumentException if **aHierarchicalName** is not a well-formed nested name for this hierarchy. An implementation is
    */
  def getPropertyByHierarchicalName(aHierarchicalName: java.lang.String): Property
  /**
    * @param aHierarchicalName specifies the name of the property.
    * @returns `TRUE` if a property with the specified name exists; otherwise `FALSE` is returned.
    * @throws com::sun::star::lang::IllegalArgumentException if **aHierarchicalName** is not a well-formed nested name for this hierarchy. An implementation is
    */
  def hasPropertyByHierarchicalName(aHierarchicalName: java.lang.String): scala.Boolean
}

object XHierarchicalPropertySetInfo {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    getPropertyByHierarchicalName: js.Function1[java.lang.String, Property],
    hasPropertyByHierarchicalName: js.Function1[java.lang.String, scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XHierarchicalPropertySetInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getPropertyByHierarchicalName")(getPropertyByHierarchicalName)
    __obj.updateDynamic("hasPropertyByHierarchicalName")(hasPropertyByHierarchicalName)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XHierarchicalPropertySetInfo]
  }
}

