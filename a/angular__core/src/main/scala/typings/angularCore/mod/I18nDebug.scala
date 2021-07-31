package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait I18nDebug extends StObject {
  
  /**
    * Human readable representation of the OpCode arrays.
    *
    * NOTE: This property only exists if `ngDevMode` is set to `true` and it is not present in
    * production. Its presence is purely to help debug issue in development, and should not be relied
    * on in production application.
    */
  var debug: js.UndefOr[js.Array[String]] = js.undefined
}
object I18nDebug {
  
  @scala.inline
  def apply(): I18nDebug = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[I18nDebug]
  }
  
  @scala.inline
  implicit class I18nDebugMutableBuilder[Self <: I18nDebug] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDebug(value: js.Array[String]): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    @scala.inline
    def setDebugVarargs(value: String*): Self = StObject.set(x, "debug", js.Array(value :_*))
  }
}
