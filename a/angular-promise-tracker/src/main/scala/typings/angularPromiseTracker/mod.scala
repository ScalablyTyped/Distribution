package typings.angularPromiseTracker

import typings.angular.mod.IDeferred
import typings.angular.mod.IPromise
import typings.angularPromiseTracker.mod.promisetracker.PromiseTracker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  @js.native
  trait IRequestShortcutConfig extends StObject {
    
    var tracker: js.UndefOr[PromiseTracker | js.Array[PromiseTracker]] = js.native
  }
  object IRequestShortcutConfig {
    
    @scala.inline
    def apply(): IRequestShortcutConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IRequestShortcutConfig]
    }
    
    @scala.inline
    implicit class IRequestShortcutConfigMutableBuilder[Self <: IRequestShortcutConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTracker(value: PromiseTracker | js.Array[PromiseTracker]): Self = StObject.set(x, "tracker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackerUndefined: Self = StObject.set(x, "tracker", js.undefined)
      
      @scala.inline
      def setTrackerVarargs(value: PromiseTracker*): Self = StObject.set(x, "tracker", js.Array(value :_*))
    }
  }
  
  object promisetracker {
    
    @js.native
    trait PromiseTracker extends StObject {
      
      def active(): Boolean = js.native
      
      def addPromise[T](promise: IPromise[T]): IDeferred[Unit] = js.native
      
      def cancel(): Unit = js.native
      
      def createPromise(): IDeferred[Unit] = js.native
      
      def tracking(): Boolean = js.native
      
      def trackingCount(): Double = js.native
    }
    object PromiseTracker {
      
      @scala.inline
      def apply(
        active: () => Boolean,
        addPromise: IPromise[js.Any] => IDeferred[Unit],
        cancel: () => Unit,
        createPromise: () => IDeferred[Unit],
        tracking: () => Boolean,
        trackingCount: () => Double
      ): PromiseTracker = {
        val __obj = js.Dynamic.literal(active = js.Any.fromFunction0(active), addPromise = js.Any.fromFunction1(addPromise), cancel = js.Any.fromFunction0(cancel), createPromise = js.Any.fromFunction0(createPromise), tracking = js.Any.fromFunction0(tracking), trackingCount = js.Any.fromFunction0(trackingCount))
        __obj.asInstanceOf[PromiseTracker]
      }
      
      @scala.inline
      implicit class PromiseTrackerMutableBuilder[Self <: PromiseTracker] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setActive(value: () => Boolean): Self = StObject.set(x, "active", js.Any.fromFunction0(value))
        
        @scala.inline
        def setAddPromise(value: IPromise[js.Any] => IDeferred[Unit]): Self = StObject.set(x, "addPromise", js.Any.fromFunction1(value))
        
        @scala.inline
        def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
        
        @scala.inline
        def setCreatePromise(value: () => IDeferred[Unit]): Self = StObject.set(x, "createPromise", js.Any.fromFunction0(value))
        
        @scala.inline
        def setTracking(value: () => Boolean): Self = StObject.set(x, "tracking", js.Any.fromFunction0(value))
        
        @scala.inline
        def setTrackingCount(value: () => Double): Self = StObject.set(x, "trackingCount", js.Any.fromFunction0(value))
      }
    }
    
    @js.native
    trait PromiseTrackerOptions extends StObject {
      
      var activationDelay: js.UndefOr[Double] = js.native
      
      var minDuration: js.UndefOr[Double] = js.native
    }
    object PromiseTrackerOptions {
      
      @scala.inline
      def apply(): PromiseTrackerOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PromiseTrackerOptions]
      }
      
      @scala.inline
      implicit class PromiseTrackerOptionsMutableBuilder[Self <: PromiseTrackerOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setActivationDelay(value: Double): Self = StObject.set(x, "activationDelay", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setActivationDelayUndefined: Self = StObject.set(x, "activationDelay", js.undefined)
        
        @scala.inline
        def setMinDuration(value: Double): Self = StObject.set(x, "minDuration", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMinDurationUndefined: Self = StObject.set(x, "minDuration", js.undefined)
      }
    }
    
    type PromiseTrackerService = js.Function1[/* options */ js.UndefOr[PromiseTrackerOptions], PromiseTracker]
  }
}
