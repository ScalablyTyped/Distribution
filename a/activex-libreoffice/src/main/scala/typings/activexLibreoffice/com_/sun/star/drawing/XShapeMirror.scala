package typings.activexLibreoffice.com_.sun.star.drawing

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Objects implementing this interface can be used to mirror {@link Shapes} .
  * @deprecated Deprecated
  */
trait XShapeMirror
  extends StObject
     with XInterface {
  
  /** mirrors the given {@link Shapes} at the given axis. */
  def mirror(aShapes: js.Array[XShapes], eAxis: MirrorAxis): Unit
  
  /** mirrors the given {@link Shapes} at the given axis. */
  def mirrorAtAxis(aShapes: js.Array[XShapes], aLine: XShape): Unit
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
  implicit class XShapeMirrorMutableBuilder[Self <: XShapeMirror] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMirror(value: (js.Array[XShapes], MirrorAxis) => Unit): Self = StObject.set(x, "mirror", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMirrorAtAxis(value: (js.Array[XShapes], XShape) => Unit): Self = StObject.set(x, "mirrorAtAxis", js.Any.fromFunction2(value))
  }
}
