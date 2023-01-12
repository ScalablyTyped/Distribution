package typings.awsSdk.clientsPersonalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRecommenderResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the recommender.
    */
  var recommenderArn: js.UndefOr[Arn] = js.undefined
}
object CreateRecommenderResponse {
  
  inline def apply(): CreateRecommenderResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateRecommenderResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateRecommenderResponse] (val x: Self) extends AnyVal {
    
    inline def setRecommenderArn(value: Arn): Self = StObject.set(x, "recommenderArn", value.asInstanceOf[js.Any])
    
    inline def setRecommenderArnUndefined: Self = StObject.set(x, "recommenderArn", js.undefined)
  }
}
