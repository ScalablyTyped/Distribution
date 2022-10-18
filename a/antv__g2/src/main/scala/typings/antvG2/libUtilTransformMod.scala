package typings.antvG2

import typings.antvGBase.libInterfacesMod.IElement
import typings.antvGBase.libInterfacesMod.IGroup
import typings.antvGBase.libInterfacesMod.IShape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilTransformMod {
  
  @JSImport("@antv/g2/lib/util/transform", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getIdentityMatrix(): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getIdentityMatrix")().asInstanceOf[js.Array[Double]]
  
  inline def getRotateMatrix(element: IElement, rotateRadian: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getRotateMatrix")(element.asInstanceOf[js.Any], rotateRadian.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def rotate(element: IGroup, rotateRadian: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rotate")(element.asInstanceOf[js.Any], rotateRadian.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def rotate(element: IShape, rotateRadian: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rotate")(element.asInstanceOf[js.Any], rotateRadian.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def transform(m: js.Array[Double], actions: js.Array[js.Array[Any]]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(m.asInstanceOf[js.Any], actions.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def translate(element: IGroup, x: Double, y: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("translate")(element.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def translate(element: IShape, x: Double, y: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("translate")(element.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def zoom(element: IGroup, ratio: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("zoom")(element.asInstanceOf[js.Any], ratio.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def zoom(element: IShape, ratio: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("zoom")(element.asInstanceOf[js.Any], ratio.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
