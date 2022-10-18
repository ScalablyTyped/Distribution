package typings.awsSdk.clientsElasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SolutionStackDescription extends StObject {
  
  /**
    * The permitted file types allowed for a solution stack.
    */
  var PermittedFileTypes: js.UndefOr[SolutionStackFileTypeList] = js.undefined
  
  /**
    * The name of the solution stack.
    */
  var SolutionStackName: js.UndefOr[typings.awsSdk.clientsElasticbeanstalkMod.SolutionStackName] = js.undefined
}
object SolutionStackDescription {
  
  inline def apply(): SolutionStackDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SolutionStackDescription]
  }
  
  extension [Self <: SolutionStackDescription](x: Self) {
    
    inline def setPermittedFileTypes(value: SolutionStackFileTypeList): Self = StObject.set(x, "PermittedFileTypes", value.asInstanceOf[js.Any])
    
    inline def setPermittedFileTypesUndefined: Self = StObject.set(x, "PermittedFileTypes", js.undefined)
    
    inline def setPermittedFileTypesVarargs(value: FileTypeExtension*): Self = StObject.set(x, "PermittedFileTypes", js.Array(value*))
    
    inline def setSolutionStackName(value: SolutionStackName): Self = StObject.set(x, "SolutionStackName", value.asInstanceOf[js.Any])
    
    inline def setSolutionStackNameUndefined: Self = StObject.set(x, "SolutionStackName", js.undefined)
  }
}
