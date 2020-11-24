package typings.activexLibreoffice.com_.sun.star.beans

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An optional value of a given type.
  *
  * This structure is used as the type of interface attributes corresponding to instances of {@link com.sun.star.beans.Property} that have the {@link
  * com.sun.star.beans.PropertyAttribute.MAYBEVOID} . It might also be useful in other situations, for example as the return type of an interface method.
  */
@js.native
trait Optional[T] extends js.Object {
  
  /** Marks this structure instance as having an actual value. */
  var IsPresent: Boolean = js.native
  
  /**
    * The actual value of this structure instance.
    *
    * If no actual value is present, a producer of such a structure instance should leave this member defaulted, and a consumer of such a structure instance
    * should ignore the specific value stored in this member.
    */
  var Value: T = js.native
}
object Optional {
  
  @scala.inline
  def apply[T](IsPresent: Boolean, Value: T): Optional[T] = {
    val __obj = js.Dynamic.literal(IsPresent = IsPresent.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Optional[T]]
  }
  
  @scala.inline
  implicit class OptionalOps[Self <: Optional[_], T] (val x: Self with Optional[T]) extends AnyVal {
    
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
    def setIsPresent(value: Boolean): Self = this.set("IsPresent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: T): Self = this.set("Value", value.asInstanceOf[js.Any])
  }
}
