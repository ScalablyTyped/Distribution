package typings.antvG2plot

import typings.antvG2.libInterfaceMod.ShapePoint
import typings.antvG2.mod.Element
import typings.antvG2.mod.Geometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsGeometryMod {
  
  @JSImport("@antv/g2plot/lib/utils/geometry", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def findGeometry(
    view: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify View */ Any,
    `type`: String
  ): Geometry[ShapePoint] = (^.asInstanceOf[js.Dynamic].applyDynamic("findGeometry")(view.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Geometry[ShapePoint]]
  
  inline def getAllElements(
    view: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify View */ Any
  ): js.Array[Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllElements")(view.asInstanceOf[js.Any]).asInstanceOf[js.Array[Element]]
  
  inline def getAllElementsRecursively(
    view: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify View */ Any
  ): js.Array[Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllElementsRecursively")(view.asInstanceOf[js.Any]).asInstanceOf[js.Array[Element]]
  
  inline def getAllGeometriesRecursively(
    view: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify View */ Any
  ): js.Array[Geometry[ShapePoint]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllGeometriesRecursively")(view.asInstanceOf[js.Any]).asInstanceOf[js.Array[Geometry[ShapePoint]]]
}
