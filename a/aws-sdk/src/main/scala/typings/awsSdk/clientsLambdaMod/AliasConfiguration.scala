package typings.awsSdk.clientsLambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AliasConfiguration extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the alias.
    */
  var AliasArn: js.UndefOr[FunctionArn] = js.undefined
  
  /**
    * A description of the alias.
    */
  var Description: js.UndefOr[typings.awsSdk.clientsLambdaMod.Description] = js.undefined
  
  /**
    * The function version that the alias invokes.
    */
  var FunctionVersion: js.UndefOr[Version] = js.undefined
  
  /**
    * The name of the alias.
    */
  var Name: js.UndefOr[Alias] = js.undefined
  
  /**
    * A unique identifier that changes when you update the alias.
    */
  var RevisionId: js.UndefOr[String] = js.undefined
  
  /**
    * The routing configuration of the alias.
    */
  var RoutingConfig: js.UndefOr[AliasRoutingConfiguration] = js.undefined
}
object AliasConfiguration {
  
  inline def apply(): AliasConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AliasConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AliasConfiguration] (val x: Self) extends AnyVal {
    
    inline def setAliasArn(value: FunctionArn): Self = StObject.set(x, "AliasArn", value.asInstanceOf[js.Any])
    
    inline def setAliasArnUndefined: Self = StObject.set(x, "AliasArn", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setFunctionVersion(value: Version): Self = StObject.set(x, "FunctionVersion", value.asInstanceOf[js.Any])
    
    inline def setFunctionVersionUndefined: Self = StObject.set(x, "FunctionVersion", js.undefined)
    
    inline def setName(value: Alias): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setRevisionId(value: String): Self = StObject.set(x, "RevisionId", value.asInstanceOf[js.Any])
    
    inline def setRevisionIdUndefined: Self = StObject.set(x, "RevisionId", js.undefined)
    
    inline def setRoutingConfig(value: AliasRoutingConfiguration): Self = StObject.set(x, "RoutingConfig", value.asInstanceOf[js.Any])
    
    inline def setRoutingConfigUndefined: Self = StObject.set(x, "RoutingConfig", js.undefined)
  }
}
