package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProcessorFeature extends StObject {
  
  /**
    * The name of the processor feature. Valid names are coreCount and threadsPerCore.
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    * The value of a processor feature name.
    */
  var Value: js.UndefOr[String] = js.undefined
}
object ProcessorFeature {
  
  inline def apply(): ProcessorFeature = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProcessorFeature]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProcessorFeature] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
