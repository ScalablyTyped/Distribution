package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParameterDeclaration extends StObject {
  
  /**
    * A parameter declaration for the DateTime data type.
    */
  var DateTimeParameterDeclaration: js.UndefOr[typings.awsSdk.clientsQuicksightMod.DateTimeParameterDeclaration] = js.undefined
  
  /**
    * A parameter declaration for the Decimal data type.
    */
  var DecimalParameterDeclaration: js.UndefOr[typings.awsSdk.clientsQuicksightMod.DecimalParameterDeclaration] = js.undefined
  
  /**
    * A parameter declaration for the Integer data type.
    */
  var IntegerParameterDeclaration: js.UndefOr[typings.awsSdk.clientsQuicksightMod.IntegerParameterDeclaration] = js.undefined
  
  /**
    * A parameter declaration for the String data type.
    */
  var StringParameterDeclaration: js.UndefOr[typings.awsSdk.clientsQuicksightMod.StringParameterDeclaration] = js.undefined
}
object ParameterDeclaration {
  
  inline def apply(): ParameterDeclaration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParameterDeclaration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParameterDeclaration] (val x: Self) extends AnyVal {
    
    inline def setDateTimeParameterDeclaration(value: DateTimeParameterDeclaration): Self = StObject.set(x, "DateTimeParameterDeclaration", value.asInstanceOf[js.Any])
    
    inline def setDateTimeParameterDeclarationUndefined: Self = StObject.set(x, "DateTimeParameterDeclaration", js.undefined)
    
    inline def setDecimalParameterDeclaration(value: DecimalParameterDeclaration): Self = StObject.set(x, "DecimalParameterDeclaration", value.asInstanceOf[js.Any])
    
    inline def setDecimalParameterDeclarationUndefined: Self = StObject.set(x, "DecimalParameterDeclaration", js.undefined)
    
    inline def setIntegerParameterDeclaration(value: IntegerParameterDeclaration): Self = StObject.set(x, "IntegerParameterDeclaration", value.asInstanceOf[js.Any])
    
    inline def setIntegerParameterDeclarationUndefined: Self = StObject.set(x, "IntegerParameterDeclaration", js.undefined)
    
    inline def setStringParameterDeclaration(value: StringParameterDeclaration): Self = StObject.set(x, "StringParameterDeclaration", value.asInstanceOf[js.Any])
    
    inline def setStringParameterDeclarationUndefined: Self = StObject.set(x, "StringParameterDeclaration", js.undefined)
  }
}
