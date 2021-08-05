package typings.activexLibreoffice.com_.sun.star.beans

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A value of a given type that can be ambiguous.
  *
  * This structure is used as the type of interface attributes corresponding to instances of {@link com.sun.star.beans.Property} that have the {@link
  * com.sun.star.beans.PropertyAttribute.MAYBEAMBIGUOUS} .
  */
trait Ambiguous[T] extends StObject {
  
  /** Marks this structure instance as ambiguous. */
  var IsAmbiguous: Boolean
  
  /**
    * The underlying value of this structure instance.
    *
    * Even if this structure instance is ambiguous, this member should contain a useful value. If there is no useful value for an ambiguous structure
    * instance, com::sun::star::beans::Optional can be used as the type of this member.
    */
  var Value: T
}
object Ambiguous {
  
  inline def apply[T](IsAmbiguous: Boolean, Value: T): Ambiguous[T] = {
    val __obj = js.Dynamic.literal(IsAmbiguous = IsAmbiguous.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ambiguous[T]]
  }
  
  extension [Self <: Ambiguous[?], T](x: Self & Ambiguous[T]) {
    
    inline def setIsAmbiguous(value: Boolean): Self = StObject.set(x, "IsAmbiguous", value.asInstanceOf[js.Any])
    
    inline def setValue(value: T): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
