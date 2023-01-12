package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserDefinedFunctionInput extends StObject {
  
  /**
    * The Java class that contains the function code.
    */
  var ClassName: js.UndefOr[NameString] = js.undefined
  
  /**
    * The name of the function.
    */
  var FunctionName: js.UndefOr[NameString] = js.undefined
  
  /**
    * The owner of the function.
    */
  var OwnerName: js.UndefOr[NameString] = js.undefined
  
  /**
    * The owner type.
    */
  var OwnerType: js.UndefOr[PrincipalType] = js.undefined
  
  /**
    * The resource URIs for the function.
    */
  var ResourceUris: js.UndefOr[ResourceUriList] = js.undefined
}
object UserDefinedFunctionInput {
  
  inline def apply(): UserDefinedFunctionInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserDefinedFunctionInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UserDefinedFunctionInput] (val x: Self) extends AnyVal {
    
    inline def setClassName(value: NameString): Self = StObject.set(x, "ClassName", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "ClassName", js.undefined)
    
    inline def setFunctionName(value: NameString): Self = StObject.set(x, "FunctionName", value.asInstanceOf[js.Any])
    
    inline def setFunctionNameUndefined: Self = StObject.set(x, "FunctionName", js.undefined)
    
    inline def setOwnerName(value: NameString): Self = StObject.set(x, "OwnerName", value.asInstanceOf[js.Any])
    
    inline def setOwnerNameUndefined: Self = StObject.set(x, "OwnerName", js.undefined)
    
    inline def setOwnerType(value: PrincipalType): Self = StObject.set(x, "OwnerType", value.asInstanceOf[js.Any])
    
    inline def setOwnerTypeUndefined: Self = StObject.set(x, "OwnerType", js.undefined)
    
    inline def setResourceUris(value: ResourceUriList): Self = StObject.set(x, "ResourceUris", value.asInstanceOf[js.Any])
    
    inline def setResourceUrisUndefined: Self = StObject.set(x, "ResourceUris", js.undefined)
    
    inline def setResourceUrisVarargs(value: ResourceUri*): Self = StObject.set(x, "ResourceUris", js.Array(value*))
  }
}
