package typings.awsSdk.clientsPersonalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeRecommenderRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the recommender to describe.
    */
  var recommenderArn: Arn
}
object DescribeRecommenderRequest {
  
  inline def apply(recommenderArn: Arn): DescribeRecommenderRequest = {
    val __obj = js.Dynamic.literal(recommenderArn = recommenderArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeRecommenderRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeRecommenderRequest] (val x: Self) extends AnyVal {
    
    inline def setRecommenderArn(value: Arn): Self = StObject.set(x, "recommenderArn", value.asInstanceOf[js.Any])
  }
}
