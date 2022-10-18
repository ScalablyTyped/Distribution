package typings.awsSdk.anon

import typings.awsSdk.clientsSagemakerMod.ImageName
import typings.awsSdk.libServiceMod.WaiterConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined aws-sdk.aws-sdk/clients/sagemaker.DescribeImageRequest & {  $waiter :aws-sdk.aws-sdk/lib/service.WaiterConfiguration | undefined} */
trait DescribeImageRequestwaite extends StObject {
  
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.undefined
  
  /**
    * The name of the image to describe.
    */
  var ImageName: typings.awsSdk.clientsSagemakerMod.ImageName
}
object DescribeImageRequestwaite {
  
  inline def apply(ImageName: ImageName): DescribeImageRequestwaite = {
    val __obj = js.Dynamic.literal(ImageName = ImageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeImageRequestwaite]
  }
  
  extension [Self <: DescribeImageRequestwaite](x: Self) {
    
    inline def set$waiter(value: WaiterConfiguration): Self = StObject.set(x, "$waiter", value.asInstanceOf[js.Any])
    
    inline def set$waiterUndefined: Self = StObject.set(x, "$waiter", js.undefined)
    
    inline def setImageName(value: ImageName): Self = StObject.set(x, "ImageName", value.asInstanceOf[js.Any])
  }
}
