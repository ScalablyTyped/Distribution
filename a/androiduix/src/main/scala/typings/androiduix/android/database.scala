package typings.androiduix.android

import typings.androiduix.java_.util.ArrayList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object database {
  
  @js.native
  trait DataSetObservable extends Observable[DataSetObserver] {
    
    def notifyChanged(): Unit = js.native
    
    def notifyInvalidated(): Unit = js.native
  }
  object DataSetObservable {
    
    @scala.inline
    def apply(
      mObservers: ArrayList[DataSetObserver],
      notifyChanged: () => Unit,
      notifyInvalidated: () => Unit,
      registerObserver: DataSetObserver => Unit,
      unregisterAll: () => Unit,
      unregisterObserver: DataSetObserver => Unit
    ): DataSetObservable = {
      val __obj = js.Dynamic.literal(mObservers = mObservers.asInstanceOf[js.Any], notifyChanged = js.Any.fromFunction0(notifyChanged), notifyInvalidated = js.Any.fromFunction0(notifyInvalidated), registerObserver = js.Any.fromFunction1(registerObserver), unregisterAll = js.Any.fromFunction0(unregisterAll), unregisterObserver = js.Any.fromFunction1(unregisterObserver))
      __obj.asInstanceOf[DataSetObservable]
    }
    
    @scala.inline
    implicit class DataSetObservableMutableBuilder[Self <: DataSetObservable] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNotifyChanged(value: () => Unit): Self = StObject.set(x, "notifyChanged", js.Any.fromFunction0(value))
      
      @scala.inline
      def setNotifyInvalidated(value: () => Unit): Self = StObject.set(x, "notifyInvalidated", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait DataSetObserver extends StObject {
    
    def onChanged(): Unit = js.native
    
    def onInvalidated(): Unit = js.native
  }
  object DataSetObserver {
    
    @scala.inline
    def apply(onChanged: () => Unit, onInvalidated: () => Unit): DataSetObserver = {
      val __obj = js.Dynamic.literal(onChanged = js.Any.fromFunction0(onChanged), onInvalidated = js.Any.fromFunction0(onInvalidated))
      __obj.asInstanceOf[DataSetObserver]
    }
    
    @scala.inline
    implicit class DataSetObserverMutableBuilder[Self <: DataSetObserver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnChanged(value: () => Unit): Self = StObject.set(x, "onChanged", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnInvalidated(value: () => Unit): Self = StObject.set(x, "onInvalidated", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait Observable[T] extends StObject {
    
    var mObservers: ArrayList[T] = js.native
    
    def registerObserver(observer: T): Unit = js.native
    
    def unregisterAll(): Unit = js.native
    
    def unregisterObserver(observer: T): Unit = js.native
  }
  object Observable {
    
    @scala.inline
    def apply[T](
      mObservers: ArrayList[T],
      registerObserver: T => Unit,
      unregisterAll: () => Unit,
      unregisterObserver: T => Unit
    ): Observable[T] = {
      val __obj = js.Dynamic.literal(mObservers = mObservers.asInstanceOf[js.Any], registerObserver = js.Any.fromFunction1(registerObserver), unregisterAll = js.Any.fromFunction0(unregisterAll), unregisterObserver = js.Any.fromFunction1(unregisterObserver))
      __obj.asInstanceOf[Observable[T]]
    }
    
    @scala.inline
    implicit class ObservableMutableBuilder[Self <: Observable[_], T] (val x: Self with Observable[T]) extends AnyVal {
      
      @scala.inline
      def setMObservers(value: ArrayList[T]): Self = StObject.set(x, "mObservers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegisterObserver(value: T => Unit): Self = StObject.set(x, "registerObserver", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUnregisterAll(value: () => Unit): Self = StObject.set(x, "unregisterAll", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUnregisterObserver(value: T => Unit): Self = StObject.set(x, "unregisterObserver", js.Any.fromFunction1(value))
    }
  }
}
