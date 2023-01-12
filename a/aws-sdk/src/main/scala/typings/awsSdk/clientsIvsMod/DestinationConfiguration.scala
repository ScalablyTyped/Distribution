package typings.awsSdk.clientsIvsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DestinationConfiguration extends StObject {
  
  /**
    * An S3 destination configuration where recorded videos will be stored.
    */
  var s3: js.UndefOr[S3DestinationConfiguration] = js.undefined
}
object DestinationConfiguration {
  
  inline def apply(): DestinationConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DestinationConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DestinationConfiguration] (val x: Self) extends AnyVal {
    
    inline def setS3(value: S3DestinationConfiguration): Self = StObject.set(x, "s3", value.asInstanceOf[js.Any])
    
    inline def setS3Undefined: Self = StObject.set(x, "s3", js.undefined)
  }
}
