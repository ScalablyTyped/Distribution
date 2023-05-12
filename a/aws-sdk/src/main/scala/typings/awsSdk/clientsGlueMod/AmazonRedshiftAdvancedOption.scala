package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AmazonRedshiftAdvancedOption extends StObject {
  
  /**
    * The key when specifying a key-value pair.
    */
  var Key: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The value when specifying a key-value pair.
    */
  var Value: js.UndefOr[GenericString] = js.undefined
}
object AmazonRedshiftAdvancedOption {
  
  inline def apply(): AmazonRedshiftAdvancedOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AmazonRedshiftAdvancedOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AmazonRedshiftAdvancedOption] (val x: Self) extends AnyVal {
    
    inline def setKey(value: GenericString): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    
    inline def setValue(value: GenericString): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
