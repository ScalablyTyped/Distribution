package typings.atom

import typings.atom.mod.Disposable
import typings.std.AddEventListenerOptions
import typings.std.EventListenerOptions
import typings.std.EventListenerOrEventListenerObject
import typings.std.HTMLStyleElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcStyleManagerMod {
  
  @js.native
  trait StyleElementObservedEvent
    extends StObject
       with HTMLStyleElement {
    
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    
    var context: String = js.native
    
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
    
    var sourcePath: String = js.native
  }
  
  trait StyleManager extends StObject {
    
    // Reading Style Elements
    /** Get all loaded style elements. */
    def getStyleElements(): js.Array[HTMLStyleElement]
    
    // Paths
    /** Get the path of the user style sheet in ~/.atom. */
    def getUserStyleSheetPath(): String
    
    // Event Subscription
    /** Invoke callback for all current and future style elements. */
    def observeStyleElements(callback: js.Function1[/* styleElement */ StyleElementObservedEvent, Unit]): Disposable
    
    /** Invoke callback when a style element is added. */
    def onDidAddStyleElement(callback: js.Function1[/* styleElement */ StyleElementObservedEvent, Unit]): Disposable
    
    /** Invoke callback when a style element is removed. */
    def onDidRemoveStyleElement(callback: js.Function1[/* styleElement */ HTMLStyleElement, Unit]): Disposable
    
    /** Invoke callback when an existing style element is updated. */
    def onDidUpdateStyleElement(callback: js.Function1[/* styleElement */ StyleElementObservedEvent, Unit]): Disposable
  }
  object StyleManager {
    
    inline def apply(
      getStyleElements: () => js.Array[HTMLStyleElement],
      getUserStyleSheetPath: () => String,
      observeStyleElements: js.Function1[/* styleElement */ StyleElementObservedEvent, Unit] => Disposable,
      onDidAddStyleElement: js.Function1[/* styleElement */ StyleElementObservedEvent, Unit] => Disposable,
      onDidRemoveStyleElement: js.Function1[/* styleElement */ HTMLStyleElement, Unit] => Disposable,
      onDidUpdateStyleElement: js.Function1[/* styleElement */ StyleElementObservedEvent, Unit] => Disposable
    ): StyleManager = {
      val __obj = js.Dynamic.literal(getStyleElements = js.Any.fromFunction0(getStyleElements), getUserStyleSheetPath = js.Any.fromFunction0(getUserStyleSheetPath), observeStyleElements = js.Any.fromFunction1(observeStyleElements), onDidAddStyleElement = js.Any.fromFunction1(onDidAddStyleElement), onDidRemoveStyleElement = js.Any.fromFunction1(onDidRemoveStyleElement), onDidUpdateStyleElement = js.Any.fromFunction1(onDidUpdateStyleElement))
      __obj.asInstanceOf[StyleManager]
    }
    
    extension [Self <: StyleManager](x: Self) {
      
      inline def setGetStyleElements(value: () => js.Array[HTMLStyleElement]): Self = StObject.set(x, "getStyleElements", js.Any.fromFunction0(value))
      
      inline def setGetUserStyleSheetPath(value: () => String): Self = StObject.set(x, "getUserStyleSheetPath", js.Any.fromFunction0(value))
      
      inline def setObserveStyleElements(value: js.Function1[/* styleElement */ StyleElementObservedEvent, Unit] => Disposable): Self = StObject.set(x, "observeStyleElements", js.Any.fromFunction1(value))
      
      inline def setOnDidAddStyleElement(value: js.Function1[/* styleElement */ StyleElementObservedEvent, Unit] => Disposable): Self = StObject.set(x, "onDidAddStyleElement", js.Any.fromFunction1(value))
      
      inline def setOnDidRemoveStyleElement(value: js.Function1[/* styleElement */ HTMLStyleElement, Unit] => Disposable): Self = StObject.set(x, "onDidRemoveStyleElement", js.Any.fromFunction1(value))
      
      inline def setOnDidUpdateStyleElement(value: js.Function1[/* styleElement */ StyleElementObservedEvent, Unit] => Disposable): Self = StObject.set(x, "onDidUpdateStyleElement", js.Any.fromFunction1(value))
    }
  }
}
