package typings.angularCommon

import typings.angularCommon.httpHttpMod.HttpEvent
import typings.angularCommon.httpMod.HttpRequest
import typings.rxjs.typesMod.Observer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testingMod {
  
  @JSImport("@angular/common/http/testing", "HttpClientTestingModule")
  @js.native
  class HttpClientTestingModule ()
    extends typings.angularCommon.testingTestingMod.HttpClientTestingModule
  
  @JSImport("@angular/common/http/testing", "HttpTestingController")
  @js.native
  abstract class HttpTestingController ()
    extends typings.angularCommon.testingTestingMod.HttpTestingController
  
  @JSImport("@angular/common/http/testing", "TestRequest")
  @js.native
  class TestRequest protected ()
    extends typings.angularCommon.testingTestingMod.TestRequest {
    def this(request: HttpRequest[js.Any], observer: Observer[HttpEvent[js.Any]]) = this()
  }
  
  @JSImport("@angular/common/http/testing", "\u0275angular_packages_common_http_testing_testing_a")
  @js.native
  class ɵangularPackagesCommonHttpTestingTestingA ()
    extends typings.angularCommon.testingTestingMod.ɵangularPackagesCommonHttpTestingTestingA
}
