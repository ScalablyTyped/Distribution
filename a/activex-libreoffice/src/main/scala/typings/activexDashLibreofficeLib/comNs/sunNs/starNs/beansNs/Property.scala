package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This structure describes a property.
  *
  * There are three types of properties: bound propertiesconstrained propertiesfree properties
  */
trait Property extends js.Object {
  /** This field may contain zero or more constants of the {@link PropertyAttribute} constants group. */
  var Attributes: scala.Double
  /**
    * contains an implementation-specific handle for the property.
    *
    * It may be -1 if the implementation has no handle. You can use this handle to get values from the {@link XFastPropertySet} .
    */
  var Handle: scala.Double
  /**
    * specifies the name of the property.
    *
    * The name is unique within an {@link XPropertySet} . Upper and lower case are distinguished.
    */
  var Name: java.lang.String
  /**
    * contains an object that identifies the declared type for the property.
    *
    * If the property has multiple types or the type is not known, **but not an any** , then void must be returned.
    */
  var Type: activexDashLibreofficeLib.`type`
}

