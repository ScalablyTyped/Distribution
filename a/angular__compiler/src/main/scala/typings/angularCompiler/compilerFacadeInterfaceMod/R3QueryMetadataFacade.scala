package typings.angularCompiler.compilerFacadeInterfaceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait R3QueryMetadataFacade extends StObject {
  
  var descendants: Boolean = js.native
  
  var first: Boolean = js.native
  
  var predicate: js.Any | js.Array[String] = js.native
  
  var propertyName: String = js.native
  
  var read: js.Any | Null = js.native
  
  var static: Boolean = js.native
}
object R3QueryMetadataFacade {
  
  @scala.inline
  def apply(
    descendants: Boolean,
    first: Boolean,
    predicate: js.Any | js.Array[String],
    propertyName: String,
    static: Boolean
  ): R3QueryMetadataFacade = {
    val __obj = js.Dynamic.literal(descendants = descendants.asInstanceOf[js.Any], first = first.asInstanceOf[js.Any], predicate = predicate.asInstanceOf[js.Any], propertyName = propertyName.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3QueryMetadataFacade]
  }
  
  @scala.inline
  implicit class R3QueryMetadataFacadeMutableBuilder[Self <: R3QueryMetadataFacade] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescendants(value: Boolean): Self = StObject.set(x, "descendants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirst(value: Boolean): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPredicate(value: js.Any | js.Array[String]): Self = StObject.set(x, "predicate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPredicateVarargs(value: String*): Self = StObject.set(x, "predicate", js.Array(value :_*))
    
    @scala.inline
    def setPropertyName(value: String): Self = StObject.set(x, "propertyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRead(value: js.Any): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadNull: Self = StObject.set(x, "read", null)
    
    @scala.inline
    def setStatic(value: Boolean): Self = StObject.set(x, "static", value.asInstanceOf[js.Any])
  }
}
