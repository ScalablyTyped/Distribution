package typings.antvGLite

import typings.antvGLite.distDomInterfacesMod.IElement
import typings.manaSyringe.mod.Syringe.DefinedToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServicesSceneGraphSelectorMod {
  
  @JSImport("@antv/g-lite/dist/services/SceneGraphSelector", "DefaultSceneGraphSelector")
  @js.native
  open class DefaultSceneGraphSelector ()
    extends StObject
       with SceneGraphSelector {
    
    /* private */ var attributeToString: Any = js.native
    
    /* private */ var getAttribute: Any = js.native
    
    /* private */ var getIdOrClassname: Any = js.native
    
    /* CompleteClass */
    override def is[T /* <: IElement[Any, Any] */](query: String, element: T): Boolean = js.native
    
    /* CompleteClass */
    override def selectAll[R /* <: IElement[Any, Any] */, T /* <: IElement[Any, Any] */](query: String, root: R): js.Array[T] = js.native
    
    /* CompleteClass */
    override def selectOne[R /* <: IElement[Any, Any] */, T /* <: IElement[Any, Any] */](query: String, root: R): T | Null = js.native
  }
  
  trait SceneGraphSelector extends StObject {
    
    def is[T /* <: IElement[Any, Any] */](query: String, element: T): Boolean
    
    def selectAll[R /* <: IElement[Any, Any] */, T /* <: IElement[Any, Any] */](query: String, root: R): js.Array[T]
    
    def selectOne[R /* <: IElement[Any, Any] */, T /* <: IElement[Any, Any] */](query: String, root: R): T | Null
  }
  object SceneGraphSelector {
    
    @JSImport("@antv/g-lite/dist/services/SceneGraphSelector", "SceneGraphSelector")
    @js.native
    val ^ : DefinedToken = js.native
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SceneGraphSelector] (val x: Self) extends AnyVal {
      
      inline def setIs(value: (String, Any) => Boolean): Self = StObject.set(x, "is", js.Any.fromFunction2(value))
      
      inline def setSelectAll(value: (String, Any) => js.Array[Any]): Self = StObject.set(x, "selectAll", js.Any.fromFunction2(value))
      
      inline def setSelectOne(value: (String, Any) => Any | Null): Self = StObject.set(x, "selectOne", js.Any.fromFunction2(value))
    }
  }
  
  @JSImport("@antv/g-lite/dist/services/SceneGraphSelector", "SceneGraphSelectorFactory")
  @js.native
  val SceneGraphSelectorFactory: DefinedToken = js.native
}
