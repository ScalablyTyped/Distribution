package typings.activexLibreoffice.com_.sun.star.chart

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** is a service for diagrams that support the capability to render themselves as three-dimensional diagrams as well as two-dimensional ones. */
@js.native
trait Dim3DDiagram
  extends X3DDisplay
     with X3DDefaultSetter {
  
  /** If set to `TRUE` , the chart becomes a three-dimensional chart. Otherwise it is two-dimensional. */
  var Dim3D: Boolean = js.native
  
  /** Perspective of 3D charts ( [0,100] ). */
  var Perspective: Double = js.native
  
  /** Horizontal rotation of 3D charts in degrees ( ]-180,180] ). */
  var RotationHorizontal: Double = js.native
  
  /** Vertical rotation of 3D charts in degrees ( ]-180,180] ). */
  var RotationVertical: Double = js.native
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
  implicit class Dim3DDiagramOps[Self <: Dim3DDiagram] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDim3D(value: Boolean): Self = this.set("Dim3D", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerspective(value: Double): Self = this.set("Perspective", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotationHorizontal(value: Double): Self = this.set("RotationHorizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotationVertical(value: Double): Self = this.set("RotationVertical", value.asInstanceOf[js.Any])
  }
}
