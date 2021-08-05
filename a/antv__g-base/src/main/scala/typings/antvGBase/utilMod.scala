package typings.antvGBase

import typings.antvGBase.interfacesMod.IShape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("@antv/g-base/lib/bbox/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mergeArrowBBox(shape: IShape, bbox: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeArrowBBox")(shape.asInstanceOf[js.Any], bbox.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def mergeBBox(bbox1: js.Any, bbox2: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeBBox")(bbox1.asInstanceOf[js.Any], bbox2.asInstanceOf[js.Any])).asInstanceOf[js.Any]
}
