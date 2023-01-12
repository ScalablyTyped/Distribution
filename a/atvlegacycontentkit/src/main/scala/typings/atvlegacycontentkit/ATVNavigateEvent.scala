package typings.atvlegacycontentkit

import typings.atvlegacycontentkit.atv.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The event type used for onNavigate and onRefresh.
  */
// tslint:disable-next-line:strict-export-declare-modifiers
trait ATVNavigateEvent extends StObject {
  
  /**
    * Loading the page failed, so show an error message to the user.
    * @param errorMessage The error message to show to the user.
    */
  def failure(errorMessage: String): Unit
  
  /**
    * The ID of the navigation item to navigate to.
    */
  var navigationItemId: String
  
  /**
    * The loading of the page to navigate to was successful, so load it.
    * @param document The document to load.
    */
  def success(document: Document): Unit
}
object ATVNavigateEvent {
  
  inline def apply(failure: String => Unit, navigationItemId: String, success: Document => Unit): ATVNavigateEvent = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), navigationItemId = navigationItemId.asInstanceOf[js.Any], success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[ATVNavigateEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ATVNavigateEvent] (val x: Self) extends AnyVal {
    
    inline def setFailure(value: String => Unit): Self = StObject.set(x, "failure", js.Any.fromFunction1(value))
    
    inline def setNavigationItemId(value: String): Self = StObject.set(x, "navigationItemId", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: Document => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
