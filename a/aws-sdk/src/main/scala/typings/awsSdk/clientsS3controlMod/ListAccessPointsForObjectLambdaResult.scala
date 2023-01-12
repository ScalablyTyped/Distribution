package typings.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAccessPointsForObjectLambdaResult extends StObject {
  
  /**
    * If the list has more access points than can be returned in one call to this API, this field contains a continuation token that you can provide in subsequent calls to this API to retrieve additional access points.
    */
  var NextToken: js.UndefOr[NonEmptyMaxLength1024String] = js.undefined
  
  /**
    * Returns list of Object Lambda Access Points.
    */
  var ObjectLambdaAccessPointList: js.UndefOr[typings.awsSdk.clientsS3controlMod.ObjectLambdaAccessPointList] = js.undefined
}
object ListAccessPointsForObjectLambdaResult {
  
  inline def apply(): ListAccessPointsForObjectLambdaResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAccessPointsForObjectLambdaResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListAccessPointsForObjectLambdaResult] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NonEmptyMaxLength1024String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setObjectLambdaAccessPointList(value: ObjectLambdaAccessPointList): Self = StObject.set(x, "ObjectLambdaAccessPointList", value.asInstanceOf[js.Any])
    
    inline def setObjectLambdaAccessPointListUndefined: Self = StObject.set(x, "ObjectLambdaAccessPointList", js.undefined)
    
    inline def setObjectLambdaAccessPointListVarargs(value: ObjectLambdaAccessPoint*): Self = StObject.set(x, "ObjectLambdaAccessPointList", js.Array(value*))
  }
}
