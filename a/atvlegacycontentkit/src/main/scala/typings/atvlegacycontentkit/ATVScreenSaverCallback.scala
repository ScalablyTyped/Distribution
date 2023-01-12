package typings.atvlegacycontentkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A callback for when the app is ready to return the results of a screensaver query.
  */
// tslint:disable-next-line:strict-export-declare-modifiers
trait ATVScreenSaverCallback extends StObject {
  
  /**
    * The photos were not successfully queried. Return an error. The screensaver will just show a default screensaver instead.
    * @param error An error to display in the syslog.
    */
  def failure(error: Any): Unit
  
  /**
    * The photos were successfully queried. Return them to the ATV.
    * @param photos The photos that were queried.
    */
  def success(photos: js.Array[ATVScreenSaverPhoto]): Unit
}
object ATVScreenSaverCallback {
  
  inline def apply(failure: Any => Unit, success: js.Array[ATVScreenSaverPhoto] => Unit): ATVScreenSaverCallback = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[ATVScreenSaverCallback]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ATVScreenSaverCallback] (val x: Self) extends AnyVal {
    
    inline def setFailure(value: Any => Unit): Self = StObject.set(x, "failure", js.Any.fromFunction1(value))
    
    inline def setSuccess(value: js.Array[ATVScreenSaverPhoto] => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
