package typings.awsSdk.clientsCodestarMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Code extends StObject {
  
  /**
    * The repository to be created in AWS CodeStar. Valid values are AWS CodeCommit or GitHub. After AWS CodeStar provisions the new repository, the source code files provided with the project request are placed in the repository.
    */
  var destination: CodeDestination
  
  /**
    * The location where the source code files provided with the project request are stored. AWS CodeStar retrieves the files during project creation.
    */
  var source: CodeSource
}
object Code {
  
  inline def apply(destination: CodeDestination, source: CodeSource): Code = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Code]
  }
  
  extension [Self <: Code](x: Self) {
    
    inline def setDestination(value: CodeDestination): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setSource(value: CodeSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
