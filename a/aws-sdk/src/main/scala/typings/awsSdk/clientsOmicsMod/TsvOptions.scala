package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TsvOptions extends StObject {
  
  /**
    * The file's read options.
    */
  var readOptions: js.UndefOr[ReadOptions] = js.undefined
}
object TsvOptions {
  
  inline def apply(): TsvOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TsvOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TsvOptions] (val x: Self) extends AnyVal {
    
    inline def setReadOptions(value: ReadOptions): Self = StObject.set(x, "readOptions", value.asInstanceOf[js.Any])
    
    inline def setReadOptionsUndefined: Self = StObject.set(x, "readOptions", js.undefined)
  }
}
