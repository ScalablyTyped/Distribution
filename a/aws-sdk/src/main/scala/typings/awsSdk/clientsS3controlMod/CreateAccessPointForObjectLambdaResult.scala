package typings.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAccessPointForObjectLambdaResult extends StObject {
  
  /**
    * The alias of the Object Lambda Access Point.
    */
  var Alias: js.UndefOr[ObjectLambdaAccessPointAlias] = js.undefined
  
  /**
    * Specifies the ARN for the Object Lambda Access Point.
    */
  var ObjectLambdaAccessPointArn: js.UndefOr[typings.awsSdk.clientsS3controlMod.ObjectLambdaAccessPointArn] = js.undefined
}
object CreateAccessPointForObjectLambdaResult {
  
  inline def apply(): CreateAccessPointForObjectLambdaResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAccessPointForObjectLambdaResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateAccessPointForObjectLambdaResult] (val x: Self) extends AnyVal {
    
    inline def setAlias(value: ObjectLambdaAccessPointAlias): Self = StObject.set(x, "Alias", value.asInstanceOf[js.Any])
    
    inline def setAliasUndefined: Self = StObject.set(x, "Alias", js.undefined)
    
    inline def setObjectLambdaAccessPointArn(value: ObjectLambdaAccessPointArn): Self = StObject.set(x, "ObjectLambdaAccessPointArn", value.asInstanceOf[js.Any])
    
    inline def setObjectLambdaAccessPointArnUndefined: Self = StObject.set(x, "ObjectLambdaAccessPointArn", js.undefined)
  }
}
