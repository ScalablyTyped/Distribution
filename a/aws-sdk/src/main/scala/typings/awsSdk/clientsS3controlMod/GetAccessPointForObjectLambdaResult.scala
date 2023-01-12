package typings.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAccessPointForObjectLambdaResult extends StObject {
  
  /**
    * The date and time when the specified Object Lambda Access Point was created.
    */
  var CreationDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the Object Lambda Access Point.
    */
  var Name: js.UndefOr[ObjectLambdaAccessPointName] = js.undefined
  
  /**
    * Configuration to block all public access. This setting is turned on and can not be edited. 
    */
  var PublicAccessBlockConfiguration: js.UndefOr[typings.awsSdk.clientsS3controlMod.PublicAccessBlockConfiguration] = js.undefined
}
object GetAccessPointForObjectLambdaResult {
  
  inline def apply(): GetAccessPointForObjectLambdaResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAccessPointForObjectLambdaResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetAccessPointForObjectLambdaResult] (val x: Self) extends AnyVal {
    
    inline def setCreationDate(value: js.Date): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    inline def setName(value: ObjectLambdaAccessPointName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setPublicAccessBlockConfiguration(value: PublicAccessBlockConfiguration): Self = StObject.set(x, "PublicAccessBlockConfiguration", value.asInstanceOf[js.Any])
    
    inline def setPublicAccessBlockConfigurationUndefined: Self = StObject.set(x, "PublicAccessBlockConfiguration", js.undefined)
  }
}
