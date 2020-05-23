package typings.angularCommon.httpMod

import typings.angularCommon.anon.Body
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common/http", "HttpResponse")
@js.native
/**
  * Construct a new `HttpResponse`.
  */
class HttpResponse[T] ()
  extends typings.angularCommon.httpHttpMod.HttpResponse[T] {
  def this(init: Body[T]) = this()
}

