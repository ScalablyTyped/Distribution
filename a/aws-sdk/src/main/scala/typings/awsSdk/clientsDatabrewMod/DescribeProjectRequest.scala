package typings.awsSdk.clientsDatabrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeProjectRequest extends StObject {
  
  /**
    * The name of the project to be described.
    */
  var Name: ProjectName
}
object DescribeProjectRequest {
  
  inline def apply(Name: ProjectName): DescribeProjectRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeProjectRequest]
  }
  
  extension [Self <: DescribeProjectRequest](x: Self) {
    
    inline def setName(value: ProjectName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
