package typings.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectLambdaTransformationConfiguration extends StObject {
  
  /**
    * A container for the action of an Object Lambda Access Point configuration. Valid inputs are GetObject, ListObjects, HeadObject, and ListObjectsV2.
    */
  var Actions: ObjectLambdaTransformationConfigurationActionsList
  
  /**
    * A container for the content transformation of an Object Lambda Access Point configuration.
    */
  var ContentTransformation: ObjectLambdaContentTransformation
}
object ObjectLambdaTransformationConfiguration {
  
  inline def apply(
    Actions: ObjectLambdaTransformationConfigurationActionsList,
    ContentTransformation: ObjectLambdaContentTransformation
  ): ObjectLambdaTransformationConfiguration = {
    val __obj = js.Dynamic.literal(Actions = Actions.asInstanceOf[js.Any], ContentTransformation = ContentTransformation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectLambdaTransformationConfiguration]
  }
  
  extension [Self <: ObjectLambdaTransformationConfiguration](x: Self) {
    
    inline def setActions(value: ObjectLambdaTransformationConfigurationActionsList): Self = StObject.set(x, "Actions", value.asInstanceOf[js.Any])
    
    inline def setActionsVarargs(value: ObjectLambdaTransformationConfigurationAction*): Self = StObject.set(x, "Actions", js.Array(value*))
    
    inline def setContentTransformation(value: ObjectLambdaContentTransformation): Self = StObject.set(x, "ContentTransformation", value.asInstanceOf[js.Any])
  }
}
