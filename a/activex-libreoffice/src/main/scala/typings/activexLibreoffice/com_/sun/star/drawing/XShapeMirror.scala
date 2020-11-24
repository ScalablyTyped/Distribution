package typings.activexLibreoffice.com_.sun.star.drawing

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Objects implementing this interface can be used to mirror {@link Shapes} .
  * @deprecated Deprecated
  */
@js.native
trait XShapeMirror extends XInterface {
  
  /** mirrors the given {@link Shapes} at the given axis. */
  def mirror(aShapes: js.Array[XShapes], eAxis: MirrorAxis): Unit = js.native
  
  /** mirrors the given {@link Shapes} at the given axis. */
  def mirrorAtAxis(aShapes: js.Array[XShapes], aLine: XShape): Unit = js.native
}
object XShapeMirror {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    mirror: (js.Array[XShapes], MirrorAxis) => Unit,
    mirrorAtAxis: (js.Array[XShapes], XShape) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XShapeMirror = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), mirror = js.Any.fromFunction2(mirror), mirrorAtAxis = js.Any.fromFunction2(mirrorAtAxis), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XShapeMirror]
  }
  
  @scala.inline
  implicit class XShapeMirrorOps[Self <: XShapeMirror] (val x: Self) extends AnyVal {
    
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
    def setMirror(value: (js.Array[XShapes], MirrorAxis) => Unit): Self = this.set("mirror", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMirrorAtAxis(value: (js.Array[XShapes], XShape) => Unit): Self = this.set("mirrorAtAxis", js.Any.fromFunction2(value))
  }
}
