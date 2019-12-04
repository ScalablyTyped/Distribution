package typings.atAngularCommon

import typings.atAngularCommon.httpHttpMod.HttpEvent
import typings.atAngularCommon.httpMod.HttpRequest
import typings.rxjs.internalTypesMod.Observer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common/http/testing", JSImport.Namespace)
@js.native
object httpTestingMod extends js.Object {
  @js.native
  class HttpClientTestingModule ()
    extends typings.atAngularCommon.httpTestingTestingMod.HttpClientTestingModule
  
  @js.native
  abstract class HttpTestingController ()
    extends typings.atAngularCommon.httpTestingTestingMod.HttpTestingController
  
  @js.native
  class TestRequest protected ()
    extends typings.atAngularCommon.httpTestingTestingMod.TestRequest {
    def this(request: HttpRequest[_], observer: Observer[HttpEvent[_]]) = this()
  }
  
  @js.native
  class ɵangular_packages_common_http_testing_testing_a ()
    extends typings.atAngularCommon.httpTestingTestingMod.ɵangular_packages_common_http_testing_testing_a
  
}

