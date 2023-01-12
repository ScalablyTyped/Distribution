package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait R3DeclarePipeMetadata
  extends StObject
     with R3PartialDeclaration {
  
  /**
    * Whether the pipe is standalone.
    *
    * Default: false.
    */
  var isStandalone: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name to use in templates to refer to this pipe.
    */
  var name: String
  
  /**
    * Whether this pipe is "pure".
    *
    * A pure pipe's `transform()` method is only invoked when its input arguments change.
    *
    * Default: true.
    */
  var pure: js.UndefOr[Boolean] = js.undefined
}
object R3DeclarePipeMetadata {
  
  inline def apply(minVersion: String, name: String, ngImport: Expression, `type`: Expression, version: String): R3DeclarePipeMetadata = {
    val __obj = js.Dynamic.literal(minVersion = minVersion.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ngImport = ngImport.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3DeclarePipeMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: R3DeclarePipeMetadata] (val x: Self) extends AnyVal {
    
    inline def setIsStandalone(value: Boolean): Self = StObject.set(x, "isStandalone", value.asInstanceOf[js.Any])
    
    inline def setIsStandaloneUndefined: Self = StObject.set(x, "isStandalone", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPure(value: Boolean): Self = StObject.set(x, "pure", value.asInstanceOf[js.Any])
    
    inline def setPureUndefined: Self = StObject.set(x, "pure", js.undefined)
  }
}
