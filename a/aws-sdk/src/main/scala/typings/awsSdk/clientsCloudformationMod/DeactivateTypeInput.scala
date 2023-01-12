package typings.awsSdk.clientsCloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeactivateTypeInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the extension, in this account and region. Conditional: You must specify either Arn, or TypeName and Type.
    */
  var Arn: js.UndefOr[PrivateTypeArn] = js.undefined
  
  /**
    * The extension type. Conditional: You must specify either Arn, or TypeName and Type.
    */
  var Type: js.UndefOr[ThirdPartyType] = js.undefined
  
  /**
    * The type name of the extension, in this account and region. If you specified a type name alias when enabling the extension, use the type name alias. Conditional: You must specify either Arn, or TypeName and Type.
    */
  var TypeName: js.UndefOr[typings.awsSdk.clientsCloudformationMod.TypeName] = js.undefined
}
object DeactivateTypeInput {
  
  inline def apply(): DeactivateTypeInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeactivateTypeInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeactivateTypeInput] (val x: Self) extends AnyVal {
    
    inline def setArn(value: PrivateTypeArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setType(value: ThirdPartyType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeName(value: TypeName): Self = StObject.set(x, "TypeName", value.asInstanceOf[js.Any])
    
    inline def setTypeNameUndefined: Self = StObject.set(x, "TypeName", js.undefined)
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
