package typings.appleMapkitJsBrowser.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The estimated arrival times for a set of destinations.
  */
@js.native
trait EtaResponse extends js.Object {
  
  /**
    * An array of estimated arrival times.
    */
  var etas: js.Array[EtaResult] = js.native
  
  /**
    * The request object associated with the estimated time of arrival response.
    */
  var request: EtaRequestOptions = js.native
}
object EtaResponse {
  
  @scala.inline
  def apply(etas: js.Array[EtaResult], request: EtaRequestOptions): EtaResponse = {
    val __obj = js.Dynamic.literal(etas = etas.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[EtaResponse]
  }
  
  @scala.inline
  implicit class EtaResponseOps[Self <: EtaResponse] (val x: Self) extends AnyVal {
    
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
    def setEtasVarargs(value: EtaResult*): Self = this.set("etas", js.Array(value :_*))
    
    @scala.inline
    def setEtas(value: js.Array[EtaResult]): Self = this.set("etas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: EtaRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
  }
}
