package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerScale[BaseToken] extends StObject {
  
  var container: GutterSpacingToken[BaseToken]
  
  var scale: `050`[BaseToken]
}
object ContainerScale {
  
  inline def apply[BaseToken](container: GutterSpacingToken[BaseToken], scale: `050`[BaseToken]): ContainerScale[BaseToken] = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerScale[BaseToken]]
  }
  
  extension [Self <: ContainerScale[?], BaseToken](x: Self & ContainerScale[BaseToken]) {
    
    inline def setContainer(value: GutterSpacingToken[BaseToken]): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setScale(value: `050`[BaseToken]): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
  }
}
