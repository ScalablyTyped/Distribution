package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A value of a given type that can be ambiguous.
  *
  * This structure is used as the type of interface attributes corresponding to instances of {@link com.sun.star.beans.Property} that have the {@link
  * com.sun.star.beans.PropertyAttribute.MAYBEAMBIGUOUS} .
  */
trait Ambiguous[T] extends js.Object {
  /** Marks this structure instance as ambiguous. */
  var IsAmbiguous: scala.Boolean
  /**
    * The underlying value of this structure instance.
    *
    * Even if this structure instance is ambiguous, this member should contain a useful value. If there is no useful value for an ambiguous structure
    * instance, com::sun::star::beans::Optional can be used as the type of this member.
    */
  var Value: T
}

object Ambiguous {
  @scala.inline
  def apply[T](IsAmbiguous: scala.Boolean, Value: T): Ambiguous[T] = {
    val __obj = js.Dynamic.literal(IsAmbiguous = IsAmbiguous, Value = Value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Ambiguous[T]]
  }
}

