package typings.awsSdk.clientsResiliencehubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAppInputSourceResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Resilience Hub application. The format for this ARN is: arn:partition:resiliencehub:region:account:app/app-id. For more information about ARNs, see  Amazon Resource Names (ARNs) in the AWS General Reference guide.
    */
  var appArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The name of the input source from where the application resource is imported from.
    */
  var appInputSource: js.UndefOr[AppInputSource] = js.undefined
}
object DeleteAppInputSourceResponse {
  
  inline def apply(): DeleteAppInputSourceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteAppInputSourceResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteAppInputSourceResponse] (val x: Self) extends AnyVal {
    
    inline def setAppArn(value: Arn): Self = StObject.set(x, "appArn", value.asInstanceOf[js.Any])
    
    inline def setAppArnUndefined: Self = StObject.set(x, "appArn", js.undefined)
    
    inline def setAppInputSource(value: AppInputSource): Self = StObject.set(x, "appInputSource", value.asInstanceOf[js.Any])
    
    inline def setAppInputSourceUndefined: Self = StObject.set(x, "appInputSource", js.undefined)
  }
}
