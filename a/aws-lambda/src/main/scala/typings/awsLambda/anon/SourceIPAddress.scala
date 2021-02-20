package typings.awsLambda.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceIPAddress extends StObject {
  
  var sourceIPAddress: String = js.native
}
object SourceIPAddress {
  
  @scala.inline
  def apply(sourceIPAddress: String): SourceIPAddress = {
    val __obj = js.Dynamic.literal(sourceIPAddress = sourceIPAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceIPAddress]
  }
  
  @scala.inline
  implicit class SourceIPAddressMutableBuilder[Self <: SourceIPAddress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSourceIPAddress(value: String): Self = StObject.set(x, "sourceIPAddress", value.asInstanceOf[js.Any])
  }
}
