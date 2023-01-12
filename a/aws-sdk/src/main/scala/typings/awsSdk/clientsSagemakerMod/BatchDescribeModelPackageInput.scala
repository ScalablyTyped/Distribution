package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDescribeModelPackageInput extends StObject {
  
  /**
    * The list of Amazon Resource Name (ARN) of the model package groups.
    */
  var ModelPackageArnList: typings.awsSdk.clientsSagemakerMod.ModelPackageArnList
}
object BatchDescribeModelPackageInput {
  
  inline def apply(ModelPackageArnList: ModelPackageArnList): BatchDescribeModelPackageInput = {
    val __obj = js.Dynamic.literal(ModelPackageArnList = ModelPackageArnList.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDescribeModelPackageInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchDescribeModelPackageInput] (val x: Self) extends AnyVal {
    
    inline def setModelPackageArnList(value: ModelPackageArnList): Self = StObject.set(x, "ModelPackageArnList", value.asInstanceOf[js.Any])
    
    inline def setModelPackageArnListVarargs(value: ModelPackageArn*): Self = StObject.set(x, "ModelPackageArnList", js.Array(value*))
  }
}
