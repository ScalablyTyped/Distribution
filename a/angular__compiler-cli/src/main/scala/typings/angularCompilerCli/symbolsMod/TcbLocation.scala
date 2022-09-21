package typings.angularCompilerCli.symbolsMod

import typings.angularCompilerCli.srcTypesMod.AbsoluteFsPath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TcbLocation extends StObject {
  
  /**
    * Whether the type check block exists in a type-checking shim file or is inline.
    */
  var isShimFile: Boolean
  
  /** The location in the file where node appears. */
  var positionInFile: Double
  
  /**
    * The fully qualified path of the file which contains the generated TypeScript type check
    * code for the component's template.
    */
  var tcbPath: AbsoluteFsPath
}
object TcbLocation {
  
  inline def apply(isShimFile: Boolean, positionInFile: Double, tcbPath: AbsoluteFsPath): TcbLocation = {
    val __obj = js.Dynamic.literal(isShimFile = isShimFile.asInstanceOf[js.Any], positionInFile = positionInFile.asInstanceOf[js.Any], tcbPath = tcbPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[TcbLocation]
  }
  
  extension [Self <: TcbLocation](x: Self) {
    
    inline def setIsShimFile(value: Boolean): Self = StObject.set(x, "isShimFile", value.asInstanceOf[js.Any])
    
    inline def setPositionInFile(value: Double): Self = StObject.set(x, "positionInFile", value.asInstanceOf[js.Any])
    
    inline def setTcbPath(value: AbsoluteFsPath): Self = StObject.set(x, "tcbPath", value.asInstanceOf[js.Any])
  }
}
