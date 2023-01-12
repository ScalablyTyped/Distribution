package typings.awsSdk.clientsHealthlakeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputDataConfig extends StObject {
  
  /**
    * The S3Uri is the user specified S3 location of the FHIR data to be imported into Amazon HealthLake. 
    */
  var S3Uri: js.UndefOr[typings.awsSdk.clientsHealthlakeMod.S3Uri] = js.undefined
}
object InputDataConfig {
  
  inline def apply(): InputDataConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputDataConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InputDataConfig] (val x: Self) extends AnyVal {
    
    inline def setS3Uri(value: S3Uri): Self = StObject.set(x, "S3Uri", value.asInstanceOf[js.Any])
    
    inline def setS3UriUndefined: Self = StObject.set(x, "S3Uri", js.undefined)
  }
}
