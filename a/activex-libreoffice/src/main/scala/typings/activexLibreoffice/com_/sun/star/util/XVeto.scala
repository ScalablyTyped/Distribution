package typings.activexLibreoffice.com_.sun.star.util

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides information about a veto which has been raised against an operation */
trait XVeto extends StObject {
  
  /**
    * provides additional details about the veto.
    *
    * The concrete semantics of this attribute is to be defined in the service implementing this interface.
    */
  var Details: Any
  
  /** describes the reason for the veto */
  var Reason: String
}
object XVeto {
  
  inline def apply(Details: Any, Reason: String): XVeto = {
    val __obj = js.Dynamic.literal(Details = Details.asInstanceOf[js.Any], Reason = Reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[XVeto]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XVeto] (val x: Self) extends AnyVal {
    
    inline def setDetails(value: Any): Self = StObject.set(x, "Details", value.asInstanceOf[js.Any])
    
    inline def setReason(value: String): Self = StObject.set(x, "Reason", value.asInstanceOf[js.Any])
  }
}
