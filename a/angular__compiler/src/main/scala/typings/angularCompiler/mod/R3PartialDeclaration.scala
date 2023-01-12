package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait R3PartialDeclaration extends StObject {
  
  /**
    * The minimum version of the compiler that can process this partial declaration.
    */
  var minVersion: String
  
  /**
    * A reference to the `@angular/core` ES module, which allows access
    * to all Angular exports, including Ivy instructions.
    */
  var ngImport: Expression
  
  /**
    * Reference to the decorated class, which is subject to this partial declaration.
    */
  var `type`: Expression
  
  /**
    * Version number of the Angular compiler that was used to compile this declaration. The linker
    * will be able to detect which version a library is using and interpret its metadata accordingly.
    */
  var version: String
}
object R3PartialDeclaration {
  
  inline def apply(minVersion: String, ngImport: Expression, `type`: Expression, version: String): R3PartialDeclaration = {
    val __obj = js.Dynamic.literal(minVersion = minVersion.asInstanceOf[js.Any], ngImport = ngImport.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3PartialDeclaration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: R3PartialDeclaration] (val x: Self) extends AnyVal {
    
    inline def setMinVersion(value: String): Self = StObject.set(x, "minVersion", value.asInstanceOf[js.Any])
    
    inline def setNgImport(value: Expression): Self = StObject.set(x, "ngImport", value.asInstanceOf[js.Any])
    
    inline def setType(value: Expression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
