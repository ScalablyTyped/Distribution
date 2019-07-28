package typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A value of a given type that can be defaulted.
  *
  * This structure is used as the type of interface attributes corresponding to instances of {@link com.sun.star.beans.Property} that have the {@link
  * com.sun.star.beans.PropertyAttribute.MAYBEDEFAULT} .
  */
trait Defaulted[T] extends js.Object {
  /** Marks this structure instance as defaulted. */
  var IsDefaulted: Boolean
  /**
    * The underlying value of this structure instance.
    *
    * Even if this structure instance is defaulted, this member should contain a useful value. If there is no useful value for a defaulted structure
    * instance, com::sun::star::beans::Optional can be used as the type of this member.
    */
  var Value: T
}

object Defaulted {
  @scala.inline
  def apply[T](IsDefaulted: Boolean, Value: T): Defaulted[T] = {
    val __obj = js.Dynamic.literal(IsDefaulted = IsDefaulted, Value = Value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Defaulted[T]]
  }
}

