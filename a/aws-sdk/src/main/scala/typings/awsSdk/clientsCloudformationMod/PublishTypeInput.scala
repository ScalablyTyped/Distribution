package typings.awsSdk.clientsCloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublishTypeInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the extension. Conditional: You must specify Arn, or TypeName and Type.
    */
  var Arn: js.UndefOr[PrivateTypeArn] = js.undefined
  
  /**
    * The version number to assign to this version of the extension. Use the following format, and adhere to semantic versioning when assigning a version number to your extension:  MAJOR.MINOR.PATCH  For more information, see Semantic Versioning 2.0.0. If you don't specify a version number, CloudFormation increments the version number by one minor version release. You cannot specify a version number the first time you publish a type. CloudFormation automatically sets the first version number to be 1.0.0.
    */
  var PublicVersionNumber: js.UndefOr[typings.awsSdk.clientsCloudformationMod.PublicVersionNumber] = js.undefined
  
  /**
    * The type of the extension. Conditional: You must specify Arn, or TypeName and Type.
    */
  var Type: js.UndefOr[ThirdPartyType] = js.undefined
  
  /**
    * The name of the extension. Conditional: You must specify Arn, or TypeName and Type.
    */
  var TypeName: js.UndefOr[typings.awsSdk.clientsCloudformationMod.TypeName] = js.undefined
}
object PublishTypeInput {
  
  inline def apply(): PublishTypeInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublishTypeInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PublishTypeInput] (val x: Self) extends AnyVal {
    
    inline def setArn(value: PrivateTypeArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setPublicVersionNumber(value: PublicVersionNumber): Self = StObject.set(x, "PublicVersionNumber", value.asInstanceOf[js.Any])
    
    inline def setPublicVersionNumberUndefined: Self = StObject.set(x, "PublicVersionNumber", js.undefined)
    
    inline def setType(value: ThirdPartyType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeName(value: TypeName): Self = StObject.set(x, "TypeName", value.asInstanceOf[js.Any])
    
    inline def setTypeNameUndefined: Self = StObject.set(x, "TypeName", js.undefined)
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
