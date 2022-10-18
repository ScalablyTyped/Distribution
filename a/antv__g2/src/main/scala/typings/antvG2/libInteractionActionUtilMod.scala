package typings.antvG2

import typings.antvG2.libChartViewMod.View
import typings.antvG2.libGeometryElementMod.default
import typings.antvG2.libInterfaceMod.IInteractionContext
import typings.antvG2.libInterfaceMod.LooseObject
import typings.antvGBase.libTypesMod.BBox
import typings.antvGBase.libTypesMod.PathCommand
import typings.antvGBase.libTypesMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libInteractionActionUtilMod {
  
  @JSImport("@antv/g2/lib/interaction/action/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def distance(p1: Point, p2: Point): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distance")(p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getComponents(view: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getComponents")(view.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def getCurrentElement(context: IInteractionContext): default = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentElement")(context.asInstanceOf[js.Any]).asInstanceOf[default]
  
  inline def getDelegationObject(context: IInteractionContext): LooseObject = ^.asInstanceOf[js.Dynamic].applyDynamic("getDelegationObject")(context.asInstanceOf[js.Any]).asInstanceOf[LooseObject]
  
  inline def getElementValue(element: default, field: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementValue")(element.asInstanceOf[js.Any], field.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getElements(view: View): js.Array[default] = ^.asInstanceOf[js.Dynamic].applyDynamic("getElements")(view.asInstanceOf[js.Any]).asInstanceOf[js.Array[default]]
  
  inline def getElementsByField(view: View, field: String, value: Any): js.Array[default] = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementsByField")(view.asInstanceOf[js.Any], field.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Array[default]]
  
  inline def getElementsByPath(view: View, path: js.Array[Any]): js.Array[default] = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementsByPath")(view.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Array[default]]
  
  inline def getElementsByState(view: View, stateName: String): js.Array[default] = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementsByState")(view.asInstanceOf[js.Any], stateName.asInstanceOf[js.Any])).asInstanceOf[js.Array[default]]
  
  inline def getIntersectElements(view: View, box: Any): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getIntersectElements")(view.asInstanceOf[js.Any], box.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def getMaskedElements(context: IInteractionContext, tolerance: Double): js.Array[default] = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaskedElements")(context.asInstanceOf[js.Any], tolerance.asInstanceOf[js.Any])).asInstanceOf[js.Array[default]]
  
  inline def getScaleByField(view: View, field: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getScaleByField")(view.asInstanceOf[js.Any], field.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getSiblingMaskElements(context: IInteractionContext, sibling: View, tolerance: Double): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSiblingMaskElements")(context.asInstanceOf[js.Any], sibling.asInstanceOf[js.Any], tolerance.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def getSiblingPoint(view: View, sibling: View, point: Point): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("getSiblingPoint")(view.asInstanceOf[js.Any], sibling.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[Point]
  
  inline def getSilbings(view: View): js.Array[View] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSilbings")(view.asInstanceOf[js.Any]).asInstanceOf[js.Array[View]]
  
  inline def getSpline(points: js.Array[Point], z: Boolean): js.Array[PathCommand] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSpline")(points.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[js.Array[PathCommand]]
  
  inline def intersectRect(box1: Any, box2: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("intersectRect")(box1.asInstanceOf[js.Any], box2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isElementChange(context: IInteractionContext): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isElementChange")(context.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isInBox(box: BBox, point: Point): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isInBox")(box.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isInRecords(records: js.Array[js.Object], record: js.Object, xFiled: String, yField: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isInRecords")(records.asInstanceOf[js.Any], record.asInstanceOf[js.Any], xFiled.asInstanceOf[js.Any], yField.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isList(delegateObject: LooseObject): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isList")(delegateObject.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isMask(context: IInteractionContext): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMask")(context.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isSlider(delegateObject: LooseObject): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSlider")(delegateObject.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
