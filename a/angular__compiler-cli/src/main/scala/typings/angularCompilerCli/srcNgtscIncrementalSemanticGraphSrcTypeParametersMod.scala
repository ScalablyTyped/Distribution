package typings.angularCompilerCli

import typings.angularCompilerCli.anon.ClassDeclarationDeclarati
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscIncrementalSemanticGraphSrcTypeParametersMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/incremental/semantic_graph/src/type_parameters", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def areTypeParametersEqual(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("areTypeParametersEqual")().asInstanceOf[Boolean]
  inline def areTypeParametersEqual(current: js.Array[SemanticTypeParameter]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("areTypeParametersEqual")(current.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def areTypeParametersEqual(current: js.Array[SemanticTypeParameter], previous: js.Array[SemanticTypeParameter]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("areTypeParametersEqual")(current.asInstanceOf[js.Any], previous.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def areTypeParametersEqual(current: Null, previous: js.Array[SemanticTypeParameter]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("areTypeParametersEqual")(current.asInstanceOf[js.Any], previous.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def extractSemanticTypeParameters(node: ClassDeclarationDeclarati): js.Array[SemanticTypeParameter] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("extractSemanticTypeParameters")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[SemanticTypeParameter] | Null]
  
  trait SemanticTypeParameter extends StObject {
    
    /**
      * Whether a type constraint, i.e. an `extends` clause is present on the type parameter.
      */
    var hasGenericTypeBound: Boolean
  }
  object SemanticTypeParameter {
    
    inline def apply(hasGenericTypeBound: Boolean): SemanticTypeParameter = {
      val __obj = js.Dynamic.literal(hasGenericTypeBound = hasGenericTypeBound.asInstanceOf[js.Any])
      __obj.asInstanceOf[SemanticTypeParameter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SemanticTypeParameter] (val x: Self) extends AnyVal {
      
      inline def setHasGenericTypeBound(value: Boolean): Self = StObject.set(x, "hasGenericTypeBound", value.asInstanceOf[js.Any])
    }
  }
}
