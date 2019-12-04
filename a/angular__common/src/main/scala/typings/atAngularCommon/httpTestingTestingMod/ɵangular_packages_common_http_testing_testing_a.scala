package typings.atAngularCommon.httpTestingTestingMod

import typings.atAngularCommon.Anon_IgnoreCancelled
import typings.atAngularCommon.httpHttpMod.HttpBackend
import typings.atAngularCommon.httpHttpMod.HttpEvent
import typings.atAngularCommon.httpMod.HttpRequest
import typings.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atAngularCommon.httpTestingTestingMod.HttpTestingController because Inheritance from two classes. Inlined `match`, `match`, `match`, expectOne, expectOne, expectOne, expectOne, expectOne, expectOne, expectOne, expectOne, expectOne, expectOne, expectOne, expectOne, expectNone, expectNone, expectNone, expectNone, expectNone, expectNone, expectNone, expectNone, expectNone, expectNone, expectNone, expectNone, verify, verify */ @JSImport("@angular/common/http/testing/testing", "ɵangular_packages_common_http_testing_testing_a")
@js.native
class ɵangular_packages_common_http_testing_testing_a () extends HttpBackend {
  /**
    * Helper function to search for requests in the list of open requests.
    */
  var _match: js.Any = js.native
  var descriptionFromMatcher: js.Any = js.native
  /**
    * List of pending requests which have not yet been expected.
    */
  var open: js.Any = js.native
  /**
    * Expect that no outstanding requests match the given matcher, and throw an error
    * if any do.
    */
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
  def expectNone(`match`: String): Unit = js.native
  def expectNone(`match`: String, description: String): Unit = js.native
  /**
    * Expect that no requests have been made which match the given predicate function.
    *
    * If a matching request has been made, fail with an error message including the given request
    * description, if any.
    */
  def expectNone(`match`: js.Function1[/* req */ HttpRequest[_], Boolean]): Unit = js.native
  def expectNone(`match`: js.Function1[/* req */ HttpRequest[_], Boolean], description: String): Unit = js.native
  /**
    * Expect that no requests have been made which match the given parameters.
    *
    * If a matching request has been made, fail with an error message including the given request
    * description, if any.
    */
  def expectNone(`match`: RequestMatch): Unit = js.native
  def expectNone(`match`: RequestMatch, description: String): Unit = js.native
  /**
    * Expect that a single outstanding request matches the given matcher, and return
    * it.
    *
    * Requests returned through this API will no longer be in the list of open requests,
    * and thus will not match twice.
    */
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
  def expectOne(`match`: String): TestRequest = js.native
  def expectOne(`match`: String, description: String): TestRequest = js.native
  /**
    * Expect that a single request has been made which matches the given predicate function, and
    * return its mock.
    *
    * If no such request has been made, or more than one such request has been made, fail with an
    * error message including the given request description, if any.
    */
  def expectOne(`match`: js.Function1[/* req */ HttpRequest[_], Boolean]): TestRequest = js.native
  def expectOne(`match`: js.Function1[/* req */ HttpRequest[_], Boolean], description: String): TestRequest = js.native
  /**
    * Expect that a single request has been made which matches the given parameters, and return
    * its mock.
    *
    * If no such request has been made, or more than one such request has been made, fail with an
    * error message including the given request description, if any.
    */
  def expectOne(`match`: RequestMatch): TestRequest = js.native
  def expectOne(`match`: RequestMatch, description: String): TestRequest = js.native
  /**
    * Handle an incoming request by queueing it in the list of open requests.
    */
  def handle(req: HttpRequest[_]): Observable[HttpEvent[_]] = js.native
  /**
    * Search for requests in the list of open requests, and return all that match
    * without asserting anything about the number of matches.
    */
  /**
    * Search for requests that match the given parameter, without any expectations.
    */
  def `match`(`match`: String): js.Array[TestRequest] = js.native
  def `match`(`match`: js.Function1[/* req */ HttpRequest[_], Boolean]): js.Array[TestRequest] = js.native
  def `match`(`match`: RequestMatch): js.Array[TestRequest] = js.native
  /**
    * Validate that there are no outstanding requests.
    */
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

