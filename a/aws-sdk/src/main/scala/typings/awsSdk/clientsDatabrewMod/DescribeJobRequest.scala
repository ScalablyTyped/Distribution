package typings.awsSdk.clientsDatabrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeJobRequest extends StObject {
  
  /**
    * The name of the job to be described.
    */
  var Name: JobName
}
object DescribeJobRequest {
  
  inline def apply(Name: JobName): DescribeJobRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeJobRequest]
  }
  
  extension [Self <: DescribeJobRequest](x: Self) {
    
    inline def setName(value: JobName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
