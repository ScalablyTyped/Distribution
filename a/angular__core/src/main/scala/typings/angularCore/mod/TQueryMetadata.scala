package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object representing query metadata extracted from query annotations.
  */
@js.native
trait TQueryMetadata extends StObject {
  
  var descendants: Boolean = js.native
  
  var isStatic: Boolean = js.native
  
  var predicate: typings.angularCore.mod.Type[_] | InjectionToken[_] | js.Array[String] = js.native
  
  var read: js.Any = js.native
}
object TQueryMetadata {
  
  @scala.inline
  def apply(
    descendants: Boolean,
    isStatic: Boolean,
    predicate: typings.angularCore.mod.Type[_] | InjectionToken[_] | js.Array[String],
    read: js.Any
  ): TQueryMetadata = {
    val __obj = js.Dynamic.literal(descendants = descendants.asInstanceOf[js.Any], isStatic = isStatic.asInstanceOf[js.Any], predicate = predicate.asInstanceOf[js.Any], read = read.asInstanceOf[js.Any])
    __obj.asInstanceOf[TQueryMetadata]
  }
  
  @scala.inline
  implicit class TQueryMetadataMutableBuilder[Self <: TQueryMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescendants(value: Boolean): Self = StObject.set(x, "descendants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsStatic(value: Boolean): Self = StObject.set(x, "isStatic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPredicate(value: typings.angularCore.mod.Type[_] | InjectionToken[_] | js.Array[String]): Self = StObject.set(x, "predicate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPredicateVarargs(value: String*): Self = StObject.set(x, "predicate", js.Array(value :_*))
    
    @scala.inline
    def setRead(value: js.Any): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
  }
}
