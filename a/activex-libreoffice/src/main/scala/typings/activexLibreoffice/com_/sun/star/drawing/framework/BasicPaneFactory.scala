package typings.activexLibreoffice.com_.sun.star.drawing.framework

import typings.activexLibreoffice.com_.sun.star.frame.XController
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The {@link BasicPaneFactory} is a resource factory that provides the panes used by the Draw and Impress applications.
  *
  * This factory provides the center, left, and right pane. For the left pane there are two URLS, `private:resource/floater/LeftImpressPane` and
  * `private:resource/floater/LeftDrawPane` , one for Impress, the other for Draw. The center pane and the right pane have the URLs
  * `private:resource/floater/CenterPane` and `private:resource/floater/RightPane` respectively.
  *
  * This factory is typically created indirectly by registering it in the configuration and have the {@link XModuleController} create it on demand.
  */
trait BasicPaneFactory
  extends StObject
     with XResourceFactory {
  
  /** Give the controller to new instances so that they have access to the drawing framework controllers. */
  def create(xController: XController): Unit
}
object BasicPaneFactory {
  
  inline def apply(
    create: XController => Unit,
    createResource: XResourceId => XResource,
    releaseResource: XResource => Unit
  ): BasicPaneFactory = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), createResource = js.Any.fromFunction1(createResource), releaseResource = js.Any.fromFunction1(releaseResource))
    __obj.asInstanceOf[BasicPaneFactory]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BasicPaneFactory] (val x: Self) extends AnyVal {
    
    inline def setCreate(value: XController => Unit): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
  }
}
