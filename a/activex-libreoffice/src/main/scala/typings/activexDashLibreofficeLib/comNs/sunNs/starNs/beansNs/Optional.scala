package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An optional value of a given type.
  *
  * This structure is used as the type of interface attributes corresponding to instances of {@link com.sun.star.beans.Property} that have the {@link
  * com.sun.star.beans.PropertyAttribute.MAYBEVOID} . It might also be useful in other situations, for example as the return type of an interface method.
  */
trait Optional[T] extends js.Object {
  /** Marks this structure instance as having an actual value. */
  var IsPresent: scala.Boolean
  /**
    * The actual value of this structure instance.
    *
    * If no actual value is present, a producer of such a structure instance should leave this member defaulted, and a consumer of such a structure instance
    * should ignore the specific value stored in this member.
    */
  var Value: T
}

