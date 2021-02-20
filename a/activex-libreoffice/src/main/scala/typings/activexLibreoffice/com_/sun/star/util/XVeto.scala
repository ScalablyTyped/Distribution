package typings.activexLibreoffice.com_.sun.star.util

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides information about a veto which has been raised against an operation */
@js.native
trait XVeto extends StObject {
  
  /**
    * provides additional details about the veto.
    *
    * The concrete semantics of this attribute is to be defined in the service implementing this interface.
    */
  var Details: js.Any = js.native
  
  /** describes the reason for the veto */
  var Reason: String = js.native
}
object XVeto {
  
  @scala.inline
  def apply(Details: js.Any, Reason: String): XVeto = {
    val __obj = js.Dynamic.literal(Details = Details.asInstanceOf[js.Any], Reason = Reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[XVeto]
  }
  
  @scala.inline
  implicit class XVetoMutableBuilder[Self <: XVeto] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetails(value: js.Any): Self = StObject.set(x, "Details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: String): Self = StObject.set(x, "Reason", value.asInstanceOf[js.Any])
  }
}
