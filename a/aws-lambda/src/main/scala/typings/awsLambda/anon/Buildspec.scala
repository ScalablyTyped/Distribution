package typings.awsLambda.anon

import typings.awsLambda.codebuildCloudwatchStateMod.CodeBuildSourceLocationType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Buildspec extends StObject {
  
  var buildspec: String
  
  var location: String
  
  var `type`: CodeBuildSourceLocationType
}
object Buildspec {
  
  inline def apply(buildspec: String, location: String, `type`: CodeBuildSourceLocationType): Buildspec = {
    val __obj = js.Dynamic.literal(buildspec = buildspec.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Buildspec]
  }
  
  extension [Self <: Buildspec](x: Self) {
    
    inline def setBuildspec(value: String): Self = StObject.set(x, "buildspec", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setType(value: CodeBuildSourceLocationType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
