package typings.algoliaTransporter.mod

import typings.algoliaRequesterCommon.mod.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StackFrame extends StObject {
  
  /**
    * The host associated with the `request` and the `response`.
    */
  val host: StatelessHost = js.native
  
  /**
    * The request made.
    */
  val request: typings.algoliaRequesterCommon.mod.Request = js.native
  
  /**
    * The received response.
    */
  val response: Response = js.native
  
  /**
    * The number of tries left.
    */
  val triesLeft: Double = js.native
}
object StackFrame {
  
  @scala.inline
  def apply(
    host: StatelessHost,
    request: typings.algoliaRequesterCommon.mod.Request,
    response: Response,
    triesLeft: Double
  ): StackFrame = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], triesLeft = triesLeft.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackFrame]
  }
  
  @scala.inline
  implicit class StackFrameMutableBuilder[Self <: StackFrame] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHost(value: StatelessHost): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: typings.algoliaRequesterCommon.mod.Request): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: Response): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriesLeft(value: Double): Self = StObject.set(x, "triesLeft", value.asInstanceOf[js.Any])
  }
}
