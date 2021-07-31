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
    
    def trackElement(target: js.Any, source: js.Any): Unit
    
    def untrackElement(target: js.Any, source: js.Any): Unit
  }
  object IScrollspy {
    
    @scala.inline
    def apply(
      activate: Double => Unit,
      checkOffsets: () => Unit,
      trackElement: (js.Any, js.Any) => Unit,
      untrackElement: (js.Any, js.Any) => Unit
    ): IScrollspy = {
      val __obj = js.Dynamic.literal(activate = js.Any.fromFunction1(activate), checkOffsets = js.Any.fromFunction0(checkOffsets), trackElement = js.Any.fromFunction2(trackElement), untrackElement = js.Any.fromFunction2(untrackElement))
      __obj.asInstanceOf[IScrollspy]
    }
    
    @scala.inline
    implicit class IScrollspyMutableBuilder[Self <: IScrollspy] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActivate(value: Double => Unit): Self = StObject.set(x, "activate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCheckOffsets(value: () => Unit): Self = StObject.set(x, "checkOffsets", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTrackElement(value: (js.Any, js.Any) => Unit): Self = StObject.set(x, "trackElement", js.Any.fromFunction2(value))
      
      @scala.inline
      def setUntrackElement(value: (js.Any, js.Any) => Unit): Self = StObject.set(x, "untrackElement", js.Any.fromFunction2(value))
    }
  }
  
  trait IScrollspyOptions extends StObject {
    
    var offset: js.UndefOr[Double] = js.undefined
    
    var target: js.UndefOr[String] = js.undefined
  }
  object IScrollspyOptions {
    
    @scala.inline
    def apply(): IScrollspyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IScrollspyOptions]
    }
    
    @scala.inline
    implicit class IScrollspyOptionsMutableBuilder[Self <: IScrollspyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  trait IScrollspyProvider extends StObject {
    
    var defaults: IScrollspyOptions
  }
  object IScrollspyProvider {
    
    @scala.inline
    def apply(defaults: IScrollspyOptions): IScrollspyProvider = {
      val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any])
      __obj.asInstanceOf[IScrollspyProvider]
    }
    
    @scala.inline
    implicit class IScrollspyProviderMutableBuilder[Self <: IScrollspyProvider] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaults(value: IScrollspyOptions): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
    }
  }
  
  type IScrollspyService = js.Function2[/* element */ IAugmentedJQuery, /* options */ IScrollspyOptions, IScrollspy]
}
