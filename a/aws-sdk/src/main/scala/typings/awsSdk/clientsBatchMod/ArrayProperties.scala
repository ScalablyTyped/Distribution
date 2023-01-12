package typings.awsSdk.clientsBatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrayProperties extends StObject {
  
  /**
    * The size of the array job.
    */
  var size: js.UndefOr[Integer] = js.undefined
}
object ArrayProperties {
  
  inline def apply(): ArrayProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArrayProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArrayProperties] (val x: Self) extends AnyVal {
    
    inline def setSize(value: Integer): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
