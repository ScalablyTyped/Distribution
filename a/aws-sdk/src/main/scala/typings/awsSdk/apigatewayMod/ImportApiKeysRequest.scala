package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportApiKeysRequest extends StObject {
  
  /**
    * The payload of the POST request to import API keys. For the payload format, see API Key File Format.
    */
  var body: _Blob = js.native
  
  /**
    * A query parameter to indicate whether to rollback ApiKey importation (true) or not (false) when error is encountered.
    */
  var failOnWarnings: js.UndefOr[Boolean] = js.native
  
  /**
    * A query parameter to specify the input format to imported API keys. Currently, only the csv format is supported.
    */
  var format: ApiKeysFormat = js.native
}
object ImportApiKeysRequest {
  
  @scala.inline
  def apply(body: _Blob, format: ApiKeysFormat): ImportApiKeysRequest = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportApiKeysRequest]
  }
  
  @scala.inline
  implicit class ImportApiKeysRequestMutableBuilder[Self <: ImportApiKeysRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: _Blob): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailOnWarnings(value: Boolean): Self = StObject.set(x, "failOnWarnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailOnWarningsUndefined: Self = StObject.set(x, "failOnWarnings", js.undefined)
    
    @scala.inline
    def setFormat(value: ApiKeysFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
  }
}
