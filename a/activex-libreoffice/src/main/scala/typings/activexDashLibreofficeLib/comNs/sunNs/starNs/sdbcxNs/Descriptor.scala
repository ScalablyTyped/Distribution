package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is used to create a new object within a database.
  *
  * A descriptor is commonly created by the container of a specific object, such as, tables or views. After the creation of the descriptor the properties
  * have to be filled. Afterwards, you append the descriptor to the container and the container creates a new object based on the information of the
  * descriptor. The descriptor can be used to create several objects.
  *
  * A descriptor contains at least the information of the name of an object.
  * @see com.sun.star.sdbcx.XAppend
  */
trait Descriptor
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet {
  /** is the name for the object to create. */
  var Name: java.lang.String
}

