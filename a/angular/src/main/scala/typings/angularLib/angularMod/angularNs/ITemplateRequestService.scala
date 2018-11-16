package typings
package angularLib.angularMod.angularNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * $templateRequest service
     * see http://docs.angularjs.org/api/ng/service/$templateRequest
     */
@js.native
trait ITemplateRequestService extends js.Object {
  /**
           * total amount of pending template requests being downloaded.
           */
  var totalPendingRequests: scala.Double = js.native
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
  def apply(tpl: java.lang.String): IPromise[java.lang.String] = js.native
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
  def apply(tpl: java.lang.String, ignoreRequestError: scala.Boolean): IPromise[java.lang.String] = js.native
}

