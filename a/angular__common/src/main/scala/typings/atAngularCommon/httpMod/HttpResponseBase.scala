package typings.atAngularCommon.httpMod

import typings.atAngularCommon.Anon_Headers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common/http", "HttpResponseBase")
@js.native
abstract class HttpResponseBase protected ()
  extends typings.atAngularCommon.httpHttpMod.HttpResponseBase {
  /**
    * Super-constructor for all responses.
    *
    * The single parameter accepted is an initialization hash. Any properties
    * of the response passed there will override the default values.
    */
  def this(init: Anon_Headers) = this()
  def this(init: Anon_Headers, defaultStatus: Double) = this()
  def this(init: Anon_Headers, defaultStatus: Double, defaultStatusText: String) = this()
}

