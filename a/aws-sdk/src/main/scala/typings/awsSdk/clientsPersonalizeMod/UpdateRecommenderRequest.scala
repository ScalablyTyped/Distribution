package typings.awsSdk.clientsPersonalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateRecommenderRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the recommender to modify.
    */
  var recommenderArn: Arn
  
  /**
    * The configuration details of the recommender.
    */
  var recommenderConfig: RecommenderConfig
}
object UpdateRecommenderRequest {
  
  inline def apply(recommenderArn: Arn, recommenderConfig: RecommenderConfig): UpdateRecommenderRequest = {
    val __obj = js.Dynamic.literal(recommenderArn = recommenderArn.asInstanceOf[js.Any], recommenderConfig = recommenderConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRecommenderRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateRecommenderRequest] (val x: Self) extends AnyVal {
    
    inline def setRecommenderArn(value: Arn): Self = StObject.set(x, "recommenderArn", value.asInstanceOf[js.Any])
    
    inline def setRecommenderConfig(value: RecommenderConfig): Self = StObject.set(x, "recommenderConfig", value.asInstanceOf[js.Any])
  }
}
