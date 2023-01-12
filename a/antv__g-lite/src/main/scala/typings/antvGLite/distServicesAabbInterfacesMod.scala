package typings.antvGLite

import typings.antvGLite.anon.Depth
import typings.antvGLite.distDisplayObjectsDisplayObjectMod.DisplayObject
import typings.antvGLite.distTypesMod.ParsedBaseStyleProps
import typings.manaSyringe.mod.Syringe.DefinedToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServicesAabbInterfacesMod {
  
  trait GeometryAABBUpdater[T /* <: ParsedBaseStyleProps */] extends StObject {
    
    def update(parsedStyle: T, `object`: DisplayObject[Any, Any]): Depth
  }
  object GeometryAABBUpdater {
    
    @JSImport("@antv/g-lite/dist/services/aabb/interfaces", "GeometryAABBUpdater")
    @js.native
    val ^ : DefinedToken = js.native
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GeometryAABBUpdater[?], T /* <: ParsedBaseStyleProps */] (val x: Self & GeometryAABBUpdater[T]) extends AnyVal {
      
      inline def setUpdate(value: (T, DisplayObject[Any, Any]) => Depth): Self = StObject.set(x, "update", js.Any.fromFunction2(value))
    }
  }
  
  @JSImport("@antv/g-lite/dist/services/aabb/interfaces", "GeometryUpdaterFactory")
  @js.native
  val GeometryUpdaterFactory: DefinedToken = js.native
}
