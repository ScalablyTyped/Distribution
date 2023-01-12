package typings.awsSdk.clientsInspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RulesPackage extends StObject {
  
  /**
    * The ARN of the rules package.
    */
  var arn: Arn
  
  /**
    * The description of the rules package.
    */
  var description: js.UndefOr[Text] = js.undefined
  
  /**
    * The name of the rules package.
    */
  var name: RulesPackageName
  
  /**
    * The provider of the rules package.
    */
  var provider: ProviderName
  
  /**
    * The version ID of the rules package.
    */
  var version: Version
}
object RulesPackage {
  
  inline def apply(arn: Arn, name: RulesPackageName, provider: ProviderName, version: Version): RulesPackage = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[RulesPackage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RulesPackage] (val x: Self) extends AnyVal {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: Text): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: RulesPackageName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProvider(value: ProviderName): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: Version): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
