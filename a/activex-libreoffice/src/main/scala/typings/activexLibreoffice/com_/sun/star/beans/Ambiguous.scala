package typings.activexLibreoffice.com_.sun.star.beans

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A value of a given type that can be ambiguous.
  *
  * This structure is used as the type of interface attributes corresponding to instances of {@link com.sun.star.beans.Property} that have the {@link
  * com.sun.star.beans.PropertyAttribute.MAYBEAMBIGUOUS} .
  */
@js.native
trait Ambiguous[T] extends js.Object {
  /** Marks this structure instance as ambiguous. */
  var IsAmbiguous: Boolean = js.native
  /**
    * The underlying value of this structure instance.
    *
    * Even if this structure instance is ambiguous, this member should contain a useful value. If there is no useful value for an ambiguous structure
    * instance, com::sun::star::beans::Optional can be used as the type of this member.
    */
  var Value: T = js.native
}

object Ambiguous {
  @scala.inline
  def apply[T](IsAmbiguous: Boolean, Value: T): Ambiguous[T] = {
    val __obj = js.Dynamic.literal(IsAmbiguous = IsAmbiguous.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ambiguous[T]]
  }
  @scala.inline
  implicit class AmbiguousOps[Self <: Ambiguous[_], T] (val x: Self with Ambiguous[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIsAmbiguous(value: Boolean): Self = this.set("IsAmbiguous", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: T): Self = this.set("Value", value.asInstanceOf[js.Any])
  }
  
}

