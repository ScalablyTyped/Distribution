package typings.arcgisJsApi.esri

import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
	 * Retrieves data from a remote server or uploads a file.
	 *
	 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html)
	 */
@js.native
trait request extends StObject {
  
  /**
  		 * Retrieves data from a remote server or uploads a file from a user's computer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest)
  		 */
  def esriRequest(url: String): js.Promise[RequestResponse] = js.native
  def esriRequest(url: String, options: RequestOptions): js.Promise[RequestResponse] = js.native
  def esriRequest(url: URL): js.Promise[RequestResponse] = js.native
  def esriRequest(url: URL, options: RequestOptions): js.Promise[RequestResponse] = js.native
}
