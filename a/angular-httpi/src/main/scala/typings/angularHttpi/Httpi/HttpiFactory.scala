package typings.angularHttpi.Httpi

import typings.angular.mod.IHttpPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpiFactory extends js.Object {
  
  def apply(config: HttpiPayload): IHttpPromise[js.Object] = js.native
  
  def resource(url: String): HttpiResource = js.native
}
