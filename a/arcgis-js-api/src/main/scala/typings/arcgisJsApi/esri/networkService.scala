package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This modules contains functions for working with network services.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networkService.html)
  */
@js.native
trait networkService extends StObject {
  
  /**
    * Retrieve a description of the network service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networkService.html#fetchServiceDescription)
    */
  def fetchServiceDescription(url: String): js.Promise[ServiceDescription] = js.native
  def fetchServiceDescription(url: String, apiKey: String): js.Promise[ServiceDescription] = js.native
  def fetchServiceDescription(url: String, apiKey: String, requestOptions: Any): js.Promise[ServiceDescription] = js.native
  def fetchServiceDescription(url: String, apiKey: scala.Unit, requestOptions: Any): js.Promise[ServiceDescription] = js.native
}
