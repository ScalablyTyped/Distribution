package typings.angularStrap.mgcrea.ngStrap

import typings.angular.mod.IAugmentedJQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

///////////////////////////////////////////////////////////////////////////
// Scrollspy
// see http://mgcrea.github.io/angular-strap/#/scrollspy
///////////////////////////////////////////////////////////////////////////
object scrollspy {
  
  trait IScrollspy extends StObject {
    
    def activate(index: Double): Unit
    
    def checkOffsets(): Unit
    
    def trackElement(target: Any, source: Any): Unit
    
    def untrackElement(target: Any, source: Any): Unit
  }
  object IScrollspy {
    
    inline def apply(
      activate: Double => Unit,
      checkOffsets: () => Unit,
      trackElement: (Any, Any) => Unit,
      untrackElement: (Any, Any) => Unit
    ): IScrollspy = {
      val __obj = js.Dynamic.literal(activate = js.Any.fromFunction1(activate), checkOffsets = js.Any.fromFunction0(checkOffsets), trackElement = js.Any.fromFunction2(trackElement), untrackElement = js.Any.fromFunction2(untrackElement))
      __obj.asInstanceOf[IScrollspy]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IScrollspy] (val x: Self) extends AnyVal {
      
      inline def setActivate(value: Double => Unit): Self = StObject.set(x, "activate", js.Any.fromFunction1(value))
      
      inline def setCheckOffsets(value: () => Unit): Self = StObject.set(x, "checkOffsets", js.Any.fromFunction0(value))
      
      inline def setTrackElement(value: (Any, Any) => Unit): Self = StObject.set(x, "trackElement", js.Any.fromFunction2(value))
      
      inline def setUntrackElement(value: (Any, Any) => Unit): Self = StObject.set(x, "untrackElement", js.Any.fromFunction2(value))
    }
  }
  
  trait IScrollspyOptions extends StObject {
    
    var offset: js.UndefOr[Double] = js.undefined
    
    var target: js.UndefOr[String] = js.undefined
  }
  object IScrollspyOptions {
    
    inline def apply(): IScrollspyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IScrollspyOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IScrollspyOptions] (val x: Self) extends AnyVal {
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  trait IScrollspyProvider extends StObject {
    
    var defaults: IScrollspyOptions
  }
  object IScrollspyProvider {
    
    inline def apply(defaults: IScrollspyOptions): IScrollspyProvider = {
      val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any])
      __obj.asInstanceOf[IScrollspyProvider]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IScrollspyProvider] (val x: Self) extends AnyVal {
      
      inline def setDefaults(value: IScrollspyOptions): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
    }
  }
  
  type IScrollspyService = js.Function2[/* element */ IAugmentedJQuery, /* options */ IScrollspyOptions, IScrollspy]
}
