package typings.angular.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * $templateRequest service
  * see http://docs.angularjs.org/api/ng/service/$templateRequest
  */
@js.native
trait ITemplateRequestService extends StObject {
  
  /**
    * Downloads a template using $http and, upon success, stores the
    * contents inside of $templateCache.
    *
    * If the HTTP request fails or the response data of the HTTP request is
    * empty then a $compile error will be thrown (unless
    * {ignoreRequestError} is set to true).
    *
    * @param tpl                  The template URL.
    * @param ignoreRequestError   Whether or not to ignore the exception
    *                             when the request fails or the template is
    *                             empty.
    *
    * @return   A promise whose value is the template content.
    */
  def apply(tpl: String): IPromise[String] = js.native
  def apply(tpl: String, ignoreRequestError: Boolean): IPromise[String] = js.native
  
  /**
    * total amount of pending template requests being downloaded.
    */
  var totalPendingRequests: Double = js.native
}
