package typings.awsSdk.clientsCodepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputArtifact extends StObject {
  
  /**
    * The name of the output of an artifact, such as "My App". The input artifact of an action must exactly match the output artifact declared in a preceding action, but the input artifact does not have to be the next action in strict sequence from the action that provided the output artifact. Actions in parallel can declare different output artifacts, which are in turn consumed by different following actions. Output artifact names must be unique within a pipeline.
    */
  var name: ArtifactName
}
object OutputArtifact {
  
  inline def apply(name: ArtifactName): OutputArtifact = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputArtifact]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OutputArtifact] (val x: Self) extends AnyVal {
    
    inline def setName(value: ArtifactName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
