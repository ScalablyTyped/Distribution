package typings.awsSdk.clientsCodebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetProjectsInput extends StObject {
  
  /**
    * The names or ARNs of the build projects. To get information about a project shared with your Amazon Web Services account, its ARN must be specified. You cannot specify a shared project using its name.
    */
  var names: ProjectNames
}
object BatchGetProjectsInput {
  
  inline def apply(names: ProjectNames): BatchGetProjectsInput = {
    val __obj = js.Dynamic.literal(names = names.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetProjectsInput]
  }
  
  extension [Self <: BatchGetProjectsInput](x: Self) {
    
    inline def setNames(value: ProjectNames): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    inline def setNamesVarargs(value: NonEmptyString*): Self = StObject.set(x, "names", js.Array(value*))
  }
}
