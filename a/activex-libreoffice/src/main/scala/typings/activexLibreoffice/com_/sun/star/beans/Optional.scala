package typings.activexLibreoffice.com_.sun.star.beans

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An optional value of a given type.
  *
  * This structure is used as the type of interface attributes corresponding to instances of {@link com.sun.star.beans.Property} that have the {@link
  * com.sun.star.beans.PropertyAttribute.MAYBEVOID} . It might also be useful in other situations, for example as the return type of an interface method.
  */
trait Optional[T] extends StObject {
  
  /** Marks this structure instance as having an actual value. */
  var IsPresent: Boolean
  
  /**
    * The actual value of this structure instance.
    *
    * If no actual value is present, a producer of such a structure instance should leave this member defaulted, and a consumer of such a structure instance
    * should ignore the specific value stored in this member.
    */
  var Value: T
}
object Optional {
  
  @scala.inline
  def apply[T](IsPresent: Boolean, Value: T): Optional[T] = {
    val __obj = js.Dynamic.literal(IsPresent = IsPresent.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Optional[T]]
  }
  
  @scala.inline
  implicit class OptionalMutableBuilder[Self <: Optional[?], T] (val x: Self & Optional[T]) extends AnyVal {
    
    @scala.inline
    def setIsPresent(value: Boolean): Self = StObject.set(x, "IsPresent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: T): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
