package typings.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectLambdaAccessPoint extends StObject {
  
  /**
    * The name of the Object Lambda Access Point.
    */
  var Name: ObjectLambdaAccessPointName
  
  /**
    * Specifies the ARN for the Object Lambda Access Point.
    */
  var ObjectLambdaAccessPointArn: js.UndefOr[typings.awsSdk.clientsS3controlMod.ObjectLambdaAccessPointArn] = js.undefined
}
object ObjectLambdaAccessPoint {
  
  inline def apply(Name: ObjectLambdaAccessPointName): ObjectLambdaAccessPoint = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectLambdaAccessPoint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ObjectLambdaAccessPoint] (val x: Self) extends AnyVal {
    
    inline def setName(value: ObjectLambdaAccessPointName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setObjectLambdaAccessPointArn(value: ObjectLambdaAccessPointArn): Self = StObject.set(x, "ObjectLambdaAccessPointArn", value.asInstanceOf[js.Any])
    
    inline def setObjectLambdaAccessPointArnUndefined: Self = StObject.set(x, "ObjectLambdaAccessPointArn", js.undefined)
  }
}
