package typings.awsSdk.clientsCodecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceFileSpecifier extends StObject {
  
  /**
    * The full path to the file, including the name of the file.
    */
  var filePath: Path
  
  /**
    * Whether to remove the source file from the parent commit.
    */
  var isMove: js.UndefOr[IsMove] = js.undefined
}
object SourceFileSpecifier {
  
  inline def apply(filePath: Path): SourceFileSpecifier = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceFileSpecifier]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SourceFileSpecifier] (val x: Self) extends AnyVal {
    
    inline def setFilePath(value: Path): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    inline def setIsMove(value: IsMove): Self = StObject.set(x, "isMove", value.asInstanceOf[js.Any])
    
    inline def setIsMoveUndefined: Self = StObject.set(x, "isMove", js.undefined)
  }
}
