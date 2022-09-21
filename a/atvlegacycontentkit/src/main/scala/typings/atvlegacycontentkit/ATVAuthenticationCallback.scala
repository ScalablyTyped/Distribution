package typings.atvlegacycontentkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The callback used when the app has finished a login request.
  */
// tslint:disable-next-line:strict-export-declare-modifiers
trait ATVAuthenticationCallback extends StObject {
  
  /**
    * If the login request failed, return an error.
    * @param error The error that is displayed to the user.
    */
  def failure(error: String): Unit
  
  /**
    * The authentication was successful.
    */
  def success(): Unit
}
object ATVAuthenticationCallback {
  
  inline def apply(failure: String => Unit, success: () => Unit): ATVAuthenticationCallback = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction0(success))
    __obj.asInstanceOf[ATVAuthenticationCallback]
  }
  
  extension [Self <: ATVAuthenticationCallback](x: Self) {
    
    inline def setFailure(value: String => Unit): Self = StObject.set(x, "failure", js.Any.fromFunction1(value))
    
    inline def setSuccess(value: () => Unit): Self = StObject.set(x, "success", js.Any.fromFunction0(value))
  }
}
