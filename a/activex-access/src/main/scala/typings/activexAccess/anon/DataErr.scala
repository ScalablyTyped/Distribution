package typings.activexAccess.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataErr extends StObject {
  
  var DataErr: Double = js.native
  
  var Response: Double = js.native
}
object DataErr {
  
  @scala.inline
  def apply(DataErr: Double, Response: Double): DataErr = {
    val __obj = js.Dynamic.literal(DataErr = DataErr.asInstanceOf[js.Any], Response = Response.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataErr]
  }
  
  @scala.inline
  implicit class DataErrMutableBuilder[Self <: DataErr] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataErr(value: Double): Self = StObject.set(x, "DataErr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: Double): Self = StObject.set(x, "Response", value.asInstanceOf[js.Any])
  }
}
