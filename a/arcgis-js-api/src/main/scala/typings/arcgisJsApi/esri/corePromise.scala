package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait corePromise extends StObject {
  
  /**
  		 * `isFulfilled()` may be used to verify if creating an instance of the class is fulfilled (either resolved or rejected).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Promise.html#isFulfilled)
  		 */
  def isFulfilled(): Boolean = js.native
  
  /**
  		 * `isRejected()` may be used to verify if creating an instance of the class is rejected.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Promise.html#isRejected)
  		 */
  def isRejected(): Boolean = js.native
  
  /**
  		 * `isResolved()` may be used to verify if creating an instance of the class is resolved.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Promise.html#isResolved)
  		 */
  def isResolved(): Boolean = js.native
  
  /**
  		 * `when()` may be leveraged once an instance of the class is created.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Promise.html#when)
  		 */
  def when(): js.Promise[Any] = js.native
  def when(callback: js.Function): js.Promise[Any] = js.native
  def when(callback: js.Function, errback: js.Function): js.Promise[Any] = js.native
  def when(callback: scala.Unit, errback: js.Function): js.Promise[Any] = js.native
}
