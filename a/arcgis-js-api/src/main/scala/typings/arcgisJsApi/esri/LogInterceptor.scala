package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.error
import typings.arcgisJsApi.arcgisJsApiStrings.info
import typings.arcgisJsApi.arcgisJsApiStrings.warn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogInterceptor extends StObject {
  
  def apply(level: error, module: String, args: js.Any*): Boolean = js.native
  def apply(level: info, module: String, args: js.Any*): Boolean = js.native
  def apply(level: warn, module: String, args: js.Any*): Boolean = js.native
}
