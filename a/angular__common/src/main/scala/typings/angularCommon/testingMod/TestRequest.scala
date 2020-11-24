package typings.angularCommon.testingMod

import typings.angularCommon.httpHttpMod.HttpEvent
import typings.angularCommon.httpMod.HttpRequest
import typings.rxjs.typesMod.Observer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/common/http/testing", "TestRequest")
@js.native
class TestRequest protected ()
  extends typings.angularCommon.testingTestingMod.TestRequest {
  def this(request: HttpRequest[_], observer: Observer[HttpEvent[_]]) = this()
}
