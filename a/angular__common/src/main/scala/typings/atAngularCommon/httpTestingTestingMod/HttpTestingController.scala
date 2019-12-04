package typings.atAngularCommon.httpTestingTestingMod

import typings.atAngularCommon.Anon_IgnoreCancelled
import typings.atAngularCommon.httpMod.HttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common/http/testing/testing", "HttpTestingController")
@js.native
abstract class HttpTestingController () extends js.Object {
  /**
    * Expect that no requests have been made which match the given predicate function.
    *
    * If a matching request has been made, fail with an error message including the given request
    * description, if any.
    */
  def expectNone(matchFn: js.Function1[/* req */ HttpRequest[_], Boolean]): Unit = js.native
  def expectNone(matchFn: js.Function1[/* req */ HttpRequest[_], Boolean], description: String): Unit = js.native
  /**
    * Expect that no requests have been made which match the given parameters.
    *
    * If a matching request has been made, fail with an error message including the given request
    * description, if any.
    */
  def expectNone(params: RequestMatch): Unit = js.native
  def expectNone(params: RequestMatch, description: String): Unit = js.native
  /**
    * Expect that no requests have been made which match the given URL.
    *
    * If a matching request has been made, fail with an error message including the given request
    * description, if any.
    */
  /**
    * Expect that no requests have been made which match the given condition.
    *
    * If a matching request has been made, fail with an error message including the given request
    * description, if any.
    */
  def expectNone(url: String): Unit = js.native
  def expectNone(url: String, description: String): Unit = js.native
  /**
    * Expect that a single request has been made which matches the given predicate function, and
    * return its mock.
    *
    * If no such request has been made, or more than one such request has been made, fail with an
    * error message including the given request description, if any.
    */
  def expectOne(matchFn: js.Function1[/* req */ HttpRequest[_], Boolean]): TestRequest = js.native
  def expectOne(matchFn: js.Function1[/* req */ HttpRequest[_], Boolean], description: String): TestRequest = js.native
  /**
    * Expect that a single request has been made which matches the given parameters, and return
    * its mock.
    *
    * If no such request has been made, or more than one such request has been made, fail with an
    * error message including the given request description, if any.
    */
  def expectOne(params: RequestMatch): TestRequest = js.native
  def expectOne(params: RequestMatch, description: String): TestRequest = js.native
  /**
    * Expect that a single request has been made which matches the given URL, and return its
    * mock.
    *
    * If no such request has been made, or more than one such request has been made, fail with an
    * error message including the given request description, if any.
    */
  /**
    * Expect that a single request has been made which matches the given condition, and return
    * its mock.
    *
    * If no such request has been made, or more than one such request has been made, fail with an
    * error message including the given request description, if any.
    */
  def expectOne(url: String): TestRequest = js.native
  def expectOne(url: String, description: String): TestRequest = js.native
  /**
    * Search for requests that match the given parameter, without any expectations.
    */
  def `match`(`match`: String): js.Array[TestRequest] = js.native
  def `match`(`match`: js.Function1[/* req */ HttpRequest[_], Boolean]): js.Array[TestRequest] = js.native
  def `match`(`match`: RequestMatch): js.Array[TestRequest] = js.native
  /**
    * Verify that no unmatched requests are outstanding.
    *
    * If any requests are outstanding, fail with an error message indicating which requests were not
    * handled.
    *
    * If `ignoreCancelled` is not set (the default), `verify()` will also fail if cancelled requests
    * were not explicitly matched.
    */
  def verify(): Unit = js.native
  def verify(opts: Anon_IgnoreCancelled): Unit = js.native
}

