package typings.angularOdataResources.OData

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProviderCallback[T] extends StObject {
  
  def apply(queryString: String, success: js.Function0[_], error: js.Function0[_]): T = js.native
  def apply(
    queryString: String,
    success: js.Function0[_],
    error: js.Function0[_],
    isSingleElement: js.UndefOr[scala.Nothing],
    forceSingleElement: Boolean
  ): T = js.native
  def apply(queryString: String, success: js.Function0[_], error: js.Function0[_], isSingleElement: Boolean): T = js.native
  def apply(
    queryString: String,
    success: js.Function0[_],
    error: js.Function0[_],
    isSingleElement: Boolean,
    forceSingleElement: Boolean
  ): T = js.native
}
