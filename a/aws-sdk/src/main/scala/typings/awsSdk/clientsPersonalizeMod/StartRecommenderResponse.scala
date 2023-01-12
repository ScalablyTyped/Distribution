package typings.awsSdk.clientsPersonalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartRecommenderResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the recommender you started.
    */
  var recommenderArn: js.UndefOr[Arn] = js.undefined
}
object StartRecommenderResponse {
  
  inline def apply(): StartRecommenderResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartRecommenderResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartRecommenderResponse] (val x: Self) extends AnyVal {
    
    inline def setRecommenderArn(value: Arn): Self = StObject.set(x, "recommenderArn", value.asInstanceOf[js.Any])
    
    inline def setRecommenderArnUndefined: Self = StObject.set(x, "recommenderArn", js.undefined)
  }
}
