package typings.activexLibreoffice.com_.sun.star.text

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** extends a text range by method to modify its position. */
trait XMarkingAccess extends StObject {
  
  def invalidateMarkings(nType: Double): Unit
}
object XMarkingAccess {
  
  @scala.inline
  def apply(invalidateMarkings: Double => Unit): XMarkingAccess = {
    val __obj = js.Dynamic.literal(invalidateMarkings = js.Any.fromFunction1(invalidateMarkings))
    __obj.asInstanceOf[XMarkingAccess]
  }
  
  @scala.inline
  implicit class XMarkingAccessMutableBuilder[Self <: XMarkingAccess] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInvalidateMarkings(value: Double => Unit): Self = StObject.set(x, "invalidateMarkings", js.Any.fromFunction1(value))
  }
}
