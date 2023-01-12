package typings.awsSdk.clientsPersonalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartRecommenderRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the recommender to start.
    */
  var recommenderArn: Arn
}
object StartRecommenderRequest {
  
  inline def apply(recommenderArn: Arn): StartRecommenderRequest = {
    val __obj = js.Dynamic.literal(recommenderArn = recommenderArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartRecommenderRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartRecommenderRequest] (val x: Self) extends AnyVal {
    
    inline def setRecommenderArn(value: Arn): Self = StObject.set(x, "recommenderArn", value.asInstanceOf[js.Any])
  }
}
