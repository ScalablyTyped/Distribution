package typings.activexLibreoffice.com_.sun.star.beans

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A value of a given type that can be defaulted.
  *
  * This structure is used as the type of interface attributes corresponding to instances of {@link com.sun.star.beans.Property} that have the {@link
  * com.sun.star.beans.PropertyAttribute.MAYBEDEFAULT} .
  */
trait Defaulted[T] extends StObject {
  
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
    val __obj = js.Dynamic.literal(IsDefaulted = IsDefaulted.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Defaulted[T]]
  }
  
  @scala.inline
  implicit class DefaultedMutableBuilder[Self <: Defaulted[?], T] (val x: Self & Defaulted[T]) extends AnyVal {
    
    @scala.inline
    def setIsDefaulted(value: Boolean): Self = StObject.set(x, "IsDefaulted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: T): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
