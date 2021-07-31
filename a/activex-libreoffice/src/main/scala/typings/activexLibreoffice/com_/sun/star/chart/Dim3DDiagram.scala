package typings.activexLibreoffice.com_.sun.star.chart

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** is a service for diagrams that support the capability to render themselves as three-dimensional diagrams as well as two-dimensional ones. */
trait Dim3DDiagram
  extends StObject
     with X3DDisplay
     with X3DDefaultSetter {
  
  /** If set to `TRUE` , the chart becomes a three-dimensional chart. Otherwise it is two-dimensional. */
  var Dim3D: Boolean
  
  /** Perspective of 3D charts ( [0,100] ). */
  var Perspective: Double
  
  /** Horizontal rotation of 3D charts in degrees ( ]-180,180] ). */
  var RotationHorizontal: Double
  
  /** Vertical rotation of 3D charts in degrees ( ]-180,180] ). */
  var RotationVertical: Double
}
object Dim3DDiagram {
  
  @scala.inline
  def apply(
    Dim3D: Boolean,
    Floor: XPropertySet,
    Perspective: Double,
    RotationHorizontal: Double,
    RotationVertical: Double,
    Wall: XPropertySet,
    acquire: () => Unit,
    getFloor: () => XPropertySet,
    getWall: () => XPropertySet,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    set3DSettingsToDefault: () => Unit,
    setDefaultIllumination: () => Unit,
    setDefaultRotation: () => Unit
  ): Dim3DDiagram = {
    val __obj = js.Dynamic.literal(Dim3D = Dim3D.asInstanceOf[js.Any], Floor = Floor.asInstanceOf[js.Any], Perspective = Perspective.asInstanceOf[js.Any], RotationHorizontal = RotationHorizontal.asInstanceOf[js.Any], RotationVertical = RotationVertical.asInstanceOf[js.Any], Wall = Wall.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getFloor = js.Any.fromFunction0(getFloor), getWall = js.Any.fromFunction0(getWall), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), set3DSettingsToDefault = js.Any.fromFunction0(set3DSettingsToDefault), setDefaultIllumination = js.Any.fromFunction0(setDefaultIllumination), setDefaultRotation = js.Any.fromFunction0(setDefaultRotation))
    __obj.asInstanceOf[Dim3DDiagram]
  }
  
  @scala.inline
  implicit class Dim3DDiagramMutableBuilder[Self <: Dim3DDiagram] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDim3D(value: Boolean): Self = StObject.set(x, "Dim3D", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerspective(value: Double): Self = StObject.set(x, "Perspective", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotationHorizontal(value: Double): Self = StObject.set(x, "RotationHorizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotationVertical(value: Double): Self = StObject.set(x, "RotationVertical", value.asInstanceOf[js.Any])
  }
}
